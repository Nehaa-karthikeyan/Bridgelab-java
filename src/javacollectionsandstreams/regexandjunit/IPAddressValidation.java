package javacollectionsandstreams.regexandjunit;

public class IPAddressValidation {
    public static void main(String[] args) {
        String regex =
                "^(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)){3}$";

        System.out.println("192.168.1.1".matches(regex));
    }
}
