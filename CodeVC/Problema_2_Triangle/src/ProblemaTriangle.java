import java.util.Scanner;

public class ProblemaTriangle {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Introduce la base del triángulo: ");
        float basetriangle = sc.nextFloat();

        System.out.print("Introduce la altura del triángulo: ");
        float heighttriangle = sc.nextFloat();

        
        float area = basetriangle * heighttriangle / 2 ;
        System.out.println("El área del triángulo es: " + area);
    
    
    }
}
