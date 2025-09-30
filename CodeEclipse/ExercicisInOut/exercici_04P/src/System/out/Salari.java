package System.out;

import java.util.Scanner;

public class Salari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Programa que calculi el pagament mensual d'una persona treballadora a partir de les hores
		treballades aquest mes i dels dies treballats, tenint en compte que el preu hora és de 10,50 €.
		 */

		Scanner dades = new Scanner(System.in);
		System.out.println("Dona´m els nombre de dies treballats");
		float dies = dades.nextFloat();
		System.out.println("Dona´m els nombre de hores treballats");
		float hores = dades.nextFloat();
		
		float preu = (dies*hores) * 10.50f;
		System.out.println("El salari total sera de: "+ preu+ " euros");
		
	}

}
