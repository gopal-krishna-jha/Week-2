//Create a class VehicleRental to rent the car
class VehicleRental {
    // Attributes of the vehicle rental
    private String renterName;
    private String vehicleModel;
    private int rentalDuration;
    private double ratePerDay;

    // Parameterized Constructor to initialize the rental details
    public VehicleRental(String renterName, String vehicleModel, int rentalDuration, double ratePerDay) {
        this.renterName = renterName;
        this.vehicleModel = vehicleModel;
        this.rentalDuration = rentalDuration;
        this.ratePerDay = ratePerDay;
    }

    // Create a method to compute total rental cost
    public double computeTotalCost() {
        return rentalDuration * ratePerDay;
    }

    // Create a method showDetails to display the details
    public void showDetails(double totalCost) {
        // Print the rental details
        System.out.println("Renter Name: " + renterName);
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Rental Duration: " + rentalDuration + " days");
        System.out.println("Rate Per Day: $" + ratePerDay);
        System.out.println("Total Cost: $" + totalCost);
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create a new vehicle rental instance
        VehicleRental rentalInfo = new VehicleRental("Neelesh Yadav", "Toyota Camry", 5, 50.0);

        // Create a variable to store the total cost
        double totalCost = rentalInfo.computeTotalCost();

        // Call a method to display the rental details
        rentalInfo.showDetails(totalCost);
    }
}
