package ejerciciosSintaxis;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// àrea del triangle (base * altura)/2
		float base,altura,areaT;
		final int v=5; // definició de constant
		base=15f;
		altura=45f;
		areaT=(base*altura)/2;
		System.out.println("El área del triángulo es:"+areaT);
		// àrea del cercle (3.1415*radio*radio)
		final float pi=3.1415f;
		float radio=14.52f;
		float areaC= pi*radio*radio;
		System.out.println("El área del cercle es:"+areaC);
		System.out.println("El área del cercle es:"+(pi*radio*radio));

	}

}
