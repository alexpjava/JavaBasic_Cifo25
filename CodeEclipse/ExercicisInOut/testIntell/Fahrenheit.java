package exercici_01;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Fer la classe necessària per al pas de graus centígrads a graus Fahrenheit.
		Tenint en compte que el càlcul:
			1. Multiplica els graus Centígrads per 9/5.
			2. Suma-li 32è per a adaptar l'equivalent en l'escala Fahrenheit.
		 */
		Scanner dada = new Scanner(System.in);
		
		
		
		System.out.println("Dona´m un valor de graus centigrads per passar a Fahenheit");
		float graus = dada.nextFloat();
		
		float faren = ((graus * (9f/5f)) + 32);
		float divi = (9f/5f);
		
		System.out.println(divi);
		
		System.out.println(graus + " graus Centigrads son equivalets a "+ faren + " graus Fahrenheit");
		System.out.printf("%.2f graus Centigrads son eqiuivalents a %.2f graus Fahrenheit", graus, faren);
		
	}

}