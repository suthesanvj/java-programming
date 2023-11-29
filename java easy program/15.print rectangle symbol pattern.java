import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the symbol you want to use: ");
        char symbol = scanner.next().charAt(0);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        printRectangle(symbol, rows, columns);

        scanner.close();
    }
    private static void printRectangle(char symbol, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
OUTPUT:
Enter the symbol you want to use: %
Enter the number of rows: 6
Enter the number of columns: 5
% % % % % 
% % % % % 
% % % % % 
% % % % % 
% % % % % 
% % % % % 
