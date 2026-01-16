package Object_Oriented.DesignPrinciples;
class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        System.out.println("Doctor " + name + " consulting " + patient.name);
    }
}

public class HospitalTest {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Smith");
        Patient p = new Patient("Nehaa");

        d.consult(p);
    }
}

