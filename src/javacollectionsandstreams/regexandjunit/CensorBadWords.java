package javacollectionsandstreams.regexandjunit;

public class CensorBadWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words";
        System.out.println(text.replaceAll("\\b(damn|stupid)\\b", "****"));
    }
}

