package exercici_02P;

import java.util.Scanner;

public class ApiesUsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Posar codi necessari per a realitzar el pas de cm a peus
		Tenint en compte la relació 1 cm=0,0328084 peus.
		Nom de la classe: ApiesUsu

		 */
		Scanner dades = new Scanner(System.in);
		
	System.out.println("Dona´m un valor en centimetres per passar a peus:");
	float cm = dades.nextFloat();
	
	float peus = cm * 0.0328084f;
	
	System.out.println("El valor de "+ cm + " cm en peus es de: "+ peus);
	System.out.printf("El valor %.2f centimetros es de %.2f pies", cm, peus);
		
	}

}
