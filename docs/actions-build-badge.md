# GitHub Actions Build Badge

## GitHub Actions Build Badge

En el README puedes incluir el siguiente badge:

![Build](https://github.com/alexpjava/BankAlpy/actions/workflows/ci.yml/badge.svg)

---

### 🔎 ¿Qué es?

- Es una **insignia de estado dinámica** que se genera automáticamente desde **GitHub Actions**.  
- Muestra el estado del flujo de integración continua (CI) que hayas configurado en tu repo en `.github/workflows/ci.yml`.  
- Si el pipeline corre bien (compila y pasa los tests), el badge se verá en **verde** con algo como `✔ passing`.  
- Si falla, se pondrá en **rojo** con `✖ failing`.  

---

### ⚙️ ¿Cómo funciona?

1. En tu repo creas un **workflow** (un archivo YAML dentro de `.github/workflows/`).  
   Ejemplo mínimo para **Java + Maven**:

   ```yaml
   name: CI

   on:
     push:
       branches: [ "main" ]
     pull_request:
       branches: [ "main" ]

   jobs:
     build:
       runs-on: ubuntu-latest

       steps:
         - name: Checkout repository
           uses: actions/checkout@v3

         - name: Set up JDK 17
           uses: actions/setup-java@v3
           with:
             distribution: 'temurin'
             java-version: '17'

         - name: Build with Maven
           run: mvn -B package --file pom.xml
   ```

[⬅️ Back to Index](../README.md#table-of-contents)
