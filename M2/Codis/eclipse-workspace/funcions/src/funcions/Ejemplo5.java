package funcions;

import java.util.Scanner;

public class Ejemplo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operacion,num1,num2;
		Scanner buffer=new Scanner(System.in);
		System.out.println("Q operación desea? 1-Suma, 2-Resta,3-Multi,4-Divi");
		operacion=buffer.nextInt();
		System.out.println("Entre un número");
		num1=buffer.nextInt();
		System.out.println("Entre otro número");
		num2=buffer.nextInt();
		//con parámetros y con return
		if(operacion==1) {
			//suma
			int sum=sumar(num1,num2);
			System.out.println("La suma es:"+sum);
			
		}else if(operacion==2) {
			int res=restar(num1,num2);
			System.out.println("La resta es:"+res);

		}else if(operacion==3) {
			int mult=multi(num1,num2);
			System.out.println("La multi es:"+mult);
		}else if(operacion==4) {
			
		}else { 
			System.out.println("Esa operación no la tengo contemplada");
		}
	}	
		public static int sumar(int a,int b) {
			return a+b;
		}
		public static int restar(int a,int b) {
			return a-b;
		}
		public static int multi(int a,int b) {
			return a*b;
		}
		public static int divi(int a,int b) {
			return a/b;
		}
}
