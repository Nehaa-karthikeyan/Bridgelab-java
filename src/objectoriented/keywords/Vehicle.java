package objectoriented.keywords.Level1;
class Vehicle {
    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println(ownerName + " | " + vehicleType + " | " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Nehaa", "Car", 9001);
        v.display(v);
        Vehicle.updateRegistrationFee(6000);
    }
}
