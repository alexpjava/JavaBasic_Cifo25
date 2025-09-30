package funcions;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2) Funció amb paràmetres i con return
		int a=3;
		int b=9;
		int z;
		float n1=45.2f;
		float result;
		z=sumar(a,b);
		System.out.println("La suma es:"+z);
		result=multiplicar(a,n1);
		         //int passa a float
		System.out.println("La multi de:"+a+"y de :"+n1+"es:"+z);
		
	
	}
	
	public static int sumar(int x,int y) {
		int suma;
		suma=x+y; //12
		return suma;    //return x+y;
	}
	//multiplicar con parámetros float y con return
	public static float multiplicar(float x,float y) {
		return x*y;
	}
 
}
