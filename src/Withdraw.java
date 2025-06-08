import java.util.Scanner;

public class Withdraw {
    public static void withdraw(int accountNumber) {
        BalanceList balanceList = new BalanceList();
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to withdraw? USD only");
        double amount=input.nextDouble();
        if(amount> balanceList.getUSD(accountNumber)){
        System.out.println("You don't have enough money");
        }
        else{
            balanceList.withdraw(accountNumber,amount);
            System.out.println("You have successfully withdrawn " + amount + " USD from the account.");
            System.out.println("Your current USD on account: " + balanceList.getUSD(accountNumber));
        }


    }
}
