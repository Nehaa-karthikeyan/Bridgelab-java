package CorePrograming.Programing_Elements.level2;
import java.util.Scanner;

public class ChocolateDistribution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remaining = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + ""
                + " and the number of remaining chocolates are " + remaining);
        sc.close();
    }
}

