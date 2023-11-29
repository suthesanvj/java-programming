import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        printInvertedFullPyramid(numRows);
        scanner.close();
    }
    static void printInvertedFullPyramid(int numRows) {
        for (int i = numRows; i >= 1; i--) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
OUTPUT:
Enter the number of rows: 5
*********
 *******
  *****
   ***
    *
