package Object_Oriented.Encapsulation;
abstract class Vehicle {
    protected String vehicleNumber;
    protected double rentalRate;

    abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
}

class Car extends Vehicle implements Insurable {
    double calculateRentalCost(int days) {
        return days * rentalRate;
    }

    public double calculateInsurance() {
        return 500;
    }
}

