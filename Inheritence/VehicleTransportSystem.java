class Vehicle {
    int maxSpeed;
    String fuelType;
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}
class Car extends Vehicle {
    int seatCapacity;
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(seatCapacity);
    }
}
class Truck extends Vehicle {
    double loadCapacity;
    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(loadCapacity);
    }
}
class Motorcycle extends Vehicle {
    boolean hasSidecar;
    Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println(hasSidecar);
    }
}
class VehicleTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(180, "Petrol", 5), new Truck(120, "Diesel", 10.5), new Motorcycle(150, "Petrol", false)};
        for(Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}