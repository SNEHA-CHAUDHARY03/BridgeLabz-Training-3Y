abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle: " + vehicleId + ", Driver: " + driverName);
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

class Car extends Vehicle implements GPS {
    private String location = "Unknown";
    public Car(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle implements GPS {
    private String location = "Unknown";
    public Bike(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.8; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}

class Auto extends Vehicle implements GPS {
    private String location = "Unknown";
    public Auto(String id, String driver, double rate) { super(id, driver, rate); }
    @Override
    public double calculateFare(double distance) { return getRatePerKm() * distance * 0.9; }
    @Override
    public String getCurrentLocation() { return location; }
    @Override
    public void updateLocation(String location) { this.location = location; }
}

public class RideHailingApplication {
    public static void main(String[] args) {
        Vehicle[] rides = {
            new Car("CAR1", "Alice", 15),
            new Bike("BIKE1", "Bob", 10),
            new Auto("AUTO1", "Charlie", 12)
        };
        double distance = 10;
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare: " + v.calculateFare(distance));
        }
    }
}
