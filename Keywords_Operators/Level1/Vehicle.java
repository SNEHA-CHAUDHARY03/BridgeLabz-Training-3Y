public class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("David", "Car", "REG123");
        if (v instanceof Vehicle) {
            v.displayDetails();
        }
        updateRegistrationFee(6000.0);
        v.displayDetails();
    }
}
