package Object_Oriented.Java_Class_And_Object.level1;
class Circle {
    double radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 7;

        c.calculateArea();
        c.calculateCircumference();
    }
}


