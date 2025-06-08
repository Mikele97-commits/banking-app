import java.util.Scanner;

public class Menu {
    public static void menu(int accountNumber) {
        boolean exit = false;
        int customerNumber;
        CustomerList list = new CustomerList();
        /*for (int i = 1; i <= list.GetCustomerCount(); i++) {
            if (list.GetAccountNumber(i)==accountNumber) {
                customerNumber = i;
            }
        }*/

        while (!exit) {
            System.out.print("Welcome to C Banking App\nWhat would you like to do?\nList of available actions: \n Check account\n Deposit\n Withdraw\n Transfer\n Exchange\n Exit\n");
            Scanner sc = new Scanner(System.in);
            BalanceList balanceList = new BalanceList();
            String choice = sc.nextLine();
            switch (choice) {
                case "Check account":
                    balanceList.checkBalance(accountNumber);
                    break;
                case "Deposit":
                    Deposit.deposit(accountNumber);
                    break;
                case "Withdraw":
                    Withdraw.withdraw(accountNumber);
                    break;
                case "Transfer":
                    Transfer.transfer(accountNumber);
                    break;
                case "Exchange":
                    Exchange.exchange(accountNumber);
                    break;
                case "Exit":
                    exit = true;
                    break;
            }
        }
    }
}
