-- 1. List all clients and their accounts (with currency and balance)
SELECT 
    c.Nombre || ' ' || c.Apellido1 || ' ' || c.Apellido2 AS Cliente,
    cu.NumeroCuenta,
    d.Divisa,
    cu.Saldo
FROM Cliente c
JOIN CuentaCliente cc ON c.IdCliente = cc.FkCliente
JOIN Cuenta cu ON cc.FkCuenta = cu.IdCuenta
JOIN TipoCuenta tc ON cc.FkTipoCuenta = tc.IdTipoCuenta
JOIN Divisa d ON tc.FkDivisa = d.IdDivisa
ORDER BY Cliente;

-- 2. Total balance per currency
SELECT 
    d.Divisa,
    SUM(cu.Saldo) AS TotalBalance
FROM Cuenta cu
JOIN CuentaCliente cc ON cu.IdCuenta = cc.FkCuenta
JOIN TipoCuenta tc ON cc.FkTipoCuenta = tc.IdTipoCuenta
JOIN Divisa d ON tc.FkDivisa = d.IdDivisa
GROUP BY d.Divisa;

-- 3. Top 10 accounts by balance (any currency)
SELECT 
    cu.NumeroCuenta,
    d.Divisa,
    cu.Saldo
FROM Cuenta cu
JOIN CuentaCliente cc ON cu.IdCuenta = cc.FkCuenta
JOIN TipoCuenta tc ON cc.FkTipoCuenta = tc.IdTipoCuenta
JOIN Divisa d ON tc.FkDivisa = d.IdDivisa
ORDER BY cu.Saldo DESC
LIMIT 10;

-- 4. Accounts with more than 1 owner (joint accounts)
SELECT 
    cu.NumeroCuenta,
    COUNT(cc.FkCliente) AS NumeroDeTitulares
FROM Cuenta cu
JOIN CuentaCliente cc ON cu.IdCuenta = cc.FkCuenta
GROUP BY cu.NumeroCuenta
HAVING COUNT(cc.FkCliente) > 1;

-- 5. Transfers between accounts (show sender, receiver, amount)
SELECT 
    t.IdTransaccion,
    t.FechaTransaccion,
    t.ValorTransaccion,
    cuR.NumeroCuenta AS CuentaOrigen,
    cuD.NumeroCuenta AS CuentaDestino
FROM Transaccion t
JOIN Cuenta cuR ON t.FkCuentaRetiro = cuR.IdCuenta
JOIN Cuenta cuD ON t.FkCuentaDeposito = cuD.IdCuenta
WHERE t.FkCuentaRetiro IS NOT NULL AND t.FkCuentaDeposito IS NOT NULL;

-- 6. Number of transactions per account
SELECT 
    cu.NumeroCuenta,
    COUNT(t.IdTransaccion) AS NumeroDeTransacciones
FROM Cuenta cu
LEFT JOIN Transaccion t 
  ON cu.IdCuenta = t.FkCuentaDeposito OR cu.IdCuenta = t.FkCuentaRetiro
GROUP BY cu.NumeroCuenta
ORDER BY NumeroDeTransacciones DESC;

-- 7. Monthly transaction volume (2024–2025)
SELECT 
    YEAR(t.FechaTransaccion) AS Anio,
    MONTH(t.FechaTransaccion) AS Mes,
    SUM(t.ValorTransaccion) AS TotalMes
FROM Transaccion t
GROUP BY YEAR(t.FechaTransaccion), MONTH(t.FechaTransaccion)
ORDER BY Anio, Mes;

-- 8. Couples (Titular + Cotitular) with shared accounts
SELECT 
    cu.NumeroCuenta,
    LISTAGG(c.Nombre || ' ' || c.Apellido1, ', ')
        WITHIN GROUP (ORDER BY c.Apellido1) AS Titulares
FROM Account cu
JOIN CuentaCliente cc ON cu.IdCuenta = cc.FkCuenta
JOIN Cliente c ON cc.FkCliente = c.IdCliente
GROUP BY cu.NumeroCuenta
HAVING COUNT(c.IdCliente) > 1;

-- 9. Number of clients per city
SELECT 
    ci.Ciudad,
    COUNT(DISTINCT c.IdCliente) AS NumeroClientes
FROM Cliente c
JOIN ClienteDireccion cd ON c.IdCliente = cd.FkCliente
JOIN Direccion d ON cd.FkDireccion = d.IdDireccion
JOIN CodigoPostal cp ON d.FkCodigoPostal = cp.IdCodigoPostal
JOIN CodigoPostalCiudad cpc ON cp.IdCodigoPostal = cpc.FkCodigoPostal
JOIN Ciudad ci ON cpc.FkCiudad = ci.IdCiudad
GROUP BY ci.Ciudad
ORDER BY NumeroClientes DESC;

-- 10. Accounts that had at least one withdrawal > 1000
SELECT 
    cu.NumeroCuenta,
    t.ValorTransaccion
FROM Transaccion t
JOIN Cuenta cu ON t.FkCuentaRetiro = cu.IdCuenta
WHERE t.ValorTransaccion > 1000;
