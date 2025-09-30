package ejerciciosInOut;

import java.util.Scanner;

public class Exercici7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Classe per a fer el càlcul de la nota final a partir dels encerts i de les fallades, és a dir es demana l'entrada de les dues dades i es fa el següent càlcul:
//		( (numaciertos-(numfallos/3))*10)/20.
  // test que tiene 20 preguntas
		
// numfallos i  numaciertos  int
		int numaciertos, numfallos;
		float nota;
		Scanner buffer=new Scanner(System.in);
		
		System.out.println("Entre un número de aciertos..");
		numaciertos=buffer.nextInt();
		
		System.out.println("Entre un número de fallos..");
		numfallos=buffer.nextInt();
		
		nota=( (numaciertos-(numfallos/3f))*10f)/20;
		//nota=( ((float)numaciertos-((float)numfallos/3))*10)/20;
		System.out.printf("La nota   es: %.2f "  , nota );
	}

}
