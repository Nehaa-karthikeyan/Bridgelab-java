package javacollectionsandstreams.regexandjunit;

import java.util.regex.*;

public class ExtractDates {
    public static void main(String[] args) {
        String text = "Dates: 12/05/2023, 15/08/2024, 29/02/2020";
        Pattern p = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
