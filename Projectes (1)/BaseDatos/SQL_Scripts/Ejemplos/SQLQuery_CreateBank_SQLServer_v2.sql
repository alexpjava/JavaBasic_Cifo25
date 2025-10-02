-- SCRIPT TO CREATE FIRST ALL TABLES WITHOUT CONSTRAINTS AND THEN UPDATE ALL CONSTRAINTS IN EACH NECESSARY TABLE.

/*
-- Primero desabilitar la integridad referencial 
EXEC sp_MSForEachTable 'ALTER TABLE ? NOCHECK CONSTRAINT ALL' 
GO

EXEC sp_MSforeachtable @command1 = "DROP TABLE ?"

-- Ahora volver a habilitar la integridad referencial
EXEC sp_MSForEachTable 'ALTER TABLE ? CHECK CONSTRAINT ALL' 
GO
*/

/*IF (OBJECT_ID('dbo.FK_ConstraintName', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE dbo.TableName DROP CONSTRAINT FK_ConstraintName
END

C = CHECK constraint
D = DEFAULT (constraint or stand-alone)
F = FOREIGN KEY constraint
PK = PRIMARY KEY constraint
UQ = UNIQUE constraint

*/

USE BankAlPy;
GO

-- ==============================
-- ELIMINAR CONSTRAINTS SI EXISTEN
-- ==============================

