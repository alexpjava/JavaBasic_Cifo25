package solucioProvaM1;

import java.util.Scanner;

public class Exercici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Programa que pide inicialmente dos números *qualsevols.
//		Posteriormente pedirá un usuario y una contraseña (solo se piden una vez estos datos).
//		Usuario con permiso: 
//		•	Pere con contraseña 1T24P
//
//		Tener en cuenta que la persona usuaria puede poner tanto mayúsculas como minúsculas en el caso del usuario y será igual de correcto (se tiene que controlar la entrada).
//
//		Si es la persona con permisos se le pide qué operación quiere, en caso contrario no se hace ninguna acción.
//		Dos opciones posibles para hacer: 
//		1.	Se pide la operación solo una vez.
//		2.	Se pide la operación mientras no sea una de las opciones permitidas.
//		Las operaciones posibles son la suma, el resto , la multiplicación y la división.
//		Una vez elegida una de las opciones correctas se realiza la operación.
//
//		Ejemplo de salida deseada:
//		Querido Pere,
//		Su operación elegida es el resto
//		Los números introducidos son: 20.0 y 9.0
//		Y el resultado es 11.0
//		Entrada y salida de datos desde consola.
		float n1, n2,resultado;
		String usu, contra,cadena;
		int ope;
		Scanner buffer=new Scanner(System.in);
		System.out.println("un número? ");
		n1=buffer.nextFloat();
		System.out.println("un número? ");
		n2=buffer.nextFloat();
		buffer.nextLine();
		System.out.println("Su usuario? ");
		usu=buffer.nextLine().toLowerCase();
		System.out.println("Su password? ");
		contra=buffer.nextLine();
		if(usu.equals("pere") && contra.equals("1T24P")) {
			System.out.println("Qué operación desea? 1- suma, 2-resta,3-multi, 4-divi ");
			ope=buffer.nextInt();	
			
			while(ope!=1 && ope!=2 && ope!=3 && ope!=4 ) {
			System.out.println("Debe escoger una diferente? 1- suma, 2-resta,3-multi, 4-divi ");
				ope=buffer.nextInt();	
			}
			
			if(ope==1) {
				//suma
				resultado=n1+n2;
				cadena="suma";

			}else if(ope==2) {
				//resta
				resultado=n1-n2;
				cadena="resta";
				
			}else if(ope==3) {
				//multi
				resultado=n1*n2;
				cadena="multi";
				
			} else {
				//divi
				resultado=n1/n2;
				cadena="divi";
			}
			
			System.out.println("Querido pere");
			System.out.println("Su operación elegida es :"+cadena);
			System.out.println("Los números introducidos son "+n1+" y "+n2);
			System.out.println("Y el resultado es "+resultado);
			
			
		}else {
			System.out.println("no puede acceder");
		}
		
		
	}

}
