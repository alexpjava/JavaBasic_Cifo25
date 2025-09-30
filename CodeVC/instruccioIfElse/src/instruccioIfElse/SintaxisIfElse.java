package instruccioIfElse;

import java.util.Scanner;

public class SintaxisIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner dade = new Scanner(System.in);
		System.out.println("Dona´m un numero");
		int num = dade.nextInt();
		dade.nextLine();
		
		if (num >0) {
			System.out.println("El numero es major de 0");
			
		} 
		
		else if (num == 0) {
			System.out.println("El numero es 0");
			
		}
		
		else {
			System.out.println("El numero es negatiu");

		}
		
		
		System.out.println("Dona´m el teu nom");
		String nom = dade.nextLine().toLowerCase();
		
		System.out.println("Benvingut/da "+ nom);
		
		
	}

}
