import java.util.Scanner;

public class Transfer {
    public static void transfer(int from) {
        double amount;
        BalanceList list = new BalanceList();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of USD to transfer: ");
        amount = in.nextDouble();
        System.out.println("Enter number of account to which you would like to transfer: ");
        int toAccount = in.nextInt();
        boolean found = false;
        if (list.getUSD(from) < amount) {
            System.out.println("You don't have enough USD to transfer.");
        } else {
            for (int i = 1; i <= list.getBalanceCount(); i++) {

                if (toAccount == list.getAccountNumber(i - 1)) {
                    list.deposit(toAccount, amount);
                    list.withdraw(from, amount);
                    System.out.println("Account have been found. " + amount + " USD have been transferred.");
                    found = true;
                }

            }
            if (!found) {
                System.out.println("Account not found.");
            }
        }
    }
}
