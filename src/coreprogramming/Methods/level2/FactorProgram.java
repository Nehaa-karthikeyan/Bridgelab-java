package CorePrograming.Methods.level2;
import java.util.Scanner;

public class FactorProgram {

    public static int[] findFactors(int number) {
        int count = 0;

        // First loop to count factors
        for(int i = 1; i <= number; i++) {
            if(number % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    public static int sumOfFactors(int[] arr) {
        int sum = 0;
        for(int num : arr)
            sum += num;
        return sum;
    }

    public static int productOfFactors(int[] arr) {
        int product = 1;
        for(int num : arr)
            product *= num;
        return product;
    }

    public static double sumOfSquareFactors(int[] arr) {
        double sum = 0;
        for(int num : arr)
            sum += Math.pow(num, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for(int f : factors)
            System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors = " + sumOfFactors(factors));
        System.out.println("Product of factors = " + productOfFactors(factors));
        System.out.println("Sum of square of factors = " + sumOfSquareFactors(factors));
    }
}


