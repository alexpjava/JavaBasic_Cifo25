import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class exercici_20B {
    public static void main(String[] args) {
        /*
        Programa que demani el nom, i la operació que es vol fer (afegir el nom a la pregunta) .Les operacions
        possibles són : 1-área del cercle , 2-área del triangle i  3-àrea del quadrat.
        Intentar tenir un únic missatge de sortida.
         */
        Scanner dada = new Scanner(System.in);
        System.out.printf("Quin es el teu nom?");
        String nom = dada.nextLine();
        //dada.nextLine();
        System.out.println(nom + ", quina operacio vols fer?. ");
        System.out.println("Les operacions possibles són : 1-área del cercle , 2-área del triangle i  3-àrea del quadrat.");
        int ope = dada.nextInt();

        if (ope == 1) {
            System.out.println(nom + ", la operacio seleccionada es: Area del cercle");
        } else if (ope == 2) {
            System.out.println(nom + ", la operacio seleccionada es: Area del triangle");
        }else if (ope == 3){
            System.out.println(nom + ", la operacio seleccionada es: Area del quadrat");
        }else {
            System.out.println(nom + ", NO has seleccionat cap operacio");
        }
    }
}