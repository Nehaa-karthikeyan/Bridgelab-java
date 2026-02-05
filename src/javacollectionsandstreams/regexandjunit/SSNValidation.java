package javacollectionsandstreams.regexandjunit;

public class SSNValidation {
    public static void main(String[] args) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        System.out.println("123-45-6789".matches(regex));
        System.out.println("123456789".matches(regex));
    }
}

