import java.util.Scanner;

public class Intro {
    public static void intro() {
        Scanner in = new Scanner(System.in);
        CustomerList list = new CustomerList();
        BalanceList balanceList = new BalanceList();
        boolean done = false;
        while (!done) {
        System.out.println("Welcome to your banking app!\nDo you want to 'login', or 'create' a new account?\n'exit' to close the application.");
        switch (in.nextLine()) {
            case "create":
                CreateCustomer.createCustomer();
                break;
            case "login":
                Login.login();
                break;
            case "default":
                list.AddCustomer("Name1", "lName1", "password1", "User1", 2139049, 1);
                list.AddCustomer("Name2", "lName2", "password2", "User2", 2135347, 2);
                Balance balance1 =  new Balance(2139049,50,0,0,0,0);
                Balance balance2 =  new Balance(2135347,0,0,0,0,0);
                balanceList.addBalance(balance1);
                balanceList.addBalance(balance2);
                                break;
            case "check": {
                for (int i = 1; i <= list.GetCustomerCount(); i++) {
                    System.out.println(list.GetUsername(i));
                }
                break;
            }
            case "exit": {
                done = true;
            }
        }
        }
    }
}

