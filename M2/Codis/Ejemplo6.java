package funcions;

import java.util.Scanner;

public class Ejemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2-Crear una aplicació que ens demani un número per teclat i amb una funció li ho passem per paràmetre perquè ens indiqui si és o no un nombre parell. 
		int numero;
		Scanner buffer=new Scanner(System.in);
		System.out.println("Un número?");
		numero=buffer.nextInt();
		esPar(numero);
	}

	public static void esPar(int x) {
		if(x%2==0) {
			System.out.println("Es par");
		}else {
			System.out.println("No es par");
		}
	}
	
	public static String Par(int x) {
		String cadena;
		if(x%2==0) {
			cadena="Es par";
		}else {
			cadena="No es par";
		}
		return cadena;
	}
	
}
