package src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercici_21B {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        /*
        Donada una edat que aparegui  un missatge amb les tarifes d’un gimnàs.
        Infants (menors de 6 anys majors 0)   0€
        Nen (a partir de 6 anys i menor de 12 anys ) 15€
        Jove (a partir de 12 anys i menys de 30 anys 25€)
        Adult (a partir de 30 anys i menys de 65 anys 30€)
        Jubilats (a partir de 65 anys 20€)
        Afegir: demanar els mesos de matricula i donar el cost total
        amb un 15% d’iva del total dels mesos* tarifa.
         */
        System.out.printf("Hello and welcome!\n");

        Scanner dada = new Scanner(System.in);
        System.out.println("Entrar una edat: ");
        int edat = dada.nextInt();
        System.out.println("Entrar el numero de mesos de matricula ");
        float mesos = dada.nextFloat();
        float cost;
        float iva = 0.15f;

        if (edat > 0 && edat <= 6){
            cost = (mesos * 0);
            cost += cost * iva;
            System.out.println("El cost de la matricula es: " + cost + " eu.");
        } else if (edat >= 6 && edat < 12) {
            cost = (mesos * 15f);
            cost += cost * iva;
            System.out.println("El cost de la matricula es: " + cost + " eu.");
        } else if (edat >= 12 && edat < 30) {
            cost = (mesos * 25f);
            cost += cost * iva;
            System.out.println("El cost de la matricula es: " + cost + " eu.");
        } else if (edat >= 30 && edat < 65) {
            cost = (mesos * 30f);
            cost += cost * iva;
            System.out.println("El cost de la matricula es: " + cost + " eu.");
        } else if (edat >= 65) {
            cost = (mesos * 20f);
            cost += cost * iva;
            System.out.println("El cost de la matricula es: " + cost + " eu.");
        }
    }
}