package Object_Oriented.DesignPrinciples;

import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Departments {
    String name;

    Departments(String name) {
        this.name = name;
    }
}

class University {
    ArrayList<Department> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }
}

public class UniversityTest {
    public static void main(String[] args) {
        University u = new University();
        u.addDepartment(new Department("CSE"));
        u.addFaculty(new Faculty("Dr. Kumar"));

        System.out.println("University setup completed");
    }
}

