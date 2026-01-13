package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 5001;
        m.department = "IT";
        m.setSalary(75000);

        m.display();
        System.out.println("Salary: " + m.getSalary());
    }
}

