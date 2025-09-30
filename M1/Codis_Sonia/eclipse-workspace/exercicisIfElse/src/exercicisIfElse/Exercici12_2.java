package exercicisIfElse;

import java.util.Scanner;

public class Exercici12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Donada una edat que aparegui  un missatge amb les tarifes d’un gimnàs.
	//  Infants (menors de 6 anys majors 0)   0€
	//  Nen (a partir de 6 anys i menor de 12 anys ) 15€
	//  Jove (a partir de 12 anys i menys de 30 anys 25€)
//		Adult (a partir de 30 anys i menys de 65 anys 30€)
//		Jubilats (a partir de 65 anys 20€)
//		Afegir: demanar els mesos de matricula i donar el cost total amb un 15% d’iva 
			int edat, mesos;
			float tarifa, iva=1.15f;
			String tipoCuota;
			Scanner buffer=new Scanner(System.in);
			System.out.println("Su edad?");
			edat=buffer.nextInt();
			
			System.out.println("Cuántos meses desea inscribirse?");
			mesos=buffer.nextInt();
			
			if(edat>0 && edat<6) {
				tarifa=0f;
				tipoCuota="infant";
			}
			else if(edat>6 && edat<12) {
				tarifa=15f;
				tipoCuota="nen";
			}
			else if(edat>=12 && edat<30) {
				tarifa=20f;
				tipoCuota="joven";
			}	
			else if(edat>=30 && edat<65) {
				tarifa=30f;
				tipoCuota="adulto";
			}
			else {
				tarifa=20f;
				tipoCuota="jubilado";
	          }
	System.out.println("Cuota"+tipoCuota+" amb preu de "+tarifa+"€ con un total de:"+(tarifa*mesos*iva));	
	} 
}
