package exercici_14P;

import java.util.Scanner;

public class PosiNegaCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Donat un número entrat per teclat, realitzar un programa que
		 informe de si el número introduït és positiu, negatiu o zero.
		 */

		Scanner dada = new Scanner(System.in);
		System.out.println("Dona´m un numero");
		int num = dada.nextInt();
		
		if (num > 0) {
			System.out.println("El numero es positiu");
			
		} else if (num < 0){
			System.out.println("El numero es negatiu");

		}
		else if (num == 0){
			System.out.println("El numero es Cero");

		}
		
		
	}

}
