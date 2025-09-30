package exercici_09P;

import java.util.Scanner;

public class Mitjana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list = new int[5];
		
		
		Scanner dada = new Scanner(System.in);
		
		for (int i=0; i<5; i++) {
		System.out.println("Dona´m numero enter");
		list[i] = dada.nextInt();
		}
		System.out.println("Gracies");
		
		for (int i=0; i<5; i++) {
		System.out.println("Els numeros son: " + list[i]);
		}
		
		float suma = list[0];
		for (int i=1; i<5; i++) {
		suma += list[i];
		}
		
		System.out.println(suma);
		System.out.println("La longitud de la llista es "+list.length);
		float mitga = suma / list.length;
		
		System.out.println("La mitga de totes les notes es: "+ mitga);

	}

}
