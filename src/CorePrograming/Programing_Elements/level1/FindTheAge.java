package CorePrograming.Programing_Elements.level1;

import java.util.Scanner;

public class FindTheAge {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the current year");
        int cy=sc.nextInt();
        System.out.println("Enter the birth year");
        int by=sc.nextInt();
        int current_age=cy-by;
        System.out.println("the current age is "+ current_age);
    }
}
