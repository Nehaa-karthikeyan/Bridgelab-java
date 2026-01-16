package CorePrograming.Control_Flow.level3;

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int count = 0;
        if (number == 0) {
            count = 1;   // special case: 0 has 1 digit
        } else {
            while (number != 0) {

                number = number / 10;  // remove last digit
                count++;               // count digits
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
