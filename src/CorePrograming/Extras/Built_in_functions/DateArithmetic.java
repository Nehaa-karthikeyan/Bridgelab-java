package CorePrograming.Extras.Built_in_functions;
import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2025, 1, 10);

        LocalDate result = date
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Original Date: " + date);
        System.out.println("Final Date: " + result);
    }
}

