import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /*
        Una vegada ingressat un nom en concret (el nostre nom per exemple), demanar una clau
        fins que es posi la correcta.
        El nom es demana només un cop.
        Es poden afegir possibilitats per a controlar les possibles situacions.
         */
        Scanner dada = new Scanner(System.in);
        // if (!pass.equals("1234"))
        System.out.println("Dona´m el teu nom: ");
        String nom = dada.nextLine().toLowerCase();

        while (true){

            System.out.println("Dona´m el teu password: ");
            String pass = dada.nextLine();

            if (pass.equals("1234")){
                System.out.println("Tot correcte " + nom);
                break;
            }else{
                System.out.println("Torna a provar el password, " + nom);
            }
        }

    }
}