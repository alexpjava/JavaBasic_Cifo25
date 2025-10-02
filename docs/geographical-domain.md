
---

### `docs/geographical-domain.md`
```markdown
# Geographical Domain ERD

This diagram shows the relationships between **Address, ZipCode, City, Country, and StreetType**.

```mermaid
erDiagram
    COUNTRY {
        int IdCountry PK
        string Country
        string Abbreviation
    }

    CITY {
        int IdCity PK
        string City
    }

    ZIPCODE {
        int IdZipCode PK
        string ZipCode
    }

    ZIPCODE_CITY {
        int IdZipCodeCity PK
    }

    STREETTYPE {
        int IdStreetType PK
        string StreetType
    }

    ACCOUNT_ADDRESS {
        int IdAddress PK
        string StreetName
        int NumberStreet
        int FloorNumber
        string DoorNumber
    }

    CUSTOMER_ADDRESS {
        int IdCustomerAddress PK
    }

    CUSTOMER {
        int IdCustomer PK
        string NameCustomer
    }

    %% Relationships
    COUNTRY ||--o{ CITY : "has"
    CITY ||--o{ ZIPCODE_CITY : "linked"
    ZIPCODE ||--o{ ZIPCODE_CITY : "linked"
    STREETTYPE ||--o{ ACCOUNT_ADDRESS : "defines"
    ZIPCODE ||--o{ ACCOUNT_ADDRESS : "belongs to"
    ACCOUNT_ADDRESS ||--o{ CUSTOMER_ADDRESS : "linked"
    CUSTOMER ||--o{ CUSTOMER_ADDRESS : "linked"
```` ``` ````
    [⬅️ Back to Index](../README.md#table-of-contents)
