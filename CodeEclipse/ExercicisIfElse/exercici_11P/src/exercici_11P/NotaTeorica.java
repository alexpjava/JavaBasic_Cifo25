package exercici_11P;

import java.util.Scanner;

public class NotaTeorica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Donat el programa que realitzava el càlcul de la nota de la prova objectiva afegir el
		codi necessari perquè aparegui un missatge conforme estic aprovat o suspès, a més de
		la nota numèrica.
		( (numaciertos-(numfallos/3))10)/20.
		Nom de la classe: NotaTeorica
		 */
		
		Scanner dade = new Scanner(System.in);
		System.out.println("Dona´m el numero de falles");
		int numfallos = dade.nextInt();
		System.out.println("Dona´m el numero de encerts");
		int numaciertos = dade.nextInt();
		
		float notamedia = (((float)numaciertos-((float)numfallos/3))*10)/20;
		//System.out.println("La nota Teorica es: "+ notamedia);
		
		if (notamedia >= 5) {
			System.out.println("Enorabona, estas aprovat amb la nota: "+ notamedia);
			
		} else {
			System.out.println("Torna-ho ha intentar, la nota es: "+ notamedia);

		}
	}

}
