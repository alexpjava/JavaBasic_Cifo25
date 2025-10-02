# JavaBasic_Cifo25
Basic Java Codes

# Banking Domain ERD

This diagram shows the relationships between **Customer, Account, Transactions, Loans, Currency, and AccountType**.

```mermaid
erDiagram
    CUSTOMER {
        int IdCustomer PK
        string NameCustomer
        string FirstLastName
        string SecondLastName
        string NIF
        date BirthDate
    }

    ACCOUNT {
        int IdAccount PK
        string AccountNumber
        date OpeningDate
        decimal Balance
        boolean StatusAccount
    }

    ACCOUNTTYPE {
        int IdAccountType PK
        string AccountType
    }

    ACCOUNT_CUSTOMER {
        int IdAccountCustomer PK
        string TypeDeTitular
    }

    CURRENCY {
        int IdCurrency PK
        string Currency
        string CurrencyCode
    }

    CURRENCY_ACCOUNTTYPE {
        int IdCurrencyAccountType PK
    }

    BANKTRANSACTION {
        int IdBankTransaction PK
        string BankTransactionType
        decimal Balance
        date DateBankTransaction
        decimal BalanceAfter
    }

    LOAN {
        int IdLoan PK
        decimal AmountLoan
        decimal Interest
        date StartDate
        date DueDate
        decimal RemainingBalance
        boolean Active
    }

    %% Relationships
    ACCOUNT ||--o{ BANKTRANSACTION : "has"
    ACCOUNT ||--o{ LOAN : "has"
    ACCOUNT ||--o{ ACCOUNT_CUSTOMER : "linked"
    CUSTOMER ||--o{ ACCOUNT_CUSTOMER : "owns"
    ACCOUNT ||--|| ACCOUNTTYPE : "is type"
    ACCOUNTTYPE ||--o{ CURRENCY_ACCOUNTTYPE : "allowed in"
    CURRENCY ||--o{ CURRENCY_ACCOUNTTYPE : "allowed in"
    ```

    ⬅️ Volver al índice](../README.md#índice)
