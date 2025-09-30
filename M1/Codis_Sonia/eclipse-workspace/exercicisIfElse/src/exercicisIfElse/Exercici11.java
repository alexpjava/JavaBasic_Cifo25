package exercicisIfElse;

import java.util.Scanner;

public class Exercici11 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//		Programa que demani el nom, el password i després es deixa escollir opció si és 
//		Maria amb el password 1234.
//		Les operacions possibles són : 1-área del cercle , 2-área del triangle i  3-àrea del quadrat.
//		Intentar tenir un únic missatge de sortida.
        String nom, opcion;
        int password;
		Scanner buffer=new Scanner(System.in);
		System.out.println("Su nombre?");
		nom=buffer.nextLine();
		nom=nom.toLowerCase();
		//nom=buffer.nextLine().toLowerCase();
		System.out.println("Password?");
		password=buffer.nextInt();
		
		if(nom.equals("maria") && password==1234 ) {
			
			//et demanaré opció
			System.out.println("Qué opción desea? 1- área círculo, 2- área cuadrado, 3- área triángulo");
			opcion=buffer.nextLine();
			if(opcion.equals("1")) {
				//área círculo (pi*r*r)
				
			}else if(opcion.equals("2")) {
				//área cuadrado (l*l)
				
			}else if(opcion.equals("3")) {
				//área triángulo (b*h)/2
				
			} else {
				//avisar esa opción no existe
				System.out.println("lo sentimos María porque esa opción no existe");
			}
			
			
			
			
			
			
		} else {
			System.out.println("No podràs escollir opció...");
		}
		
		
		
	}

}
