package objectoriented.keywords.Level1;
class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void display(Object obj) {
        if (obj instanceof Patient) {
            System.out.println(name + " | " + age + " | " + ailment);
        }
    }

    public static void main(String[] args) {
        Patient p = new Patient("Nehaa", 21, "Fever", 701);
        p.display(p);
        Patient.getTotalPatients();
    }
}

