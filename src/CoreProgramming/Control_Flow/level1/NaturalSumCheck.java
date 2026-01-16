package CorePrograming.Control_Flow.level1;
import java.util.Scanner;

public class NaturalSumCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n > 0) {
            int formulaSum = n * (n + 1) / 2;
            int whileSum = 0;
            int i = 1;
            while(i <= n) {
                whileSum += i;
                i++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);
            if(formulaSum == whileSum) {
                System.out.println("Both results match ✔");
            } else {
                System.out.println("Results do NOT match ❌");
            }
        } else {
            System.out.println("The number is not a natural number");
        }

        sc.close();
    }
}


