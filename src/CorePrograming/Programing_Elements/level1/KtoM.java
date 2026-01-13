package CorePrograming.Programing_Elements.level1;

import java.util.Scanner;

public class KtoM {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the kilometer");
        int kilo=sc.nextInt();
        double Miles = kilo * 0.621371;
        System.out.println("the Miles "+ Miles);

    }

}
