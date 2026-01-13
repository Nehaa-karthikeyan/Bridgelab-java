package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;

class Library {
    String title;
    String author;
    double price;
    boolean available;

    Library(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    void display() {
        System.out.println(title + " | Available: " + available);
    }

    public static void main(String[] args) {
        Library b = new Library("OOP Java", "James", 500);
        b.display();
        b.borrowBook();
        b.display();
    }
}
