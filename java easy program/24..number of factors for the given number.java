import java.util.Scanner;

public class FactorCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int numberOfFactors = countFactors(number);
            System.out.println("The number of factors for " + number + " is: " + numberOfFactors);
        }
        scanner.close();
    }
    private static int countFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
OUTPUT:
Enter a positive integer: 22
The number of factors for 22 is: 4
