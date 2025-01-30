// Define a Vehicle class to represent general vehicle details
class Vehicle {
    // Instance variables to store maximum speed and model of the vehicle
    protected int maxSpeed;
    protected String model;

    // Parameterized constructor to initialize max speed and model
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Method to display the details of the vehicle (model and max speed)
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed is: " + maxSpeed + " km/h");
    }
}

// Interface Refuelable to define the refuel method (for vehicles that require
// refueling)
interface Refuelable {
    // Abstract method refuel that needs to be implemented by classes that refuel
    void refuel();
}

// ElectricVehicle class to represent electric vehicles (extends Vehicle class)
class ElectricVehicle extends Vehicle {

    // Parameterized constructor to initialize max speed and model
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model); // Call the constructor of the parent (Vehicle) class
    }

    // Method to simulate charging of the electric vehicle
    public void charge() {
        System.out.println("Vehicle is charging");
    }
}

// PetrolVehicle class to represent petrol vehicles (extends Vehicle and
// implements Refuelable interface)
class PetrolVehicle extends Vehicle implements Refuelable {

    // Parameterized constructor to initialize max speed and model
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model); // Call the constructor of the parent (Vehicle) class
    }

    // Implementation of the refuel method from the Refuelable interface
    public void refuel() {
        System.out.println("Vehicle is refueling with petrol");
    }
}

// Main class to demonstrate the functionality of ElectricVehicle and
// PetrolVehicle
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create an object of ElectricVehicle class
        ElectricVehicle vehicle1 = new ElectricVehicle(250, "TATA Punch.ev");

        // Display the electric vehicle details
        System.out.println("Electric Vehicle: ");
        vehicle1.displayDetails(); // Display the vehicle's model and max speed
        vehicle1.charge(); // Call the charge method for the electric vehicle

        // Create an object of PetrolVehicle class
        PetrolVehicle vehicle2 = new PetrolVehicle(220, "Hyundai Creta");

        // Display the petrol vehicle details
        System.out.println("Petrol Vehicle: ");
        vehicle2.displayDetails(); // Display the vehicle's model and max speed
        vehicle2.refuel(); // Call the refuel method for the petrol vehicle
    }
}
