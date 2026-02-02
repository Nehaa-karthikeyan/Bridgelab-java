package javacollectionsandstreams.iostreams;

import java.io.*;
import java.util.*;

// Employee class (NO public keyword)
class Employee implements Serializable {

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

// Main class
public class EmployeeData {

    public static void main(String[] args) {

        // Create Employee objects
        Employee e1 = new Employee(101, "Nehaa", "IT", 55000);
        Employee e2 = new Employee(102, "Asha", "HR", 45000);

        // Store employees in a list
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);

        // SERIALIZATION
        try {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("employee.dat"));
            oos.writeObject(empList);
            oos.close();
            System.out.println("Serialization completed.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // DESERIALIZATION
        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("employee.dat"));
            List<Employee> list =
                    (List<Employee>) ois.readObject();
            ois.close();

            System.out.println("\nEmployee details:");
            for (Employee emp : list) {
                System.out.println(emp.id + " " + emp.name + " " +
                        emp.department + " " + emp.salary);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

