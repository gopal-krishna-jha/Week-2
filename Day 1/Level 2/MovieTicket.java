import java.util.Scanner;

// Create a class MovieTicket to manage the movie ticket booking system
public class MovieTicket {
    // Instance variables to store movie ticket details
    private String movieTitle;
    private String seatNumber;
    private double ticketPrice;

    // Constructor to initialize the movie ticket details
    public MovieTicket(String movieTitle, String seatNumber, double ticketPrice) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }

    // Method to book a ticket by updating seat number and price
    public void bookTicket(String seatNumber, double ticketPrice) {
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        System.out.println("Ticket Booked: " + movieTitle + " | Seat: " + seatNumber + " | Price: " + ticketPrice);
    }

    // Method to display ticket details
    public void showTicketDetails() {
        System.out.println("Movie: " + movieTitle);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + ticketPrice);
    }
}

// Create a class MovieTicketApp to use the MovieTicket class
class MovieTicketApp {
    public static void main(String[] args) {
        // Create a Scanner class object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an object of the MovieTicket class with initial details
        MovieTicket ticket = new MovieTicket("Krrish", "A1", 300.0);

        // Display initial ticket details
        ticket.showTicketDetails();

        // Prompt user for new seat number and updated price
        System.out.println("Please enter a new seat number: ");
        String newSeatNumber = scanner.next();

        System.out.println("Please enter the updated ticket price: ");
        double updatedPrice = scanner.nextDouble();

        // Book the ticket with updated details
        ticket.bookTicket(newSeatNumber, updatedPrice);

        // Display updated ticket details
        ticket.showTicketDetails();

        // Close the scanner
        scanner.close();
    }
}
