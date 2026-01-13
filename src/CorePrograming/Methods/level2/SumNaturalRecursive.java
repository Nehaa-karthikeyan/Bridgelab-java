package CorePrograming.Methods.level2;
import java.util.Scanner;

public class SumNaturalRecursive {

    public static int recursiveSum(int n) {
        if(n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if(n <= 0) {
            System.out.println("Invalid input! Natural number must be > 0.");
            return;
        }

        int recSum = recursiveSum(n);
        int formSum = formulaSum(n);

        System.out.println("Sum by recursion = " + recSum);
        System.out.println("Sum by formula = " + formSum);

        if(recSum == formSum)
            System.out.println("Both results match. Correct!");
        else
            System.out.println("Error in computation.");
    }
}


