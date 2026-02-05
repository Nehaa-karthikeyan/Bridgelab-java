package javacollectionsandstreams.regexandjunit;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "This   is   an   example";
        System.out.println(text.replaceAll("\\s+", " "));
    }
}
