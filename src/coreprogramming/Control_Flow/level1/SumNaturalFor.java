package CorePrograming.Control_Flow.level1;

import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n > 0) {
            int formulaResult = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            System.out.println("Using Formula: " + formulaResult);
            System.out.println("Using Loop: " + loopSum);
            if (formulaResult == loopSum) {
                System.out.println("Both results match ✔");
            } else {
                System.out.println("Results don't match ❌");
            }
        } else {
            System.out.println(n + " is not a natural number!");
        }
    }
}


