package objectoriented.keywords.Level1;
class Book {
    static String libraryName = "Central Library";

    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void display(Object obj) {
        if (obj instanceof Book) {
            System.out.println(title + " | " + author + " | " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", "ISBN101");
        Book.displayLibraryName();
        b.display(b);
    }
}

