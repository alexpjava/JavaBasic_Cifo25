/*Posar codi necessari per a realitzar el pas de cm a peus
Tenint en compte la relació 1 cm=0,0328084 peus.
Nom de la classe: ApiesUsu
 */

import java.util.Scanner;

public class ApiesUsu {

    public static void main(String[] args) throws Exception {   
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix els centímetres: ");
        double cm = sc.nextDouble();
        double peus = cm * 0.0328084;
        System.out.println(cm + " centímetres equivalen a " + peus + " peus");
        sc.close();
    }

}