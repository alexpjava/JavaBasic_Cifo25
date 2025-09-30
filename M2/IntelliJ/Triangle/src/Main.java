//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(10,20);

        triangle1.getAltura();
        triangle1.getBase();
        System.out.println("El area del triangle es: "+ triangle1.getArea());

        System.out.println("El area del " +  Triangle.class + " es: "+ triangle1.getArea());

    }
}