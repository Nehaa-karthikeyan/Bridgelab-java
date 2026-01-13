package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000;

    // Parameterized constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println(customerName + " | " + carModel);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Nehaa", "Swift", 5);
        cr.display();
    }
}
