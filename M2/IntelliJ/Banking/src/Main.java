import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Using the constructor with only accountNumber (balance = 0, date = today)
        Account acc1 = new Account("A1001");
        Account acc2 = new Account("A1002");

        // Using the constructor with all parameters
        Account acc3 = new Account("A1003", LocalDate.of(2023, 5, 10), 500.0f);
        Account acc4 = new Account("A1004", LocalDate.of(2024, 1, 15), 1200.5f);
        Account acc5 = new Account("A1005", LocalDate.now(), 300.0f);

        // Display info
        acc1.accountInfo();
        System.out.println();
        acc2.accountInfo();
        System.out.println();
        acc3.accountInfo();
        System.out.println();
        acc4.accountInfo();
        System.out.println();
        acc5.accountInfo();

        System.out.println("The total account is: " + Account.getNumberOfAccounts());
    }
}
