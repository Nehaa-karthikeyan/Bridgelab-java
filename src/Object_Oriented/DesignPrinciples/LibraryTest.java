package Object_Oriented.DesignPrinciples;

import java.util.ArrayList;

// Book class (Independent object)
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

// Library class (Aggregates Book)
class Library {
    String libraryName;
    ArrayList<Book> books = new ArrayList<>();

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}

// Main class
public class LibraryTest {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics", "James");
        Book b2 = new Book("Python AI", "Guido");

        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        lib1.addBook(b1);
        lib2.addBook(b1); // Same book in different library
        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();
    }
}

