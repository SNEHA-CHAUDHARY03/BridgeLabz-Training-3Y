abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(int patientId, String name, int age, String diagnosis) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    protected String getDiagnosis() { return diagnosis; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private String[] records = new String[10];
    private int recordCount = 0;

    public InPatient(int id, String name, int age, String diagnosis, double roomCharge) {
        super(id, name, age, diagnosis);
        this.roomCharge = roomCharge;
    }

    @Override
    public double calculateBill() { return roomCharge + 5000; }
    @Override
    public void addRecord(String record) { records[recordCount++] = record; }
    @Override
    public void viewRecords() {
        for (int i = 0; i < recordCount; i++) System.out.println(records[i]);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private String[] records = new String[10];
    private int recordCount = 0;

    public OutPatient(int id, String name, int age, String diagnosis) {
        super(id, name, age, diagnosis);
    }

    @Override
    public double calculateBill() { return 500; }
    @Override
    public void addRecord(String record) { records[recordCount++] = record; }
    @Override
    public void viewRecords() {
        for (int i = 0; i < recordCount; i++) System.out.println(records[i]);
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient(1, "Alice", 30, "Surgery", 3000),
            new OutPatient(2, "Bob", 25, "Checkup")
        };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
        }
    }
}
