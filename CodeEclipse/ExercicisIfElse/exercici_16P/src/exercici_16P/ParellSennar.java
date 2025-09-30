package exercici_16P;

import java.util.Scanner;

public class ParellSennar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dada = new Scanner(System.in);
		System.out.println("Dona´m un numero");
		int num = dada.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("El numer donat "+ num + " es parell.");
		} else {
			System.out.println("El numer donat "+ num + " es senar.");
		}
	}
}
