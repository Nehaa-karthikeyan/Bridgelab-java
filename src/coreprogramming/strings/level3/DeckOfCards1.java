package CorePrograming.Strings.level3;
import java.util.Random;
import java.util.Scanner;

public class DeckOfCards1 {

    public static String[] initDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10",
                "Jack","Queen","King","Ace"};

        int numCards = suits.length * ranks.length;
        String[] deck = new String[numCards];
        int index = 0;

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    public static String[] shuffle(String[] deck) {
        Random r = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + r.nextInt(deck.length - i);
            String t = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = t;
        }
        return deck;
    }

    public static String[][] distribute(String[] deck, int cards, int players) {

        if (cards * players > deck.length) {
            System.out.println("Not enough cards!");
            return null;
        }

        String[][] result = new String[players][cards];
        int k = 0;

        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                result[i][j] = deck[k++];

        return result;
    }

    public static void display(String[][] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < result[i].length; j++)
                System.out.print(result[i][j] + ", ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] deck = initDeck();
        deck = shuffle(deck);

        int players = sc.nextInt();
        int cards = sc.nextInt();

        String[][] res = distribute(deck, cards, players);

        if (res != null) display(res);
    }
}


