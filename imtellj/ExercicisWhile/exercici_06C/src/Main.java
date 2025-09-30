import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    /*
    Escriure un programa que llegeixi 10 notes d'alumnes i ens informi de quants té una nota major o igual
    a 7 i quants menors a 7.
    */
        //System.out.println("Hello world!");
        Scanner dada = new Scanner(System.in);
        int[] array = new int[10];
        int count_M7 = 0;
        int count_m7 = 0;

        for (int i=0; i < array.length; i++){
            System.out.println("Dona´m una nota. ");
            array[i] = dada.nextInt();
        }
        for (int i=0; i < array.length; i++){
            if (array[i] >= 7){
                count_M7 += 1;
            }else {
                count_m7 +=1;
            }
        }
        System.out.println("Hi han " + count_M7 + " notes mayors de 7.");
        System.out.println("Hi han " + count_m7 + " notes menors de 7.");

    }
}