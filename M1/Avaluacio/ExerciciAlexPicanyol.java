package modul1AlexPicanyol;

import java.util.Scanner;

public class ExerciciAlexPicanyol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dada = new Scanner(System.in);
		System.out.println("Dona´m un primer numero");
//Podrien ser reals, millor float per exemple
		int num1 = dada.nextInt();
		System.out.println("Dona´m un segon numero");
		int num2 = dada.nextInt();
		dada.nextLine();
		
		System.out.println("Quin es el teu nom?");
		String nom = dada.nextLine().toLowerCase();
		String nomf = nom.toUpperCase().charAt(0) + nom.substring(1, nom.length()).toLowerCase();
		
		System.out.println("Quin es el teu password?");
		String pass = dada.nextLine();
		
		if (nomf.equals("Pere") && pass.equals("1T24P")) {
			while (true) {
				
				System.out.println("Quina operacio vols relitzar?: suma, resta, multiplicacio, divisio.");
				String oper = dada.nextLine();
				System.out.println("Benvolgut " + nomf + "!"+ "\n\nLa seva operacio triada es la: " + oper + "\n");
				
				if (oper.equals("suma")){
					System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultatde la suma es: " + (num1 +num2));
					break;
				}
				else if (oper.equals("resta")){
					System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultat de la resta es: " + (num1 - num2));
					break;
				}
				else if (oper.equals("multiplicacio")){
					System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultat de la resta es:  " + (num1 * num2));
					break;
				}
				else if (oper.equals("divisio")){
					System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultat de la resta es: " + (num1 / num2));
					break;
				}
				else {
//En el cas de posar una operació diferent de les possibles la sortida seria : 
//La seva operacio triada es la: 6
//Dona´m alguna cosa
//Quina operacio vols relitzar?: suma, resta, multiplicacio, divisio.
//Recomanació: en comptes de dona'm alguna cosa ,fer referència a que no s'ha posat una de els opciones valides, per exemple.
					System.out.println("Dona´m alguna cosa");
				}
			} 		
		}	
			else {
			System.out.println("Les dades personals son incorrectes");
		}
		
	
		
		/*if (nomf.equals("Pere") && pass.equals("1T24P")) {
		
			System.out.println("Quina operacio vols relitzar?: suma, resta, multiplicacio, divisio.");
			String oper = dada.nextLine();
			System.out.println("Benvolgut " + nomf + "!"+ "\n\nLa seva operacio triada es la: " + oper + "\n");
			
			if (oper.equals("suma")){
				System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultatde la suma es: " + (num1 +num2));
			}
			else if (oper.equals("resta")){
				System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultat de la resta es: " + (num1 - num2));
			}
			else if (oper.equals("multiplicacio")){
				System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultat de la resta es:  " + (num1 * num2));
			}
			else if (oper.equals("divisio")){
				System.out.println("Els numeros introduits son: "+num1 +" i "+ num2 + "\n\ni el resultat de la resta es: " + (num1 / num2));
			}
			else if (oper.equals("\r\n")){
				System.out.println("Adeu!!!");
			}
			
		} else {
			System.out.println("Les dades personals son incorrectes");
		}
		*/
		
		
		/*System.out.println("");
		System.out.println("Quina operacio desitga? Premi\n1 per Suma \n2 per Resta \n3 per Multiplicacio \n4 per Divisio");
		
		int opcio = dada.nextInt();
		
		switch (opcio) {
		  case 1:
		    System.out.println("Suma " + (num1+num2));
		    break;
		  case 2:
		    System.out.println("Resta "+ (num1-num2));
		    break;
		  case 3:
		    System.out.println("Multiplicacio "+ (num1*num2));
		    break;
		  case 4:
		    System.out.println("Divisio "+ (num1/num2));
		    break;
		}
		*/   
			
	}
}
