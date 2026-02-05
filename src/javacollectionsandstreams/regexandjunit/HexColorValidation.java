package javacollectionsandstreams.regexandjunit;

public class HexColorValidation {
    public static void main(String[] args) {
        String regex = "^#[0-9A-Fa-f]{6}$";

        System.out.println("#FFA500".matches(regex));
        System.out.println("#123".matches(regex));
    }
}

