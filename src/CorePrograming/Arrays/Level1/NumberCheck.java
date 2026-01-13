package CorePrograming.Arrays.Level1;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        // taking input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // checking each number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " is a Positive number");

                if (arr[i] % 2 == 0) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            }
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is a Negative number");
            }
            else {
                System.out.println(arr[i] + " is Zero");
            }
        }

        // comparing first and last
        System.out.println("\nComparing first and last elements:");

        if (arr[0] == arr[4]) {
            System.out.println("First and last elements are equal.");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is greater than last.");
        } else {
            System.out.println("Last element is greater than first.");
        }
    }
}


