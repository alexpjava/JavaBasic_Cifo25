package exercici_19P;

import java.util.Scanner;

public class Mitjana5 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		/*
		 Programa que donats quatre números entrats per la persona usuària calculi la mitjana
		 i si aquest és major o iguala 5 apareix el missatge: “mitjana major o igual a cinc” i
		 en cas contrari “mitjana menor a cinc”.
		 */

		Scanner dada = new Scanner(System.in);
		System.out.println("Quantes vegades vols introduir numeros per saber la seva mitja?");
		int numv = dada.nextInt();
		float nums = 0f;
		
		int i =  numv;
		while (i > 0) {
			
			System.out.println("Dona´m un numero:");
			float valor = dada.nextFloat();
			nums = nums + valor;
			i = i -1;
		}
		
		float mitja = nums / numv;
		if (mitja > 5) {
			System.out.println("La mitjana es de: "+ mitja + " .Es major de 5.");
		} else{
			System.out.println("La mitjana es de: "+ mitja + " .Es menor de 5.");
		}
		
	}

}
