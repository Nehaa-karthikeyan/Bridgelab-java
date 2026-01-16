package objectoriented.keywords.Level1;
class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;

    String name;
    String designation;
    final int id;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display(Object obj) {
        if (obj instanceof Employee) {
            System.out.println(name + " | " + id + " | " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("Nehaa", 501, "Developer");
        e.display(e);
        Employee.displayTotalEmployees();
    }
}

