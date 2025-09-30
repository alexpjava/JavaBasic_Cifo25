package exercici_13P;

import java.util.Iterator;
import java.util.Scanner;

public class Booleanos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		S'entren per teclat tres números, si almenys un dels valors és menor de 10 apareixerà
		el missatge “Algun dels valors són menors de 10”, en cas contrari apareixerà “Cap dels
		valors és menor de 10”.
		 */
		
	boolean check = true;
	
	int contador = 1;
	
	int contList = 0;
	
	Scanner dada = new Scanner(System.in);
	
	
	/*while (contador < 4) {
		System.out.println("Dona´m un numero");
		int num = dada.nextInt();
		contador += 1;
		if (num < 10) {
			System.out.println("Un dels valors es menor de 10");
			break;
			
			
		} else {
			System.out.println("Es mayor de 10");

		}
		
	}*/
	
	int[] list = new int[3];
	//System.out.println(list.length);
	
	for (int i = 0; i < list.length; i++) {
		System.out.println("Dona´m un numero");
		int num = dada.nextInt();
		list[i] = num;
	}
	//for (int i = 0; i < list.length; i++) {
	//	System.out.println(list[i]);
	//}
	
	
	//System.out.println(list[contList]);
	//
	
	while (contList < list.length) {
		
		if (list[contList] >= 10) {
			contList += 1;
			//check = false;
			if (contList == 3) {
				System.out.println("Cap valor es menor de 10");
				break;
			}
			
		} else {
			System.out.println("Algun dels valors es menors de 10");
			break;
		}
	}
	
	//System.out.println("Cap valor es menor de 10");
	}

}
