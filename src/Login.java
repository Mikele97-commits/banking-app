import java.util.Scanner;

public class Login {
    public static void login() {
        Scanner sc = new Scanner(System.in);
        String password;
        int accountNumber;
        System.out.println("Enter your username: ");
        String username = sc.nextLine();
        password = CheckForUser.checkForUser(username);
        ValidatePassword.validate(password);
        accountNumber=CheckForUser.accountNumber;
        Menu.menu(accountNumber);
    }
}
