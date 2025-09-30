package instruccioIfElse;

import java.util.Scanner;

public class SintaxisIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int num, edat;
		  String nom;
		  Scanner buffer=new Scanner(System.in);
		  System.out.println("entri un número si us plau!");
		  num=buffer.nextInt();
		  // número positiu
//		  if(num>=0) { System.out.println("Aquest número és positiu");       }
//		  if(num<0) { System.out.println("Aquest número és negatiu");       }
		  if(num>=0) { System.out.println("Aquest número és positiu");       }
		  else {System.out.println("Aquest número és negatiu");  }
		 
		  // demanar l'edat , si sóc major d'edat o no
		  System.out.println("la seva edat si us plau!");
		  edat=buffer.nextInt();
		  buffer.nextLine();
		  if(edat>=18) {
			  System.out.println("pots entrar, ets major d'edat!");
		  } else {
			  System.out.println("no pots entrar, no ets major d'edat!");
		  }
		  // donar la benvinguda a Loli 
		  System.out.println("El seu nom si us plau!");
		  nom=buffer.nextLine().toLowerCase();
		      //LoLi    ->    loli
		  if(nom.equals("loli") ||nom.equals("pedro" )) 
		  {  System.out.println("Benvingut/da!");}
		  
		  buffer.close();
		
	}

}
