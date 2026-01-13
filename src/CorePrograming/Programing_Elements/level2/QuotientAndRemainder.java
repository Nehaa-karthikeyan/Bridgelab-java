package CorePrograming.Programing_Elements.level2;

import java.util.Scanner;

public class QuotientAndRemainder {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the divident");
        int divident=sc.nextInt();
        System.out.println("enter the divisor");
        int divisor=sc.nextInt();
        double quotient=divident/divisor;
        double remanider=divident%divisor;
        System.out.println("the quotient is "+ quotient);
        System.out.println("the remainder is "+ remanider);
    }
}
