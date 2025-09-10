package primerProjecte;

public class HolaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//resolver el problema de la suma
		
		int a, b;
		float suma,multi,divi; //declarar e inicializar dos variables
		a=4;
		b=6;
		suma=a+b;
		multi=a*b;
		divi=a/(float)b;  //   4/6.0
		System.out.println("La suma de "+a+" y de "+b+" es: "+suma);
		System.out.println("La multiplicación de "+a+" y de "+b+" es: "+multi);
		System.out.println("La división de "+a+" y de "+b+" es: "+divi);
		//concatenación
		// problema del sou
		String nom="Pere";
		float sou=1500.05f;  // f o F per floats
		float incr;
		float sou_incr=sou*(1.05f);
		incr=sou*0.05f;
		System.out.println("Querido "+nom+" su sueldo era: "+sou+" y con el incremento de:"+incr+ " su sueldo será de "+sou_incr);
		
	

	}
}
