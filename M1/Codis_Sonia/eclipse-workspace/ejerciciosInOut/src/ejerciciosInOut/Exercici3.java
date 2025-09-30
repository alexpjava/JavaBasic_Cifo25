package ejerciciosInOut;

import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Realitzar la suma, resta, divisió i multiplicació de les dades que s'introdueixin.
		float a, b,suma,resta,multi,divi;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Entre un número por favor..");
		a=entrada.nextFloat();
		
		System.out.println("Entre otro número por favor..");
		b=entrada.nextFloat();
		suma=a+b;
		System.out.println("La suma de: "+a+" y de: "+b+" es:"+suma);
		resta =a-b;
		System.out.println("La resta de: "+a+" y de: "+b+" es:"+resta);
		multi=a*b;
		System.out.printf("La multiplicación de %.1f y de %.1f es: %.1f "  , a,b,multi );
		divi=a/b;
		System.out.printf("La división de %.1f y de %.1f es: %.1f "  , a,b,divi );
		
	}

}
