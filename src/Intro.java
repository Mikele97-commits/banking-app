public class Intro {
    public static void intro() throws InterruptedException {
        System.out.printf("Welcome to your banking app!\nPlease enter your username: ");
        String username = "Username";
        String password = "********";
        Thread.sleep(1500);
        for (int i = 0; i < username.length(); i++) {
            System.out.printf("%c", username.charAt(i));
            Thread.sleep(250);
        }
        System.out.printf("\nPlease enter your password: ");
        Thread.sleep(1500);
        for (int i = 0; i < password.length(); i++) {
            System.out.printf("%c", password.charAt(i));
            Thread.sleep(250);
        }
        System.out.printf("\nYou have successfully logged in!");
        Thread.sleep(1000);
        for (int i=0; i<10; i++){
            System.out.println(" ");
            Thread.sleep(200);
        }
    }
}
