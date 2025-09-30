package exercici_03P;

import java.util.Scanner;

public class OperacionesUsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Realitzar la suma, resta, divisió i multiplicació de les dades que s'introdueixin.
		Nom de la classe: OperacionesUsu

		 */
		Scanner dada = new Scanner(System.in);
		System.out.println("Dona´m el primer valor numeric");
		float dada1 = dada.nextFloat();
		System.out.println("Dona´m el segon valor numeric");
		float dada2 = dada.nextFloat();
		
		System.out.println("La suma de "+dada1+" mes "+dada2+ " es: "+ (dada1+dada2));
		System.out.println("La resta de "+dada1+" mes "+dada2+ " es: "+ (dada1-dada2));
		System.out.println("La multiplicacio de "+dada1+" mes "+dada2+ " es: "+ (dada1*dada2));
		System.out.println("La divisio de "+dada1+" mes "+dada2+ " es: "+ (dada1/dada2));
		
		
	}

}
