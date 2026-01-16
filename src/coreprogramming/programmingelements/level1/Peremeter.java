package CorePrograming.Programing_Elements.level1;

import java.util.Scanner;

public class Peremeter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the peremeter");
        double pere=sc.nextDouble();
        double side=pere/4;
        System.out.println("the side of the peremeter " + pere+" is "+ side);
    }
}
