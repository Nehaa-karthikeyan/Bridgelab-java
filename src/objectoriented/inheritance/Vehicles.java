package Object_Oriented.Inheritance;
interface Refuelable {
    void refuel();
}

class Vehicles {
    int maxSpeed;
    String model;
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public void refuel() {
        System.out.println("Refueling petrol");
    }
}

class ElectricVehicle extends Vehicle {
    void charge() {
        System.out.println("Charging battery");
    }
}

