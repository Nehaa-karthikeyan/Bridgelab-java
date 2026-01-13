package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;
class Person {
    String name;
    int age;

    // Parameterized constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Nehaa", 21);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}

