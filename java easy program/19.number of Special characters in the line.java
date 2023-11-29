import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        printSpecialCharacters(inputLine);
        scanner.close();
    }
    static void printSpecialCharacters(String inputLine) {
        int specialCharacterCount = 0;
        System.out.println("Special characters in the line:");
        for (int i = 0; i < inputLine.length(); i++) {
            char currentChar = inputLine.charAt(i);
            if (!Character.isLetterOrDigit(currentChar) && !Character.isWhitespace(currentChar)) {
                System.out.println(currentChar);
                specialCharacterCount++;
            }
        }

        System.out.println("Number of special characters: " + specialCharacterCount);
    }
}
OUTPUT:
Enter a line of text: I am a hardworker!
Special characters in the line:
!
Number of special characters: 1
