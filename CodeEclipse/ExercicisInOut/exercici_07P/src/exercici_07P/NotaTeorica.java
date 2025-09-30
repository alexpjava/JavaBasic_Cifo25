package exercici_07P;

import java.util.Scanner;

public class NotaTeorica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Classe per a fer el càlcul de la nota final a partir dels encerts i de les fallades,
		 és a dir es demana l'entrada de les dues dades i es fa el següent càlcul:
		( (numaciertos-(numfallos/3))10)/20.
		 */

		Scanner dade = new Scanner(System.in);
		System.out.println("Dona´m el numero de falles");
		int numfallos = dade.nextInt();
		System.out.println("Dona´m el numero de encerts");
		int numaciertos = dade.nextInt();
		
		float notamedia = (((float)numaciertos-((float)numfallos/3))*10)/20;
		System.out.println("La nota Teorica es: "+ notamedia);
		
		
	}

}
