package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;
class Course {
    String courseName;     // instance
    int duration;          // instance
    double fee;            // instance
    static String instituteName = "ABC Institute"; // class variable

    Course(String c, int d, double f) {
        courseName = c;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " months | " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 20000);
        c1.displayCourseDetails();

        Course.updateInstituteName("XYZ Institute");

        Course c2 = new Course("Python", 4, 15000);
        c2.displayCourseDetails();
    }
}
