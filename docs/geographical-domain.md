
---

### `docs/geographical-domain.md`
```markdown
# Geographical Domain ERD

This page contains the **ER diagram** of the geographical domain (Address, ZipCode, City, Country, StreetType).  
Paste this block into the file and GitHub will render the diagram automatically.

```mermaid
erDiagram
    COUNTRY {
        int IdCountry PK
        string CountryName
        string CountryCode
    }

    CITY {
        int IdCity PK
        string CityName
        int FkCountry FK
    }

    ZIPCODE {
        int IdZipCode PK
        string ZipCodeValue
    }

    ZIPCODE_CITY {
        int IdZipCodeCity PK
        int FkZipCode FK
        int FkCity FK
    }

    STREET_TYPE {
        int IdStreetType PK
        string StreetTypeName
    }

    ACCOUNT_ADDRESS {
        int IdAddress PK
        string StreetName
        int StreetNumber
        int FloorNumber
        string DoorNumber
        int FkStreetType FK
        int FkZipCode FK
    }

    CUSTOMER_ADDRESS {
        int IdCustomerAddress PK
        int FkCustomer FK
        int FkAddress FK
    }

    CUSTOMER {
        int IdCustomer PK
        string NameCustomer
    }

    %% Relationships
    COUNTRY ||--o{ CITY : "contains"
    CITY ||--o{ ZIPCODE_CITY : "maps"
    ZIPCODE ||--o{ ZIPCODE_CITY : "maps"
    STREET_TYPE ||--o{ ACCOUNT_ADDRESS : "defines"
    ZIPCODE ||--o{ ACCOUNT_ADDRESS : "locates"
    ACCOUNT_ADDRESS ||--o{ CUSTOMER_ADDRESS : "linked"
    CUSTOMER ||--o{ CUSTOMER_ADDRESS : "linked"

    [⬅️ Back to Index](../README.md#table-of-contents)
