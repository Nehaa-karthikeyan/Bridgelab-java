package CorePrograming.Control_Flow.level1;
import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + n + " is " + fact);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }
    }
}


