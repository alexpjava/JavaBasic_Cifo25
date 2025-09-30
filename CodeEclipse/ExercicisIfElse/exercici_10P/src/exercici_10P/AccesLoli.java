package exercici_10P;

import java.util.Scanner;

public class AccesLoli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Crear un programa que permeti l'accés donant la benvinguda tant a Loli com a Pedro.
		En cas contrari se li demana a la persona usuària que es registri.
		És a dir, quan s'entren Loli o Pedro es le dá la benvinguda,
		en cas contrari se'l convida a registrar-se.

		 */
		
		Scanner dada = new Scanner(System.in);
		
		System.out.println("Dona´m el teu nom");
		String nom = dada.nextLine().toLowerCase();
		String nomf= nom.toUpperCase().charAt(0) + nom.substring(1, nom.length()).toLowerCase();
		
		if (nom.equals("loli") || nom.equals("pedro")) {
			
			
			System.out.println("Benvingut/da " + nomf);
		} 
		
		else {
			System.out.println("Si us play, Registrat " + nomf);

		}

	}

}
