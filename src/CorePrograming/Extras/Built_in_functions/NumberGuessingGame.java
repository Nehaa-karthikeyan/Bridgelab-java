package CorePrograming.Extras.Built_in_functions;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }

    static String getFeedback(Scanner sc) {
        System.out.print("Is it high, low or correct? ");
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;

        System.out.println("Think of a number between 1 and 100");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! Computer guessed it.");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
}

