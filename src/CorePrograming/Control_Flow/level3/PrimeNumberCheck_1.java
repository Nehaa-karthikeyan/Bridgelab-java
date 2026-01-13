package CorePrograming.Control_Flow.level3;
import java.util.Scanner;
public class PrimeNumberCheck_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        if (number <= 1) {
            System.out.println(number + " is NOT a Prime Number");
        }
        else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;    // found a divisor
                    break;      // no need to check further
                }
            }
            if (count == 0) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is NOT a Prime Number");
            }
        }
    }
}

