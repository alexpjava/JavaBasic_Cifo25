package ejerciciosInOut;

import java.util.Scanner;

public class Exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Escriu un programa Java que llegeix un nombre enter per teclat i obté i mostra el doble i el triple d'aquest número.
		
		int numero;
	    Scanner buffer=new Scanner(System.in);
		
		System.out.println("Entre un número ");
		numero=buffer.nextInt();
		System.out.println("El doble de "+numero+" es:"+(2*numero)+" y el triple es:"+ (3*numero));
		
		System.out.printf("El doble de %d es:%d y el triple es:%d", numero,(2*numero),(3*numero));
	}

}
