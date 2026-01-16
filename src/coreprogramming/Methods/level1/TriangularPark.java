package CorePrograming.Methods.level1;
import java.util.Scanner;

public class TriangularPark {

    public static double calculateRounds(double s1, double s2, double s3) {
        double perimeter = s1 + s2 + s3;
        double distance = 5000; // meters (5 km)
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 (meters): ");
        double s1 = sc.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double s2 = sc.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);

        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km.");
    }
}


