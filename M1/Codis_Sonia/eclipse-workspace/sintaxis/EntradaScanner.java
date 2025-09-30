package ejemplosScanner;

import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in); //creando un buffer de entrada
		
		System.out.println("Su edad por favor??");
		int edad=entrada.nextInt();
		entrada.nextLine();
		System.out.println("Introduzca su nombre please...");
		String nombre=entrada.nextLine(); //leyendo el texto de la consola
		System.out.println("Cuál es su sueldo??");
		double sueldo=entrada.nextDouble();
	
		System.out.printf("%s dentro de 10 años tendrás la edad de %d y tienes un sueldo de %f",nombre,(edad+10),sueldo);
		
		entrada.close();
	}

}
