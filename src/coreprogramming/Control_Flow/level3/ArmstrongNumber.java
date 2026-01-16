package CorePrograming.Control_Flow.level3;
import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;                     // Step 1: sum initialized
        int originalNumber = number;     // Step 2: store original number

        while (originalNumber != 0) {
            int digit = originalNumber % 10; // get last digit
            sum = sum + (digit * digit * digit); // cube digit & add to sum
            originalNumber = originalNumber / 10; // remove last digit
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }
    }
}


