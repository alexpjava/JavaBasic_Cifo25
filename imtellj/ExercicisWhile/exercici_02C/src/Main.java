import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class
Main {
    public static void main(String[] args) {

    /*
    Llegir números fins que s'introdueixi un 0. Per a cadascun indicar si és parell o
    imparell. Llegir números fins que s'introdueixi un 0. Per a cadascun indicar si
    és parell o imparell.
     */
        // System.out.println("Hello world!");
        Scanner dada = new Scanner(System.in);
        boolean core = true;

        while (core) {

            System.out.println("Introduir un numero, si marcar el 0, es sotira del programa");
            int num = dada.nextInt();

            if ((num % 2 == 0) && (num != 0)) {
                System.out.println("El numero " + num + " es PARELL.");
            } else if (num == 0) {
                System.out.println("HAS MARCAT EL 0. ADEU !!");
                //core = false;
                break;
            } else System.out.println("El numero " + num + " es SENAR.");
        }
    }
}