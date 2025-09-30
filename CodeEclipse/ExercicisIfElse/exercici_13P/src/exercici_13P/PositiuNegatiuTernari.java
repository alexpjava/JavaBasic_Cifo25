package exercici_13P;

import java.util.Scanner;

public class PositiuNegatiuTernari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Donat un número entrat per teclat, realitzar un programa que
		 informe de si el número introduït és positiu o negatiu, però
		 aquesta vegada amb un condicional ternari.
		 */
		
		
		// resultado = (condicion)?valor1:valor2;
		Scanner dada = new Scanner(System.in);
		System.out.println("Dona´m un numero");
		int num = dada.nextInt();
		String val =  (num >= 0)? "Positiu":"Negatiu";
		System.out.println("El numero es: "+ val);
		
		
		
		
	}

}
