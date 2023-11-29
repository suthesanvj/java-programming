import java.util.Scanner;
eligible for vote or not.java
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        
        if (isEligibleForVote(age)) {
            System.out.println("You are eligible to vote!");
        } else {
            int yearsLeft = calculateYearsLeft(age);
            System.out.println("You are not eligible to vote. You can vote in " + yearsLeft + " years.");
        }

       
        scanner.close();
    }

    
    private static boolean isEligibleForVote(int age) {
        
        return age >= 18;
    }

    private static int calculateYearsLeft(int age) {
      
        return 18 - age;
    }
}
OUTOUT:
Enter your age: 18
You are eligible to vote!
