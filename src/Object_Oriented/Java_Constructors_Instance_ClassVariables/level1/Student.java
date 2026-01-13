package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    void display() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent();
        p.rollNumber = 101;
        p.name = "Nehaa";
        p.setCGPA(8.9);

        p.display();
        System.out.println("CGPA: " + p.getCGPA());
    }
}

