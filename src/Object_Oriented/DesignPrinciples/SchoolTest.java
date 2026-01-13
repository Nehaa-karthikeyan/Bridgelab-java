package Object_Oriented.DesignPrinciples;
import java.util.ArrayList;

class Course {
    String courseName;
    ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.students.add(this);
    }

    void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class School {
    ArrayList<Student> students = new ArrayList<>();
}

public class SchoolTest {
    public static void main(String[] args) {
        Student s1 = new Student("Nehaa");
        Course c1 = new Course("Java");

        s1.enrollCourse(c1);
        s1.viewCourses();
    }
}

