package CorePrograming.Extras.Built_in_functions;
import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2025, 5, 10);
        LocalDate date2 = LocalDate.of(2025, 6, 15);

        if (date1.isBefore(date2)) {
            System.out.println("Date 1 is before Date 2");
        }
        else if (date1.isAfter(date2)) {
            System.out.println("Date 1 is after Date 2");
        }
        else {
            System.out.println("Both dates are the same");
        }
    }
}
