package objectoriented.keywords.Level1;

class Student {
    static String universityName = "XYZ University";
    static int totalStudents = 0;

    String name;
    String grade;
    final int rollNumber;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display(Object obj) {
        if (obj instanceof Student) {
            System.out.println(name + " | " + rollNumber + " | " + grade);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Nehaa", 21, "A");
        s.display(s);
        Student.displayTotalStudents();
    }
}

