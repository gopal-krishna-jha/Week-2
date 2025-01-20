 // Create a Reservation class to show details of guest
public class Reservation {
    String customerName, accommodationType;
    int stayDuration;

    // Default constructor
    public Reservation() {
        this.customerName = "Alok";
        this.accommodationType = "Standard";
        this.stayDuration = 0;
    }

    // Parameterized constructor
    public Reservation(String customerName, String accommodationType, int stayDuration) {
        this.customerName = customerName;
        this.accommodationType = accommodationType;
        this.stayDuration = stayDuration;
    }

    // Clone constructor
    public Reservation(Reservation existingReservation) {
        this.customerName = existingReservation.customerName;
        this.accommodationType = existingReservation.accommodationType;
        this.stayDuration = existingReservation.stayDuration;
    }

    public void showDetails() {
        // Print the result
        System.out.println("Customer Name: " + customerName +
                "\nAccommodation Type: " + accommodationType +
                "\nStay Duration: " + stayDuration);
    }
}

 class ReservationSystem {

    public static void main(String[] args) {

        // Create an object of Reservation class
        Reservation booking1 = new Reservation();

        // Create an object of Reservation class
        Reservation booking2 = new Reservation("Virat", "Deluxe", 3);

        // Create an object of Reservation class
        Reservation booking3 = new Reservation(booking1);

        // Print the result
        booking1.showDetails();
        booking2.showDetails();
        booking3.showDetails();
    }
}
