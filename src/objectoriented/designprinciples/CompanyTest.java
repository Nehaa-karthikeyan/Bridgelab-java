package Object_Oriented.DesignPrinciples;

import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String companyName) {
        this.companyName = companyName;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }
}

public class CompanyTest {
    public static void main(String[] args) {
        Company c = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee("Alice");
        d1.addEmployee("Bob");

        c.addDepartment(d1);
        System.out.println("Company created with departments");
    }
}
