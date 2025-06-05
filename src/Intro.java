public class Intro {
    public static void intro() throws InterruptedException {
        System.out.print("Welcome to your banking app!\nPlease enter your username: ");
        String username = "Username";
        String password = "********";
        Thread.sleep(1500);
        for (int i = 0; i < username.length(); i++) {
            System.out.printf("%c", username.charAt(i));
            Thread.sleep(250);
        }
        System.out.print("\nPlease enter your password: ");
        Thread.sleep(1500);
        for (int i = 0; i < password.length(); i++) {
            System.out.printf("%c", password.charAt(i));
            Thread.sleep(250);
        }
        System.out.print("\nYou have successfully logged in!");
        Thread.sleep(1000);
        for (int i=0; i<10; i++){
            System.out.println(" ");
            Thread.sleep(200);
        }
    }
}
