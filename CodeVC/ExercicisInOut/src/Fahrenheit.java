import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) throws Exception {
    /*Fer la classe necessària per al pas de graus centígrads a graus Fahrenheit.
    Tenint en compte que el càlcul:
    1. Multiplica els graus Centígrads per 9/5.
    2. Suma-li 32è per a adaptar l'equivalent en l'escala Fahrenheit.

    Exemple: converteix 37 °C a Fahrenheit. 37 * 9/5 = 333/5 = 66.6. 66.6 + 32 = 98.6o F.
    Nom de la classe: Fahrenheit
     */
    Scanner sc = new Scanner(System.in);
    System.out.print("Introdueix els graus Centígrads: ");
    double centigrads = sc.nextDouble();
    double fahrenheit = (centigrads * 9/5) + 32;
    System.out.println(centigrads + " °C equivalen a " + fahrenheit + " °F");
    sc.close(); 
    }
}
