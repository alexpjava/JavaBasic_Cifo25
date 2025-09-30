import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        /*
        Llegir un número i mostrar el seu quadrat, repetir el procés
        fins que s'introdueixi un número negatiu.
         */
        Scanner dada = new Scanner(System.in);
        //System.out.println("Dona´m un numero");
        //float num = dada.nextFloat();

        while (true){
            System.out.println("Dona´m un numero");
            float num = dada.nextFloat();
            if (num > 0){
                float poten = (float) Math.pow(num, 2);
                System.out.println("La potencia del " + num + " es: " + poten);
            }else{
                System.out.println("El numero " + num + " es negatiu o 0.");
                break;
            }


        }
    }
}