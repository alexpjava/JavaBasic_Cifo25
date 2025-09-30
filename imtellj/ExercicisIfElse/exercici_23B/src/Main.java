package src;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Per poder accedir a una plataforma es demana el nom de la persona usuària i la contrasenya.
        Per ara només tenen accés Pere amb la contrasenya 451DkL i Pepi  amb la contrasenya 4D45f.
        Un cop han entrat a la plataforma, et demana el sou inicial.
        I un cop introduït el sou apareixen per escollir les següents opcions  :
        Treure diners
        En aquest cas et pregunta quan diners vols treure i els resta del sou inicial.
        Ingressar diners
        En aquest cas et pregunta quan diners vols ingressar i els suma del sou inicial.
        En tots dos casos et diu al final quin sou et queda.
         */

        //System.out.printf("Hello and welcome!");

        Scanner dada = new Scanner(System.in);
        System.out.println("Quin es el teu nom?\n");
        String nom = dada.nextLine();
        System.out.println("Quin es el teu password?\n");
        String pass = dada.nextLine();
        //float sou = 0f;
        float tran;

        if ((nom.equalsIgnoreCase("pere") && pass.equals("451DkL")) || (nom.equalsIgnoreCase("pepi") && pass.equals("4D45f"))){

            System.out.println("Quin es el teu sou?\n");
            float sou = dada.nextFloat();
            System.out.println("Quina opcio trias?\nPer INGRESAR diners, tria 1.\nPer TREURE diners, tria 2.\n");
            int opcio = dada.nextInt();

            if (opcio == 1){
                System.out.println("Quina import vols afegir?");
                float ingres = dada.nextFloat();
                float total = sou + ingres;
                System.out.println("Hola " + nom + ". El teu saldo es:" + total);
            } else if (opcio == 2) {
                System.out.println("Quina import vols restar?");
                float extra = dada.nextFloat();
                float total = sou + extra;
                System.out.println("Hola " + nom + ". El teu saldo es:" + total);
            }

        } else {
            System.out.println("Nom o password INCORRECTE?\n");
        }
    }
}