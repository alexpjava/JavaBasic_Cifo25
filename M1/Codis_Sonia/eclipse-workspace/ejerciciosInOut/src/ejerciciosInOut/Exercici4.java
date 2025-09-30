package ejerciciosInOut;

import java.util.Scanner;

public class Exercici4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Programa que calculi el pagament mensual d'una persona treballadora a partir de les hores treballades aquest mes i dels dies treballats, tenint en compte que el preu hora és de 10,50 €.
		int dias;
		float horas;
		Scanner buffer=new Scanner(System.in);
		
		System.out.println("Entre días trabajados");
		horas=buffer.nextFloat();
		
		System.out.println("Entre número de horas trabajadas");
		dias=buffer.nextInt();
		System.out.println("Su sueldo es:"+(horas*dias*10.50));

		
	}

}
