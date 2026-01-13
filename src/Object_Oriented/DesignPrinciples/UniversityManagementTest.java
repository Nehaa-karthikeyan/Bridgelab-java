package Object_Oriented.DesignPrinciples;

// Courses class
class Courses {
    String name;

    Courses(String name) {
        this.name = name;
    }
}

// Professor class
class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignProfessor(Courses c) {
        System.out.println(name + " assigned to " + c.name);
    }
}

// Students class
class Students {
    String name;

    Students(String name) {
        this.name = name;
    }

    void enrollCourse(Courses c) {
        System.out.println(name + " enrolled in " + c.name);
    }
}

// Main class
public class UniversityManagementTest {
    public static void main(String[] args) {

        Courses c = new Courses("Java");
        Students s = new Students("Nehaa");
        Professor p = new Professor("Dr. Rao");

        s.enrollCourse(c);
        p.assignProfessor(c);
    }
}
