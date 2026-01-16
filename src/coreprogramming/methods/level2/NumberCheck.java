package CorePrograming.Methods.level2;
import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if(a > b) return 1;
        else if(a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nResults:");
        for(int num : arr) {
            if(isPositive(num)) {
                if(isEven(num))
                    System.out.println(num + " is Positive and Even");
                else
                    System.out.println(num + " is Positive and Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }

        System.out.println();
        int result = compare(arr[0], arr[4]);

        if(result == 1)
            System.out.println("First element is greater than last");
        else if(result == 0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less than last");
    }
}


