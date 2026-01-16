package Object_Oriented.Encapsulation;

abstract class Vehicles {
    protected String vehicleId;
    protected double ratePerKm;

    abstract double calculateFare(double distance);
}

interface GPS {
    void updateLocation();
}

