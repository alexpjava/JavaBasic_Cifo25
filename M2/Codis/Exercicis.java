package funcions;

import java.util.Scanner;

public class Exercicis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2-Exercici 
//		Definir una funció que em retorni el valor de l’arrel quadrada, passant un número com 
//		a  paràmetre. Fer servir la llibreria Math. 
//		3-Exercici 
//		Definir una funció que em retorni el valor de la potència de dos números, passant dos 
//		números com a  paràmetres. Fer servir la llibreria Math. 
//		4-Exercici 
//		Definir una funció que em retorni el major de dos números. Fer una funció amb 
//		paràmetres i amb retorn. 
		double valorArrel, resultatArrel,valor1,valor2;
		float resultatPotencia;
		Scanner buffer=new Scanner(System.in);
		System.out.println("Valor per l'arrel?");
		valorArrel=buffer.nextDouble();
		
		resultatArrel=raiz(valorArrel);
		System.out.printf("L'arrel és:%.2f",resultatArrel);
		System.out.println("\nValor 1 per la potència");
		valor1=buffer.nextDouble();
		System.out.println("Valor 2 per la potència");
		valor2=buffer.nextDouble();
		resultatPotencia=potencia(valor1,valor2);
		System.out.printf("La potencia és:%.2f",resultatPotencia);
      
	}
	//funció arrel quadrada
	public static double raiz(double x) {
		double resultR;
		resultR=Math.sqrt(x);
		return resultR;
	}
   //funció potència
	public static float potencia(double x, double y) {
		return (float)Math.pow(x, y);
	}
   //funció màx
	public static float maximo(double x,double y) {
		if(x>=y) {
			return x;
		}
		else {
			return y;
		}
	}
}
