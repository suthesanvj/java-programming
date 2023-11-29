mport java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        ArrayList<String> names = new ArrayList<>();
        for (int i = 1; i <= numNames; i++) {
            System.out.print("Enter name " + i + ": ");
            names.add(scanner.next());
        }
        System.out.print("Enter sorting order (A for Ascending, D for Descending): ");
        char sortOrder = scanner.next().toUpperCase().charAt(0);
        if (sortOrder == 'A') {
            Collections.sort(names);
        } else if (sortOrder == 'D') {
            Collections.sort(names, Collections.reverseOrder()); 
        } else {
            System.out.println("Invalid sorting order. Please enter A or D.");
            return;
        }
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
OUTPUT:
Enter the number of names: 5
Enter name 1: banana
Enter name 2: carrot
Enter name 3: raddish
Enter name 4: potato
Enter name 5: beans
Enter sorting order (A for Ascending, D for Descending): a
Sorted names:
banana
beans
carrot
potato
raddish
