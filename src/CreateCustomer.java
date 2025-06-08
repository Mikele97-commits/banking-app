import java.util.Random;
import java.util.Scanner;

public class CreateCustomer {
    int customerid=0;
    public static void createCustomer() {
        CustomerList list = new CustomerList();
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Please enter your first name: ");
        String first_name = in.nextLine();
        System.out.print("Please enter your last name: ");
        String last_name = in.nextLine();
        boolean flag = false;
        String password="password";
        do {
            System.out.print("Please enter your password: ");
            String password1 = in.nextLine();
            System.out.print("Please repeat password: ");
            String repeat_password = in.nextLine();
            if (password1.equals(repeat_password)) {
                flag = true;
                password = password1;
            }
            else {
                System.out.println("Passwords do not match, try again");
            }
        }while(!flag);
        System.out.println("Please enter your username: ");
        String username = in.nextLine();
        int number = rand.nextInt(100000000, 999999999);
        boolean flag1 = false;
        do {
            flag1 = false;
            for (int i = 1; i <= list.GetCustomerCount(); i++) {
            if (number == list.GetAccountNumber(list.GetCustomerID(i))) {
                flag1 = true;
                number = rand.nextInt(100000000, 999999999);
             }
            }
        }while(flag1);
        System.out.println("System generated bank account number: " + number);
        int customer_id= list.GetCustomerCount()+1;
        Customer customer = new Customer(first_name, last_name, password, username, number, customer_id);
        list.AddCustomer(first_name, last_name, password, username, number, customer_id);
        System.out.println("Your customer account has been created");
        Balance balance= new Balance(number, 0, 0, 0, 0, 0);
        BalanceList balanceList = new BalanceList();
        balanceList.addBalance(balance);
        Intro.intro();

    }
}
