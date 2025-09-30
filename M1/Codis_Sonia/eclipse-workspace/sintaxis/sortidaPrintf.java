package ejerciciosSintaxis;

public class sortidaPrintf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero=42;
		boolean b=true ;
		double d=145.12;
		float decimal=47.584f;
		String nom="Juan";
		char letra='j';
		
		System.out.printf("El valor del numero és %d i el valor del booleà és %b i el valor del nom és %s %n ",numero,b , nom );
		System.out.printf("El valor del decimal és %.2f i el valor del d és %.2f ", decimal, d);
		System.out.printf("%n  El valor del nom és %s  %n  El valor de la lletra és %c  %n  El  valor del decimal és %.1f   %n ",nom,letra,decimal);
		String saludo1="Hola \"Mundo\"!"; // sortirà literal amb les ""
		System.out.println(saludo1);
		String saludo2="Hola \n Mundo!"; // farà un salt de línia
		System.out.println(saludo2);
		String saludo3="Hola \tMundo"; // farà una tabulació
		System.out.println(saludo3);
	}

}
