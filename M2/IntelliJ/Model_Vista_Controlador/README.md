# Projecte MVC en Java (IntelliJ + Maven)

Aquest projecte és un exemple senzill de l’arquitectura **MVC (Model - View - Controller)** implementada en Java fent servir **Maven** i **JUnit 5** per als tests.

---

## 📂 Estructura del projecte

```
Model_Vista_Controlador/
│── pom.xml
│── README.md
│
├── src/
│   ├── main/java/org/example/
│   │   ├── Model.java
│   │   ├── View.java
│   │   ├── Controller.java
│   │   └── Main.java
│   │
│   └── test/java/org/example/
│       └── AppTest.java
```

---

## 🔎 Lògica MVC

- **Model**: conté les dades i la lògica de negoci.  
  Exemple: `Model.java` guarda i retorna el nom.

- **View**: mostra la informació a l’usuari.  
  Exemple: `View.java` fa un `System.out.println(...)`.

- **Controller**: fa de pont entre el Model i la View.  
  Exemple: `Controller.java` assigna dades al Model i demana a la View que les mostri.

- **Main**: punt d’entrada de l’aplicació.  
  Exemple: crea `Model`, `View`, `Controller` i executa la lògica.

---

## 🖼️ Diagrama simple MVC

```
+---------+        +-----------+        +-------+
|  View   | <----> | Controller| <----> | Model |
+---------+        +-----------+        +-------+
      ↑                   |
      +-------------------+
```

---

## ▶️ Execució

Per executar el programa:

```bash
mvn clean compile exec:java -Dexec.mainClass=org.example.Main
```

Sortida esperada:

```
El nom és: Anna
```

---

## ✅ Tests amb JUnit 5

El test comprova que el Model desa i retorna correctament el nom.

Fitxer: `src/test/java/org/example/AppTest.java`

```java
@Test
void testModel() {
    Model model = new Model();
    model.setNom("Anna");
    assertEquals("Anna", model.getNom(), "El nom hauria de ser Anna");
}
```

Per executar els tests:

```bash
mvn clean test
```

---

## 📘 Notes

- Estructura de carpetes respecta l’estàndard **Maven**.  
- IntelliJ IDEA detecta automàticament el projecte Maven i permet executar els tests des de l’IDE.  
- JUnit 5 està integrat via dependències al `pom.xml`.
