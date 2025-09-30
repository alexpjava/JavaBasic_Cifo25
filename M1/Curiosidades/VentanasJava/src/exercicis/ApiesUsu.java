package exercicis;

import java.util.Scanner;

public class ApiesUsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introdueix els centímetres per pasar a peus: ");
		double cm=entrada.nextDouble();
		double peus=cm*0.0328084;
		System.out.printf("%1.7f peus",peus);		
		entrada.close();
	}

}