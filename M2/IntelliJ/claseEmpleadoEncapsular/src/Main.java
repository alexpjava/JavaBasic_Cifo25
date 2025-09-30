package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Crear la classe ‘Empleado’.
        Una persona empleada es caracteritza per tenir un departament, un nom, un dni, un sou, un dia, un mes i un any de la data de contractació.
        Quan es dona d’alta un empleat es pot tenir la següent informació:
        -	El dni, departament i la data
        -	El nom, departament, la data i el sou
        -	Totes les dades de la persona empleada.
        Definir els constructors necessaris.
        Un cop definida la classe, es vol contractar a les següents persones:
        1.	47521147L, a administració amb data 12/3/2024
        2.	47854235J, a administració amb data 24/02/2024
        3.	Marta, recursos humans amb sou de 1350 i amb data 21/01/2024.
        4.	Pau , amb dni: 47854124P, a recursos humans amb sou de 1450 i amb data  24/01/2024.
         */

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Empleado empleado1 = new Empleado("47521147L","administració", LocalDate.parse("12/03/2024", formatter));
        Empleado empleado2 = new Empleado("47854235J","administració", LocalDate.parse("24/02/2024", formatter));
        Empleado empleado3 = new Empleado("Marta","recursos humans", 1350, LocalDate.parse("21/01/2024", formatter));
        Empleado empleado4 = new Empleado("Pau", "47854124P", "recursos humans", 1450, LocalDate.parse("24/01/2024", formatter));
        Empleado empleado5 = new Empleado("45132458F", "recursos humans", LocalDate.parse("15/01/2025", formatter));


    // Mostrar informació
        empleado1.mostrarInformacio();
        empleado2.mostrarInformacio();
        empleado3.mostrarInformacio();
        empleado4.mostrarInformacio();
        empleado5.mostrarInformacio();

        //No funcionara pq es una variable private.
        //empleado1.nom("Ales");

        empleado1.setNom("Alex");
        empleado1.mostrarInformacio();
        empleado5.setSou(2000);
        empleado5.mostrarInformacio();

        LocalDate now = LocalDate.now();
        System.out.println(now);

        //String data1 = "15/01/2025";
        LocalDate now1 = LocalDate.parse("15/01/2025", formatter);
        System.out.println(now1);

        Empleado.mostrarNombreId();


    }
}
