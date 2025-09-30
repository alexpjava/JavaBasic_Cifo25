package funcions;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3) Funció sense paràmetres i amb return
		int z;
		z=sumar();
		System.out.println("La suma es:"+z);
		float w;
		w=multiplicar();
		System.out.println("La multi es:"+w);
	}

	
	public static int sumar() {
		int x=4;
		int y=5;
		return x+y;
	}
	
	public static float multiplicar() {
		float x=2f;
		float y=9f;
		return x*y;
	}
}
