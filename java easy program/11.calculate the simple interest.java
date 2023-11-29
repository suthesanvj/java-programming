import java.util.Scanner;

public class SimpleInterestCalculator {
    static double calculateSimpleInterest(double principal, double rate, double time) {
        double interestRate = (principal >= 100000) ? 0.12 : 0.10;
        double simpleInterest = (principal * interestRate * time) / 100;
        return simpleInterest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Is the customer a senior citizen? (true/false): ");
        boolean isSeniorCitizen = scanner.nextBoolean();

        double simpleInterest = calculateSimpleInterest(principal, 0, time);
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}

OUTPUT:
Enter the principal amount: 200000
Enter the time (in years): 3
Is the customer a senior citizen? (true/false): false
Simple Interest: 720.0
