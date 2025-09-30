package exercicisIfElse;

import java.util.Scanner;

public class Exercici12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	Donada una edat que aparegui  un missatge amb les tarifes d’un gimnàs.
//  Infants (menors de 6 anys majors 0)   0€
//  Nen (a partir de 6 anys i menor de 12 anys ) 15€
//  Jove (a partir de 12 anys i menys de 30 anys 25€)
//	Adult (a partir de 30 anys i menys de 65 anys 30€)
//	Jubilats (a partir de 65 anys 20€)
//	Afegir: demanar els mesos de matricula i donar el cost total amb un 15% d’iva 
		int edat, mesos;
		Scanner buffer=new Scanner(System.in);
		System.out.println("Su edad?");
		edat=buffer.nextInt();
		
		System.out.println("Cuántos meses desea inscribirse?");
		mesos=buffer.nextInt();
		
		if(edat>0 && edat<6) {
			System.out.println("Cuota infantil amb preu de 0€");
		}
		else if(edat>6 && edat<12) {
			System.out.println("Cuota nen amb preu de 15€ con un total de:"+(15*mesos*1.15));
		}

		else if(edat>=12 && edat<30) {
			System.out.println("Cuota jove amb preu de 25€ con un total de:"+(15*mesos*1.15));
		}	
		else if(edat>=30 && edat<65) {
			System.out.println("Cuota adult amb preu de 30€ con un total de:"+(15*mesos*1.15));
		}
		else {
			
			System.out.println("Cuota jubilat amb preu de 20€ con un total de:"+(15*mesos*1.15));
			
		}
		
	}

}
