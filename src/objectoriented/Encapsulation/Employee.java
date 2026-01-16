package Object_Oriented.Encapsulation;
abstract class Employee {
    private int employeeId;
    private String name;
    protected double baseSalary;

    abstract double calculateSalary();

    public void displayDetails() {
        System.out.println(name + " | Salary: " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String dept);
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return baseSalary;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;

    @Override
    double calculateSalary() {
        return hoursWorked * baseSalary;
    }
}

