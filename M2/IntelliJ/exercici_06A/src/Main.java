

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        float num1 = 15f;
        float num2 = 20f;

        float resultatQ = Exercici_06A.quadrada(num1);
        System.out.println("La rael de " + num1 + " es: " + resultatQ);

        float resultatP = Exercici_07A.potencia(num1,num2);
        System.out.println("La potenca de " + num1 + " elevada a " + num2 + " es: " + resultatP);

        float resultatM = Exercici_08A.max (num1, num2);
        System.out.println("El numero mes gran de " + num1 + " y " + num2 +  " es: " + resultatM);
    }


}