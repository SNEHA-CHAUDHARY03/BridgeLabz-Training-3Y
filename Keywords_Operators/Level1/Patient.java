public class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment);
    }

    public static void main(String[] args) {
        Patient p = new Patient(1, "Eva", 30, "Flu");
        if (p instanceof Patient) {
            p.displayDetails();
        }
        getTotalPatients();
    }
}
