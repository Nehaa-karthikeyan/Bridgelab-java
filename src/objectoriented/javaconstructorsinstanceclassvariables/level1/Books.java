package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;

class Books {
    public String ISBN;
    protected String title;
    private String author;

    public void setAuthor(String a) {
        author = a;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Books {
    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook e = new EBook();
        e.ISBN = "123-XYZ";
        e.title = "Java Programming";
        e.setAuthor("James");

        e.display();
    }
}

