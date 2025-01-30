// Abstract class representing a vehicle with basic information and fare calculation
abstract class Vehicle {
    // Private instance variables to store vehicle ID, driver name, and rate per
    // kilometer
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor to initialize vehicle details
    public Vehicle(String vehicleId, double ratePerKm, String driverName) {
        this.vehicleId = vehicleId;
        this.ratePerKm = ratePerKm;
        this.driverName = driverName;
    }

    // Abstract method to calculate the fare for a given distance
    abstract double calculateFare(double distance);

    // Method to return vehicle details as a formatted string
    public String getVehicleDetails() {
        String str = "Vehicle ID: " + vehicleId;
        str += "\nDriver Name: " + driverName;
        str += "\nRate Per Km: " + ratePerKm;

        return str;
    }

    // Getter method to access the rate per kilometer
    public double getRatePerKm() {
        return ratePerKm;
    }
}

// Class representing a Car, extending the Vehicle class
class Car extends Vehicle {
    // Constructor to initialize car details
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, ratePerKm, driverName);
    }

    // Overridden method to calculate the fare for a car
    public double calculateFare(double distance) {
        return distance * super.getRatePerKm();
    }
}

// Class representing a Bike, extending the Vehicle class
class Bike extends Vehicle {
    // Constructor to initialize bike details
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, ratePerKm, driverName);
    }

    // Overridden method to calculate the fare for a bike
    public double calculateFare(double distance) {
        return distance * super.getRatePerKm();
    }
}

// Class representing an Auto (autorickshaw), extending the Vehicle class
class Auto extends Vehicle {
    // Constructor to initialize auto details
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, ratePerKm, driverName);
    }

    // Overridden method to calculate the fare for an auto
    public double calculateFare(double distance) {
        return distance * super.getRatePerKm();
    }
}

// Interface defining GPS functionality
interface GPS {
    // Method to get the current location
    String getCurrentLocation();

    // Method to update the location
    String updateLocation();
}

// Main class to demonstrate the ride-hailing application
public class RideHailingApplication {
    public static void main(String[] args) {

        // Create a Car object with specific details
        Vehicle car = new Car("MPO4 ZX 3165", "Umesh", 60);

        // Create a Bike object with specific details
        Vehicle bike = new Bike("MP04 ZN 3160", "Ajay", 40);

        // Create an Auto object with specific details
        Vehicle auto = new Auto("MP04 AD 5463", "Rajesh", 40);

        // Display details of the car and calculate its fare
        System.out.println("Car Details: \n" + car.getVehicleDetails());
        System.out.println("Fare is: " + car.calculateFare(10) + "\n");

        // Display details of the bike and calculate its fare
        System.out.println("Bike Details: \n" + bike.getVehicleDetails());
        System.out.println("Fare is: " + bike.calculateFare(20) + "\n");

        // Display details of the auto and calculate its fare
        System.out.println("Auto Details: \n" + auto.getVehicleDetails());
        System.out.println("Fare is: " + auto.calculateFare(20));
    }
}
