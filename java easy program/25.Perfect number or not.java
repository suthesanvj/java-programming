import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
        scanner.close();
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false; // Perfect numbers are positive integers greater than 1
        }
        int sum = 1; // Start with 1 as the sum of proper divisors
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }
        return sum == number;
    }
}
OUTPUT:
Enter a number: 128
128 is not a perfect number.
