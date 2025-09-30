package exercici_12P;

import java.util.Scanner;

public class PositiuNegatiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Donat un número entrat per teclat, realitzar un programa que informe de si el
		número introduït és positiu o negatiu.
		 */

	
		Scanner dade = new Scanner(System.in);
		System.out.println("Dona´m un numero");
		int num = dade.nextInt();
		
		if (num > 0) {
			System.out.println("Es positiu");
			
		} else {
			System.out.println("Es negatiu");

		}
	}

}
