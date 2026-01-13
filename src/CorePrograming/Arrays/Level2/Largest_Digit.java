package CorePrograming.Arrays.Level2;
import java.util.Scanner;

public class Largest_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if (index == maxDigit)
                break; // stop if size reached

            int digit = number % 10;
            digits[index] = digit;

            index++;
            number /= 10;
        }

        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] != largest && digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);
    }
}


