// Superclass Vehicle
class Vehicle {
    int maxSpeed;
    String fuelType;

    // Constructor
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display common vehicle info
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass Car
class Car extends Vehicle {
    int seatCapacity;

    // Constructor
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call to the Vehicle constructor
        this.seatCapacity = seatCapacity;
    }

    // Override displayInfo to include seatCapacity
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity; // Measured in tons

    // Constructor
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType); // Call to the Vehicle constructor
        this.loadCapacity = loadCapacity;
    }

    // Override displayInfo to include loadCapacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Subclass Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType); // Call to the Vehicle constructor
        this.hasSidecar = hasSidecar;
    }

    // Override displayInfo to include hasSidecar
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }
}

// Main class to demonstrate polymorphism and inheritance
public class TransportSystem {
    public static void main(String[] args) {
        // Create an array of Vehicle type, storing different vehicle objects
        Vehicle[] vehicles = new Vehicle[3];

        // Assign objects to the array
        vehicles[0] = new Car(120, "Petrol", 5);
        vehicles[1] = new Truck(80, "Diesel", 15);
        vehicles[2] = new Motorcycle(110, "Petrol", true);

        // Using polymorphism by calling displayInfo() on each object
        for (Vehicle vehicle : vehicles) {
            System.out.println("\nVehicle Info:");
            vehicle.displayInfo();
        }
    }
}
