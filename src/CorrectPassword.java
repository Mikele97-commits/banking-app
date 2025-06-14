import java.util.Scanner;

public class CorrectPassword {
    public static String correctPassword(String password) {
        Scanner sc = new Scanner(System.in);
        boolean correct = true;
        do {
            correct = true;
            int uppercaseCounter = 0;
            int lowercaseCounter = 0;
            boolean ASCIIfound = false;
            int passwordLength = password.length();
            if (passwordLength < 8) {
                correct = false;
            }
            for (int i = 0; i < passwordLength; i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    uppercaseCounter++;
                }
            }
            if (uppercaseCounter<1) {
                correct = false;
            }
            for (int i = 0; i < passwordLength; i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    lowercaseCounter++;
                }
            }
            if (lowercaseCounter<1) {
                correct = false;
            }
            for (int i = 0; i < passwordLength; i++) {
                char c = password.charAt(i);
                int ASCII = (int) c;
                if (!(ASCII >= 65 && ASCII <= 90) && !(ASCII >= 97 && ASCII <= 122) && !(ASCII <= 32)) {
                    ASCIIfound = true;
                    break;
                }
            }
            if (!ASCIIfound) {
                correct = false;
            }

            if(!correct) {
                System.out.println("Incorrect Password, try again");
                password= sc.nextLine();
            }
            else {
                System.out.println("Password correct");
            }
        }while (!correct);
        return password;

    }
}
