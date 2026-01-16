package CorePrograming.Control_Flow.level3;

import java.util.Scanner;

public class LeapYearLogical {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year:");
        int year = sc.nextInt();

        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("Year should be greater than or equal to 1582.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}


