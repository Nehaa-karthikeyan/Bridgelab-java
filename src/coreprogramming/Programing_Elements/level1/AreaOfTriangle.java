package CorePrograming.Programing_Elements.level1;
import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height;
        System.out.print("Enter base in inches: ");
        base = input.nextDouble();
        System.out.print("Enter height in inches: ");
        height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 2.54 * 2.54;
        System.out.println(
                "The area of the triangle in square inches is " + areaInInches +
                        " and in square centimeters is " + areaInCm
        );
    }
}