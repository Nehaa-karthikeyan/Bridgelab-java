package CorePrograming.Control_Flow.level2;
import java.util.Scanner;
public class Multiples_Below_100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number less than 100:");
        int number = sc.nextInt();
        if(number > 0 && number < 100) {
            int counter = number - 1; // start from number - 1
            System.out.println("Multiples of " + number + " below 100:");
            while(counter >= 1) {
                if((number * counter) < 100) {
                    System.out.println(number * counter);
                }
                counter--;
            }

        } else {
            System.out.println("Invalid Input! Number must be > 0 and < 100");
        }
    }
}

