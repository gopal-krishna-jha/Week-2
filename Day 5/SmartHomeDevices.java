// Define a Device class to initialize device details and demonstrate single inheritance
class Device {
    // Declare variables to store device ID and status
    private String deviceId;
    private String status;

    // Constructor to initialize the device's ID and status
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to return the device's ID
    public String getDeviceId() {
        return deviceId;
    }

    // Method to return the device's status
    public String getStatus() {
        return status;
    }

    // Method to display the device's details
    public void displayStatus() {
        System.out.println("Device Id: " + deviceId + "\nDevice Status: " + status);
    }
}

// Define a Thermostat class that inherits from the Device class and adds
// thermostat-specific details
class Thermostat extends Device {
    // Declare a variable to store the temperature setting of the thermostat
    private double temperatureSetting;

    // Constructor to initialize thermostat details along with inherited device
    // details
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        // Call the Device class constructor to initialize the device's ID and status
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus method to print both device and thermostat-specific
    // details
    public void displayStatus() {
        // Call the displayStatus method from the Device class
        super.displayStatus();
        // Print the thermostat's temperature setting
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Define the SmartHomeDevices class to demonstrate the use of the Thermostat
// class
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Create a Thermostat object and initialize it with device and thermostat
        // details
        Thermostat thermostat = new Thermostat("23076RN4BI", "Working", 48.4);
        // Call the displayStatus method to print out both device and thermostat details
        thermostat.displayStatus();
    }
}