--1
IF (OBJECT_ID('dbo.Fk_DivisaTipoCuenta', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE dbo.TipoCuenta DROP CONSTRAINT Fk_DivisaTipoCuenta;
END
GO

--2
IF (OBJECT_ID('dbo.Fk_CuentaCuentaCliente', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE dbo.CuentaCliente DROP CONSTRAINT Fk_CuentaCuentaCliente;
END
GO

--3
IF (OBJECT_ID('dbo.Fk_ClienteCuentaCliente', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE CuentaCliente DROP CONSTRAINT Fk_ClienteCuentaCliente;
END
GO

--4
IF (OBJECT_ID('dbo.Fk_TipoCuentaCuentaCliente', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE CuentaCliente DROP CONSTRAINT Fk_TipoCuentaCuentaCliente;
END
GO

--5
IF (OBJECT_ID('dbo.Fk_CuentaDepositoTransaccion', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE Transaccion DROP CONSTRAINT Fk_CuentaDepositoTransaccion;
END
GO

--6
IF (OBJECT_ID('dbo.Fk_CuentaRetiroTransaccion', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE Transaccion DROP CONSTRAINT Fk_CuentaRetiroTransaccion;
END
GO

--7
IF (OBJECT_ID('dbo.Fk_PaisCiudad', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE Ciudad DROP CONSTRAINT Fk_PaisCiudad;
END
GO

--8
IF (OBJECT_ID('dbo.Fk_CodigoPostalCodigoPostalCiudad', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE CodigoPostalCiudad DROP CONSTRAINT Fk_CodigoPostalCodigoPostalCiudad;
END
GO

--9
IF (OBJECT_ID('dbo.Fk_CiudadCodigoPostalCiudad', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE CodigoPostalCiudad DROP CONSTRAINT Fk_CiudadCodigoPostalCiudad;
END
GO

--10
IF (OBJECT_ID('dbo.Fk_TipoCalleDireccion', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE Direccion DROP CONSTRAINT Fk_TipoCalleDireccion;
END
GO

--11
IF (OBJECT_ID('dbo.Fk_CodigoPostalDireccion', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE Direccion DROP CONSTRAINT Fk_CodigoPostalDireccion;
END
GO

--12
IF (OBJECT_ID('dbo.Fk_ClienteClienteDireccion', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE ClienteDireccion DROP CONSTRAINT Fk_ClienteClienteDireccion;
END
GO

--13
IF (OBJECT_ID('dbo.Fk_DireccionClienteDireccion', 'F') IS NOT NULL)
BEGIN
    ALTER TABLE ClienteDireccion DROP CONSTRAINT Fk_DireccionClienteDireccion;
END
GO


-- ==============================
-- ELIMINAR TABLAS SI EXISTEN
-- ==============================

DROP TABLE IF EXISTS Cliente;
DROP TABLE IF EXISTS Cuenta;
DROP TABLE IF EXISTS TipoCuenta;
DROP TABLE IF EXISTS Transaccion;
DROP TABLE IF EXISTS Direccion;
DROP TABLE IF EXISTS CodigoPostal;
DROP TABLE IF EXISTS Ciudad;
DROP TABLE IF EXISTS ClienteDireccion;
DROP TABLE IF EXISTS CodigoPostalCiudad;
DROP TABLE IF EXISTS CuentaCliente;
DROP TABLE IF EXISTS Divisa;
DROP TABLE IF EXISTS Pais;
DROP TABLE IF EXISTS TipoCalle;
GO


-- ==============================
-- CREACIÓN DE TABLAS
-- ==============================

CREATE TABLE Divisa (
	IdDivisa int IDENTITY(1,1) PRIMARY KEY,
	Divisa varchar(3) NOT NULL
);
GO

CREATE TABLE TipoCuenta (
	IdTipoCuenta int IDENTITY(1,1) PRIMARY KEY,
	Tipo varchar(25) NOT NULL,
	FkDivisa int -- Constraint 1
);
GO

CREATE TABLE Cuenta (
	IdCuenta int IDENTITY(1,1) PRIMARY KEY,
	NumeroCuenta varchar(25) NOT NULL,
	FechaObertura date,
	Saldo decimal(18,2) DEFAULT 0
);
GO

CREATE TABLE Cliente (
	IdCliente int IDENTITY (1,1) PRIMARY KEY,
	Nombre varchar(25) NOT NULL,
	Apellido1 varchar(30) NOT NULL,
	Apellido2 varchar(30) NOT NULL,
	NIF varchar(10) NOT NULL,
	FechaNacimiento date
);
GO

CREATE TABLE CuentaCliente (
	IdCuentaCliente int IDENTITY(1,1) PRIMARY KEY,
	TipoDeTitular varchar(25) NOT NULL,
	FkCuenta int,      -- Constraint 2
	FkCliente int,     -- Constraint 3
	FkTipoCuenta int   -- Constraint 4
);
GO

CREATE TABLE Transaccion (
	IdTransaccion int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	FechaTransaccion date,
	ValorTransaccion decimal(18,2),
	FkCuentaDeposito int, -- Constraint 5
	FkCuentaRetiro int    -- Constraint 6
);
GO

CREATE TABLE Pais (
	IdPais int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	Pais varchar(25) NOT NUll,
	Abreviacion varchar(5) NOT NULL
);
GO

CREATE TABLE Ciudad (
	IdCiudad int NOT NULL IDENTITY (1,1) PRIMARY KEY,
	Ciudad varchar(75) NOT NULL,
	FkPais int -- Constraint 7
);
GO

CREATE TABLE CodigoPostal (
	IdCodigoPostal int NOT NULL IDENTITY (1,1) PRIMARY KEY,
	CodigoPostal varchar (8)
);
GO

CREATE TABLE CodigoPostalCiudad (
	IdCodigoPostalCiudad int NOT NULL IDENTITY (1,1) PRIMARY KEY,
	FkCodigoPostal int, -- Constraint 8
	FkCiudad int        -- Constraint 9
);
GO

CREATE TABLE TipoCalle (
	IdTipoCalle int NOT NULL IDENTITY (1,1) PRIMARY KEY,
	TipoCalle varchar(25)
);
GO

CREATE TABLE Direccion (
	IdDireccion int NOT NULL IDENTITY (1,1) PRIMARY KEY,
	Nombre varchar(50),
	Numero int,
	Piso int,
	Puerta char(3),
	FkTipoCalle int,    -- Constraint 10
	FkCodigoPostal int  -- Constraint 11
);
GO

CREATE TABLE ClienteDireccion(
	IdClienteDireccion int NOT NULL IDENTITY(1,1) PRIMARY KEY,
	FkCliente int,   -- Constraint 12
	FkDireccion int  -- Constraint 13
);
GO


-- ==============================
-- CREACIÓN DE CONSTRAINTS
-- ==============================

-- Constraint 1
ALTER TABLE TipoCuenta
ADD CONSTRAINT Fk_DivisaTipoCuenta FOREIGN KEY (FkDivisa)
REFERENCES Divisa(IdDivisa)
ON DELETE CASCADE;
GO

-- Constraint 2
ALTER TABLE CuentaCliente
ADD CONSTRAINT Fk_CuentaCuentaCliente FOREIGN KEY (FkCuenta)
REFERENCES Cuenta(IdCuenta)
ON DELETE CASCADE;
GO

-- Constraint 3
ALTER TABLE CuentaCliente
ADD CONSTRAINT Fk_ClienteCuentaCliente FOREIGN KEY (FkCliente)
REFERENCES Cliente(IdCliente)
ON DELETE CASCADE;
GO

-- Constraint 4
ALTER TABLE CuentaCliente
ADD CONSTRAINT Fk_TipoCuentaCuentaCliente FOREIGN KEY (FkTipoCuenta)
REFERENCES TipoCuenta(IdTipoCuenta)
ON DELETE CASCADE;
GO

-- Constraint 5
ALTER TABLE Transaccion
ADD CONSTRAINT Fk_CuentaDepositoTransaccion FOREIGN KEY (FkCuentaDeposito)
REFERENCES Cuenta(IdCuenta)
ON DELETE CASCADE;
GO

-- Constraint 6
ALTER TABLE Transaccion
ADD CONSTRAINT Fk_CuentaRetiroTransaccion FOREIGN KEY (FkCuentaRetiro)
REFERENCES Cuenta(IdCuenta)
--ON DELETE NO ACTION;
GO

-- Constraint 7
ALTER TABLE Ciudad
ADD CONSTRAINT Fk_PaisCiudad FOREIGN KEY (FkPais)
REFERENCES Pais(IdPais)
ON DELETE CASCADE;
GO

-- Constraint 8
ALTER TABLE CodigoPostalCiudad
ADD CONSTRAINT Fk_CodigoPostalCodigoPostalCiudad FOREIGN KEY (FkCodigoPostal)
REFERENCES CodigoPostal(IdCodigoPostal)
ON DELETE CASCADE;
GO

-- Constraint 9
ALTER TABLE CodigoPostalCiudad
ADD CONSTRAINT Fk_CiudadCodigoPostalCiudad FOREIGN KEY (FkCiudad)
REFERENCES Ciudad(IdCiudad)
ON DELETE CASCADE;
GO

-- Constraint 10
ALTER TABLE Direccion
ADD CONSTRAINT Fk_TipoCalleDireccion FOREIGN KEY (FkTipoCalle)
REFERENCES TipoCalle(IdTipoCalle)
ON DELETE CASCADE;
GO

-- Constraint 11
ALTER TABLE Direccion
ADD CONSTRAINT Fk_CodigoPostalDireccion FOREIGN KEY (FkCodigoPostal)
REFERENCES CodigoPostal(IdCodigoPostal)
ON DELETE CASCADE;
GO

-- Constraint 12
ALTER TABLE  ClienteDireccion
ADD CONSTRAINT Fk_ClienteClienteDireccion FOREIGN KEY (FkCliente)
REFERENCES Cliente(IdCliente)
ON DELETE CASCADE;
GO

-- Constraint 13
ALTER TABLE  ClienteDireccion
ADD CONSTRAINT Fk_DireccionClienteDireccion FOREIGN KEY (FkDireccion)
REFERENCES Direccion(IdDireccion)
ON DELETE CASCADE;
GO
