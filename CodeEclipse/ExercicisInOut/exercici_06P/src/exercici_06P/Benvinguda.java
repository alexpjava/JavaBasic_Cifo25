package exercici_06P;

import java.util.Scanner;

public class Benvinguda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Classe necessària per a donar la benvinguda a una persona usuària, una vegada aquesta hagi
		 introduït el seu nom. 
		 */
		Scanner nom = new Scanner(System.in);
		System.out.println("Quin es el teu nom");
		
		String nomper = nom.next();
		
		System.out.printf("Hola %s Benvinguda a Java.",nomper);
			

	}

}
