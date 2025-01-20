// Create a class Vehicle to show vehicle details
class Vehicle {
    // Create instance variables ownerName and vehicleType to store vehicle details
    String ownerName;
    String vehicleType;

    // Create a class variable for registration fee
    private static double registrationFee = 200.0;

    // Parameterized constructor to initialize a new Vehicle's details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display the details of the vehicle
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }
}

// Create a class VehicleRegistration to utilize the Vehicle class
public class VehicleRegistration {
    public static void main(String[] args) {
        // Create an object of Vehicle class for a car
        Vehicle vehicle1 = new Vehicle("Aman", "Car");

        // Create an object of Vehicle class for a motorcycle
        Vehicle vehicle2 = new Vehicle("Anchal", "Motorcycle");

        // Call a method to display details of the vehicles
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Call a method to update the registration fee
        Vehicle.updateRegistrationFee(500.0);

        System.out.println("\nRegistration Fee Updated...\n");

        // Call a method to display updated details of the vehicles
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
