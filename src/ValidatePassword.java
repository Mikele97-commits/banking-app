import java.util.Scanner;

public class ValidatePassword {
    public static void validate(String password) {
        boolean valid = false;
        do {
            System.out.println("Enter your password");
            Scanner sc = new Scanner(System.in);
            String givenPassword = sc.nextLine();
            if (givenPassword.equals(password)) {
                System.out.println("Your password is valid. You are logged in.");
                valid = true;
            } else {
                System.out.println("Your password is incorrect. Please try again.");
            }
        }while(!valid);
    }


}
