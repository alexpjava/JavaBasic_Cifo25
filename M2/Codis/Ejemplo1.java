package funcions;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1) Funció amb paràmetres i sense return
		int a=3;
		int b=7;
		int c=2;
		int [] lasEdades= {12,45,78};
		int edad1=23;
		int edad2=45;
		int edad3=34;
		sumar(a,b,c);
		sumar(lasEdades[0],lasEdades[1],edad3);
		multiplicar(10f,45.25f); //crida de la funció
		
		String nombre;
        Scanner buffer = new Scanner (System.in);	
		System.out.println("su nombre por favor?");
		nombre=buffer.nextLine();
		saludar(nombre);
	}  
	
	public static void saludar(String nom) {
		System.out.println("Hola "+nom+ " "
				+ "q tengas buen lunes!!");
	}
	                          //3      7
	public static void sumar(int x,int y,int z) {
		int sum;
		sum=x+y+z;
		System.out.println("La suma es:"+sum);
	}
	//función multiplicar que tiene dos parámetros del tipo float, sin retorno
	public static void multiplicar(float num1 , float num2) {
		//instrucciones 
		float multi;
		multi=num1*num2;
		System.out.println("La multiplicación es:"+multi);
	}
	//función saludar que tiene un  parámetro , que es el nombre, sin retorno	
	
	

}
