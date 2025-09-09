import java.io.PrintStream;

public class ProblemaSou {
    private static PrintStream printf;

    public static void main(String[] args) throws Exception {
        
        String  name = "John";
        float sou;
        sou = (float) 12345.67;
        printf = System.out.printf("Name: %s\nSalary: %.2f\n", name, sou);
    }
}
