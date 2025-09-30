package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

        /*
        Crear la classe ‘Empleado’.
        Un persona empleada es caracteritza per tenir un departament, un nom ,un dni,  un sou , un dia, un mes i un any de la data de contractació.
        Quan es dona d’alta un empleat es pot tenir la següent informació :
        -	El dni, departament i la data
        -	El nom,  departament , la data i el sou
        -	Totes les dades de la persona empleada.
        Definir els constructors necessaris.
        Un cop definida la classe , es vol contractar  ales següents persones :
        1.	47521147L, a administració amb data 12/3/2024
        2.	47854235J , a administració amb data 24/02/2024
        3.	Marta, recursos humans amb sou de 1350 i amb data 21/01/2024.
        4.	Pau , amb dni: 47854124P, a recursos humans amb sou de 1450 i amb data  24/01/2024.
         */

    public class Empleado {

        // Establir les variables Privades permet evitar l'edició de les mateixes dins de l'objecte i forçar l'
        // edició i consulta a través dels getters i setters.
        private String nom;
        private String dep;
        private String dni;
        private LocalDate data;
        private float sou;
        // Creació de variable static que afectarà el grup de objets creats per aquesta class i no de forma individual.
        // Es podrà cridar des de la class. Exemple Empleado.id;
        public static int idSiguiente = 0;
        private int id;

        public Empleado(String nom, String dni, String dep, float sou, LocalDate data) {

            this.nom = nom;
            this.dep = dep;
            this.dni = dni;
            this.sou = sou;
            this.data = data;
            // Cada vegada que es crei un objecte, s he incrementara el idSiguiente +1.
            // Es te que afegir a cada constructor de la classe.
            idSiguiente ++;
            id = idSiguiente;
        }

        public Empleado(String dni, String dep, LocalDate data) {

            this.dni = dni;
            this.dep = dep;
            this.data = data;
            // Cada vegada que es crei un objecte, s he incrementara el idSiguiente +1
            idSiguiente ++;
            id = idSiguiente;
        }

        public Empleado(String nom, String dep, float sou, LocalDate data) {

            this.nom = nom;
            this.dep = dep;
            this.sou = sou;
            this.data = data;
            // Cada vegada que es crei un objecte, s he incrementara el idSiguiente +1
            idSiguiente ++;
            id = idSiguiente;
        }

        public Empleado(String pep, String dep, String recursosHumans) {
        }

        public void setNom (String nom) {
            this.nom = nom;
        }
        public void setDep (String dep) {
            this.dep = dep;
        }
        public void setDni (String dni) {
            this.dni = dni;
        }
        public void setData (LocalDate data) {
            this.data = data;
        }
        public void setSou (float sou) {
            this.sou = sou;
        }

        public String getNom (){

            return nom;
        }
        public String  getDep (){

            return dep;
        }
        public String  getDni (){

            return dni;
        }
        public LocalDate getData (){

            return data;
        }
        public float getSou (){

            return sou;
        }

        public float getId (){

            return id;
        }

        // Mètode per mostrar informació de l'empleat
        public void mostrarInformacio() {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Nom: " + nom);
            System.out.println("DNI: " + dni);
            System.out.println("Departament: " + dep);
            System.out.println("Sou: " + sou + "€");
            System.out.println("Data contractació: " + data.format(formatter));
            System.out.println("-------------------------------");
            System.out.println("El numero de identificador d´aquest objecte es: "+ id);

            System.out.println("El numero de Instancies creades es: " + Empleado.idSiguiente);
        }
        public static void mostrarNombreId() {

            System.out.println("El numero de Instancies creades es: " + Empleado.idSiguiente);
        }

    }
