package Object_Oriented.Inheritance;
class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println(name + " | ID: " + id + " | Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
}

class Developer extends Employee {
    String programmingLanguage;
}

class Intern extends Employee {
    int durationMonths;
}

