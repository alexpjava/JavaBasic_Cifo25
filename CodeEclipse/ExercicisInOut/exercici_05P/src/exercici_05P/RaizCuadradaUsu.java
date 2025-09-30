package exercici_05P;

import java.util.Scanner;

public class RaizCuadradaUsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Càlcul de l'arrel quadrada d'un número donat per la persona usuària.
		Sortida de dades amb tres decimals.
		 */
		Scanner dada = new Scanner(System.in);
		System.out.println("Dona´m un numero per extreure la seva arrel cuadrada:");
		double numero = dada.nextFloat();
		double arrel = Math.sqrt(numero);
		
		System.out.println(numero);
		System.out.println(arrel);
		
		System.out.println("L´arrel cuadrada de "+numero+ " es: "+ arrel);
		System.out.printf("L´arrel cuadrada de %.3f es: %.3f", numero, arrel);
		
	}

}
