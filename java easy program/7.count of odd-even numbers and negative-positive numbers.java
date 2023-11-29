import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a list of numbers separated by spaces: ");
        String input = scanner.nextLine();

        
        String[] numStrings = input.split(" ");

        
        int oddCount = 0;
        int evenCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        
        for (String numString : numStrings) {
            
            int num = Integer.parseInt(numString);

            
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            }
        }

        
        System.out.println("Odd numbers count: " + oddCount);
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);

        
        scanner.close();
    }
}
OUTPUT:
Enter a list of numbers separated by spaces: 2 5 4 7 6 8 0 9 1
Odd numbers count: 4
Even numbers count: 5
Positive numbers count: 8
Negative numbers count: 0
