package Object_Oriented.Inheritance;
class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println("Vehicle Info");
    }
}

class Car extends Vehicle {
    int seatCapacity;

    @Override
    void displayInfo() {
        System.out.println("Car with seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;
}

class Motorcycle extends Vehicle {
    boolean hasGear;
}

