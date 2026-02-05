package javacollectionsandstreams.regexandjunit;



public class UsernameValidation {
    public static void main(String[] args) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        System.out.println("user_123".matches(regex));
        System.out.println("123user".matches(regex));
        System.out.println("us".matches(regex));
    }
}
