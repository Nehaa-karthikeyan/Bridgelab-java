package Object_Oriented.Inheritance;

class Device {
    String deviceId;
    boolean status;
}

class Thermostat extends Device {
    int temperatureSetting;

    void displayStatus() {
        System.out.println("Temp: " + temperatureSetting);
    }
}
