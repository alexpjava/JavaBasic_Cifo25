package ejerciciosInOut;

import java.util.Scanner;

public class Exercici5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Càlcul de l'arrel quadrada d'un número donat per la persona usuària.
		double num, arrel;
		Scanner buffer=new Scanner(System.in);
		System.out.println("Entre un número por favor..");
		num=buffer.nextDouble();
		arrel=Math.sqrt(num);
		System.out.printf("L'arrel  de %.1f  es: %.1f "  , num,arrel );
		buffer.close();
	}

}
