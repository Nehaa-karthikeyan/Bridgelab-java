package Object_Oriented.Encapsulation;

abstract class Patient {
    private int patientId;
    protected String name;

    abstract double calculateBill();
}

interface MedicalRecord {
    void addRecord();
}

