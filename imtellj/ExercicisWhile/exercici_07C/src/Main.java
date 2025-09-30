import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");
        /*
        S'ingressen tres notes d'un alumne, si la mitjana és major o igual a 6 apareix ‘apte’
        en cas contrari apareix ‘no apte’.
         */
        float[] array = new float[3];
        float mitja = 0f;
        Scanner dada = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            System.out.println("Dona´m una nota:");
            array[i] = dada.nextFloat();
            mitja += array[i];
        }
        mitja = (mitja / array.length);
        if (mitja >= 6){
            System.out.println("APTE");
        }else{
            System.out.println("NO APTE");
        }

    }
}