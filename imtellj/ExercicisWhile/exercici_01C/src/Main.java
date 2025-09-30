public class Main {
    public static void main(String[] args) {
        /*
        Programa Java que doni els números de l'1 al 100 (utilitzant la instrucció while)
        em mostri quants són múltiples de dues , quants de 3 i quants de 5.

         */
        //System.out.println("Hello world!");
        int i = 1;

        while (i <= 100){
            if (i % 2 == 0){
                System.out.println("El numero " + i + " es multiple de 2.");
            }else if (i % 3 == 0){
                System.out.println("El numero " + i + " es multiple de 3.");
            }else if (i % 5 == 0) {
                System.out.println("El numero " + i + " es multiple de 5.");
            }else{
                System.out.println("El numero " + i + " NO ES MULTIPLO NI DE 2 o 3 o 5!!");
            }
            i += 1;
        }

    }
}