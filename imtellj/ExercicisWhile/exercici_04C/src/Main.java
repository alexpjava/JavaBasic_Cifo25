import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // System.out.println("Hello world!");

        /*
        Es permet l’accés a Marina amb el password 457tY.
        Primer es demana el nom mentre no sigui Marina , un cop ja s’ha entrat el nom correcte
        es demana el password. I aquest també es demana mentre no sigui el correcte.
         */

        Scanner dada = new Scanner(System.in);
        //System.out.println("Dona´m el teu nom: ");
        //String nom = dada.nextLine();
        //System.out.println("Dona´m el teu password: ");
        //String pass = dada.nextLine();

        while (true){
            System.out.println("Dona´m el teu nom: ");
            String nom = dada.nextLine().toLowerCase();
            if (! nom.equals("marina")){
                System.out.println("El nom, " + nom + ". NO ES CORRECTE.\nTorna-ho a intentar.");
            }else{
                while (true){
                    System.out.println("Dona´m el teu password: ");
                    String pass = dada.nextLine();
                    if (! pass.equals("1234")){
                        System.out.println(nom + ". El pass es INCORRECTE. Torna-ho a provar.");
                    }else{
                        System.out.println("TOT CORRECTE " + nom);
                        break;
                    }
                }
            break;
            }
        }




    }
}