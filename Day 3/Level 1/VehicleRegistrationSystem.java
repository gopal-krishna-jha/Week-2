//Create a class Vehicle to represent and manage vehicle registration details
class Vehicle {
    // Define static and instance variables for vehicle registration and ownership
    // details
    private static double registrationFee = 500; // Registration fee common to all vehicles
    private String ownerName; // Name of the vehicle owner
    private String vehicleType; // Type of vehicle (e.g., Car, Bike)
    private final String registrationNumber; // Unique registration number of the vehicle

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee for all vehicles
    public static void updateRegistrationFee(int newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    // Instance method to display the details of a vehicle
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }
}

// Create a class VehicleRegistrationSystem to demonstrate the Vehicle class
public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create objects of Vehicle class with vehicle details
        Vehicle vehicleObj1 = new Vehicle("Raman", "Car", "01-06-5224");
        Vehicle vehicleObj2 = new Vehicle("Mohit", "Bike", "22-75-1224");

        // Check if vehicleObj1 is an instance of Vehicle before displaying details
        if (vehicleObj1 instanceof Vehicle) {
            // Display details of the first vehicle
            vehicleObj1.displayVehicleDetails();
            System.out.println(); // New line for better readability

            // Update the registration fee for all vehicles
            Vehicle.updateRegistrationFee(400);

            // Display details of the second vehicle after the fee update
            vehicleObj2.displayVehicleDetails();
        }
    }
}
