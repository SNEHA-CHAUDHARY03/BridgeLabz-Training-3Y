abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    private String policyNumber = "CAR123";
    public Car(String num, double rate) { super(num, "Car", rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    @Override
    public double calculateInsurance() { return 2000; }
    @Override
    public String getInsuranceDetails() { return "Car Insurance Policy"; }
}

class Bike extends Vehicle implements Insurable {
    private String policyNumber = "BIKE123";
    public Bike(String num, double rate) { super(num, "Bike", rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 0.8; }
    @Override
    public double calculateInsurance() { return 500; }
    @Override
    public String getInsuranceDetails() { return "Bike Insurance Policy"; }
}

class Truck extends Vehicle implements Insurable {
    private String policyNumber = "TRUCK123";
    public Truck(String num, double rate) { super(num, "Truck", rate); }
    @Override
    public double calculateRentalCost(int days) { return getRentalRate() * days * 1.5; }
    @Override
    public double calculateInsurance() { return 5000; }
    @Override
    public String getInsuranceDetails() { return "Truck Insurance Policy"; }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("MH01A1234", 1000),
            new Bike("MH01B5678", 300),
            new Truck("MH01C9999", 2000)
        };
        int days = 3;
        for (Vehicle v : vehicles) {
            System.out.println(v.getType() + " Rental: " + v.calculateRentalCost(days));
            System.out.println(((Insurable)v).getInsuranceDetails() + ", Cost: " + ((Insurable)v).calculateInsurance());
        }
    }
}
