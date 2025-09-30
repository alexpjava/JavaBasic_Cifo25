package ejerciciosInOut;

import java.util.Scanner;

public class Exercici9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Escriu un programa Java que calculi la mitjana de cinc números entrats per la persona usuária.
		int num1, num2,num3,num4,num5;
	    Scanner buffer=new Scanner(System.in);

		System.out.println("Entre un número ");
		num1=buffer.nextInt();
		System.out.println("Entre un número ");
		num2=buffer.nextInt();
		System.out.println("Entre un número ");
		num3=buffer.nextInt();
		System.out.println("Entre un número ");
		num4=buffer.nextInt();
		System.out.println("Entre un número ");
		num5=buffer.nextInt();
		System.out.println("la mediana de los cinco números es:"+(num1+num2+num3+num4+num5)/5f);
		
	}

}
