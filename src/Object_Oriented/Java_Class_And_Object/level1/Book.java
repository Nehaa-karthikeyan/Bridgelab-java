package Object_Oriented.Java_Class_And_Object.level1;
class Book {
    String title;
    String author;
    double price;

    void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java Programming";
        b.author = "James Gosling";
        b.price = 599;

        b.displayBookDetails();
    }
}
