import java.util.Scanner;

public class Deposit {
    public static void deposit(int accountNumber) {
        BalanceList balance = new BalanceList();
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to deposit? USD only");
        double amount=input.nextDouble();
        balance.deposit(accountNumber,amount);
        System.out.println("You have deposited " + amount + " USD");
    }
}
