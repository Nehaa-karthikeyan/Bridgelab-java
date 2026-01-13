package Object_Oriented.Inheritance;
class Book {
    String title;
    int publicationYear;
}

class Author extends Book {
    String name;
    String bio;

    void displayInfo() {
        System.out.println(title + " by " + name);
    }
}

