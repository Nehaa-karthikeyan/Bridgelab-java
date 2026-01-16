package CorePrograming.Arrays.Level1;
import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double total = 0.0;

        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            arr[index] = num;
            index++;
        }

        System.out.println("\nNumbers stored in array:");

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
            total += arr[i];
        }

        System.out.println("\n\nTotal = " + total);
    }
}


