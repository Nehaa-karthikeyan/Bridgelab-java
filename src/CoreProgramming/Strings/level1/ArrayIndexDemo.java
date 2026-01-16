package CorePrograming.Strings.level1;
public class ArrayIndexDemo {

    public static void generate() {
        String[] arr = {"A", "B", "C"};
        System.out.println(arr[5]); // crash
    }

    public static void handle() {
        try {
            String[] arr = {"A", "B", "C"};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        // generate();
        handle();
    }
}

