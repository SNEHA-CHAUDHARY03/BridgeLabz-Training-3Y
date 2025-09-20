class Device {
    String deviceId;
    String status;
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
    void displayStatus() {
        System.out.println(deviceId + " " + status);
    }
}
class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println(temperatureSetting);
    }
}
class SmartHomeDevices {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T1", "ON", 24);
        t.displayStatus();
    }
}