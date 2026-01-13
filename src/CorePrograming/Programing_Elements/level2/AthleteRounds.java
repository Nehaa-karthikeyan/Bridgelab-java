package CorePrograming.Programing_Elements.level2;


import java.util.Scanner;

public class AthleteRounds {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 (meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 (meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 (meters): ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistanceMeters = 5000;
        double rounds = totalDistanceMeters / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        sc.close();
    }
}
