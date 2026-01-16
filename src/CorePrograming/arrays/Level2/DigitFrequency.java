package CorePrograming.Arrays.Level2;
import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Handle negative numbers
        if (num < 0) {
            num = -num;
        }

        int temp = num;
        int count = 0;

        // Count digits
        while (temp > 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int index = count - 1;

        temp = num;

        // Extract digits & store in array
        while (temp > 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index--;
        }

        // frequency array
        int[] freq = new int[10];

        // count frequency
        for (int d : digits) {
            freq[d]++;
        }

        // display frequency
        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }

        sc.close();
    }
}


