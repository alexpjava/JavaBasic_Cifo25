import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        /*
        Realitzar la multiplicació de cinc números entrats per teclat.
        Sortida: el producte dels números i quants hi ha imparells i quants parells.
         */
        int[] array = new int[5];
        System.out.println(array.length);

        Scanner dada = new Scanner(System.in);
        int total = 1;
        int countP = 0;
        int countS = 0;


        for (int i = 0; i < array.length; i++){
            System.out.println("Dona´m un numero.");
            array [i] = dada.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            total *= array[i];
            if (array[i] % 2 == 0){
                countP += 1;
            }else {
                countS +=1;
            }
        }
        System.out.println("La multiplicacio del numeros es: " + total);
        System.out.println("Hi han " + countP + " numero parrells");
        System.out.println("Hi han " + countS + " numero senars");

    }
}