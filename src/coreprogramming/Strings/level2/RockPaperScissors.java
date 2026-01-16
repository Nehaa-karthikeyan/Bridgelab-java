package CorePrograming.Strings.level2;
import java.util.Scanner;

public class RockPaperScissors {

    public static String compChoice() {
        int n = (int)(Math.random() * 3);
        return (n == 0) ? "rock" : (n == 1) ? "paper" : "scissors";
    }

    public static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";

        if (user.equals("rock") && comp.equals("scissors")) return "User";
        if (user.equals("scissors") && comp.equals("paper")) return "User";
        if (user.equals("paper") && comp.equals("rock")) return "User";

        return "Computer";
    }

    public static String[][] results(int games) {
        Scanner sc = new Scanner(System.in);

        int userW = 0, compW = 0;

        String[][] record = new String[games + 1][3];

        for (int i = 0; i < games; i++) {

            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next();

            String comp = compChoice();
            String win = winner(user, comp);

            if (win.equals("User")) userW++;
            else if (win.equals("Computer")) compW++;

            record[i][0] = user;
            record[i][1] = comp;
            record[i][2] = win;
        }

        record[games][0] = "Win% User = " + ((userW * 100) / games);
        record[games][1] = "Win% Computer = " + ((compW * 100) / games);
        record[games][2] = "";

        return record;
    }

    public static void display(String[][] arr) {
        System.out.println("User\tComputer\tWinner");
        for (String[] x : arr)
            System.out.println(x[0] + "\t" + x[1] + "\t" + x[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many games? ");
        int n = sc.nextInt();

        display(results(n));
    }
}


