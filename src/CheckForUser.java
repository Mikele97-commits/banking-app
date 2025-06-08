import java.util.Scanner;

public class CheckForUser {
    static int accountNumber;
    public static String checkForUser(String username) {
        Scanner sc = new Scanner(System.in);
        CustomerList list = new CustomerList();
        boolean found = false;
        String password = "";
        do {
            for (int i = 1; i <= list.GetCustomerCount(); i++) {
                if (list.GetUsername(i).equals(username)) {
                    found = true;
                    password = list.GetPassword(i);
                    accountNumber = list.GetAccountNumber(i);
                    break;
                }
            }
            if (!found) {
                System.out.println( "User not found, please try again");
                username=sc.nextLine();
            }
        }while (!found);
        return password;
    }

    public int GetAccountNumber() {
        return accountNumber;
    }
}
