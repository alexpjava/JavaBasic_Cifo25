package src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercici_22B {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /*
        Programa que inicialment et demana el nom.
        En el cas de ser Pau , Pili o Lluis ens demana quina operació vull fer, tenim
        tres possibles :  potencia de dos números, arrel quadrada, màxim de dos números.
        En el cas de no ser ni Pau, ni Pili, ni Lluis et convida a registrar-te.
        */

        // System.out.printf("Hello and welcome!");
        Scanner dada = new Scanner(System.in);
        System.out.println("Dona´m el teu nom: ");
        String nom = dada.nextLine().toLowerCase();

        if (nom.equals("pau") || nom.equals("pili") || nom.equals("lluis")){
            System.out.println("Quina operacio vols fer: \nPotencia de dos numeros?\nArrel cuadrda?\nMaxim de dos numeros?");
        }else {
            System.out.println("REGISTRE'T");
        }



    }
}