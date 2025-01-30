
// Interface for insurable vehicles
interface Insurable {
    // Method to calculate the insurance cost for the vehicle
    double calculateInsurance();

    // Method to get details about the insurance coverage
    String getInsuranceDetails();
}

// Abstract class representing a generic vehicle
abstract class Vehicle {
    // Private fields to store essential vehicle information
    private String vehicleNumber; // Unique identifier for each vehicle
    private String type; // Type of the vehicle (e.g., Car, Bike, Truck)
    private double rentalRate; // Daily rental rate for the vehicle

    // Constructor to initialize vehicle attributes
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber; // Assign the provided vehicle number
        this.type = type; // Assign the provided vehicle type
        this.rentalRate = rentalRate; // Assign the daily rental rate
    }

    // Getter method for vehicle number
    public String getVehicleNumber() {
        return vehicleNumber; // Returns the vehicle number
    }

    // Getter method for vehicle type
    public String getType() {
        return type; // Returns the vehicle type
    }

    // Getter method for rental rate
    public double getRentalRate() {
        return rentalRate; // Returns the daily rental rate
    }

    // Abstract method to calculate rental cost based on the number of rental days
    public abstract double calculateRentalCost(int days);
}

// Subclass representing a car
class Car extends Vehicle implements Insurable {
    private double insuranceRate; // Insurance rate specific to cars

    // Constructor to initialize car attributes
    public Car(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Car", rentalRate); // Call the constructor of the parent class with type set as "Car"
        this.insuranceRate = insuranceRate; // Assign the insurance rate
    }

    // Method to calculate rental cost for a car
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Calculate rental cost: rental rate * number of days
    }

    // Method to calculate the insurance cost for a car
    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate; // Calculate insurance cost based on the insurance rate
    }

    // Method to get details about the insurance coverage for a car
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Rate: " + insuranceRate * 100 + "%"; // Returns the insurance rate as a percentage
    }
}

// Subclass representing a bike
class Bike extends Vehicle implements Insurable {
    private double insuranceRate; // Insurance rate specific to bikes

    // Constructor to initialize bike attributes
    public Bike(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Bike", rentalRate); // Call the constructor of the parent class with type set as "Bike"
        this.insuranceRate = insuranceRate; // Assign the insurance rate
    }

    // Method to calculate rental cost for a bike
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Calculate rental cost: rental rate * number of days
    }

    // Method to calculate the insurance cost for a bike
    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate; // Calculate insurance cost based on the insurance rate
    }

    // Method to get details about the insurance coverage for a bike
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Rate: " + insuranceRate * 100 + "%"; // Returns the insurance rate as a percentage
    }
}

// Subclass representing a truck
class Truck extends Vehicle implements Insurable {
    private double insuranceRate; // Insurance rate specific to trucks

    // Constructor to initialize truck attributes
    public Truck(String vehicleNumber, double rentalRate, double insuranceRate) {
        super(vehicleNumber, "Truck", rentalRate); // Call the constructor of the parent class with type set as "Truck"
        this.insuranceRate = insuranceRate; // Assign the insurance rate
    }

    // Method to calculate rental cost for a truck
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // Calculate rental cost: rental rate * number of days
    }

    // Method to calculate the insurance cost for a truck
    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate; // Calculate insurance cost based on the insurance rate
    }

    // Method to get details about the insurance coverage for a truck
    public String getInsuranceDetails() {
        return "Truck Insurance Rate: " + insuranceRate * 100 + "%"; // Returns the insurance rate as a percentage
    }
}

// Main class to demonstrate the functionality of the Vehicle Rental System
import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create a list to store various vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Create a car and add it to the list
        Car car = new Car("C001", 50.00, 0.1); // $50 rental rate, 10% insurance rate
        vehicles.add(car);

        // Create a bike and add it to the list
        Bike bike = new Bike("B001", 15.00, 0.05); // $15 rental rate, 5% insurance rate
        vehicles.add(bike);

        // Create a truck and add it to the list
        Truck truck = new Truck("T001", 100.00, 0.2); // $100 rental rate, 20% insurance rate
        vehicles.add(truck);

        // Number of days for rental
        int rentalDays = 3;

        // Iterate over the list of vehicles to calculate and display rental and
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(rentalDays); // Calculate rental cost
            double insuranceCost = ((Insurable) vehicle).calculateInsurance(); // Calculate insurance cost
            double finalCost = rentalCost + insuranceCost; // Calculate final cost

            // Display vehicle details and costs
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for " + rentalDays + " days: $" + rentalCost);
            System.out.println("Insurance Cost: $" + insuranceCost);
            System.out.println("Total Cost: $" + finalCost);
        }
    }
}
