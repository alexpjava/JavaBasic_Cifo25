package instruccioIfElse;

import java.util.Scanner;

public class SintaxisIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner buffer=new Scanner(System.in);
		System.out.println("un número porfi!");
		num=buffer.nextInt();
	    if(num>0) {  // cuando numero sea mayor que cero
	    	System.out.println("positivo");
	    	           }
	    
	    else if(num<0) {
	    	// cuando numero sea menor que cero
	    	System.out.println("negativo");
	    }
	    else {
	    	// es el cero
	    	System.out.println("soy el cero!");
	    } 
	    int edad;
	    System.out.println("edad?");
	    edad=buffer.nextInt();
	    
	    if(edad<=30 && edad>0) {  // cuando numero sea mayor que cero
	    	System.out.println("cuota joven");
	    	           }
        else if(edad<=60) {
	    	// cuando numero sea menor que cero
	    	System.out.println("cuota adulto");
	    }
	    else {
	    	// es el cero
	    	System.out.println("cuota jubilado");
	    } 
	    
		
	}
}



