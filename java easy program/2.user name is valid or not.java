import java.util.Scanner;

public class UserNameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();
      
        if (isValidUsername(username)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username. Please make sure it has 5 to 15 characters.");
        }
      
        scanner.close();
    }

    private static boolean isValidUsername(String username) {
        int minLength = 5;
        int maxLength = 15;

        if (username.length() >= minLength && username.length() <= maxLength) {
            return true;
        } else {
            return false;
        }
    }
}
OUTPUT:
Enter a username: saveetha@123
Valid username!
