package javacollectionsandstreams.regexandjunit;

public class CreditCardValidation {
    public static void main(String[] args) {
        String regex = "^(4\\d{15}|5\\d{15})$";

        System.out.println("4123456789012345".matches(regex));
        System.out.println("5123456789012345".matches(regex));
    }
}
