
---

### 📌 `docs/geographical-domain.md`

```markdown
# Geographical Domain Diagram

This page contains the **ER diagram** of the geographical domain, including country, city, postal codes, and addresses.  

```mermaid
erDiagram
    COUNTRY {
        int IdCountry
        varchar Country
        varchar Abbreviation
    }
    CITY {
        int IdCity
        varchar City
    }
    ZIPCODE {
        int IdZipCode
        varchar ZipCode
    }
    ADDRESS {
        int IdAddress
        varchar StreetName
        int StreetNumber
    }
    CUSTOMER {
        int IdCustomer
        varchar NameCustomer
    }

    COUNTRY ||--o{ CITY : contains
    CITY ||--o{ ZIPCODE : has
    ZIPCODE ||--o{ ADDRESS : locates
    CUSTOMER ||--o{ ADDRESS : lives_at
