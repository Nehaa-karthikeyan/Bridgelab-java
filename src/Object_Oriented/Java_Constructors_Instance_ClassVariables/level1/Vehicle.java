package Object_Oriented.Java_Constructors_Instance_ClassVariables.level1;

class Vehicle {
    String ownerName;          // instance
    String vehicleType;        // instance
    static double registrationFee = 5000; // class variable

    Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Nehaa", "Car");
        v1.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);

        Vehicle v2 = new Vehicle("Arun", "Bike");
        v2.displayVehicleDetails();
    }
}

