package ejemplosScanner;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//área del triángulo
		float base, altura, areaT;
		Scanner buffer = new Scanner (System.in);
		
		System.out.println("Entre un valor para la base");
		base=buffer.nextFloat();
		
		System.out.println("Entre un valor para la altura");
		altura=buffer.nextFloat();
		
		areaT= (base*altura)/2f;
		
		System.out.printf("El área del triángulo con base :%.2f y altura :%.2f es de : %.2f ",base,altura,areaT);
		buffer.close();
	}

}
