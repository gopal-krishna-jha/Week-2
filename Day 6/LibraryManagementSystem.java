import java.util.*;

// Abstract class representing a generic library item
abstract class LibraryItem {
    // Private fields for encapsulation
    private String itemId; // Unique identifier for the library item
    private String title; // Title of the library item
    private String author; // Author of the library item

    // Constructor to initialize the library item fields
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method to get the loan duration for the item (to be implemented by
    // subclasses)
    public abstract int getLoanDuration();

    // Concrete method to retrieve the details of the library item
    public String getItemDetails() {
        return "Item ID: " + itemId + "\nTitle: " + title + "\nAuthor: " + author;
    }

    // Getter method for the item ID
    public String getItemId() {
        return itemId;
    }

    // Getter method for the title of the item
    public String getTitle() {
        return title;
    }

    // Getter method for the author of the item
    public String getAuthor() {
        return author;
    }
}

// Interface defining the behavior of reservable items
interface Reservable {
    // Method to reserve the item, providing the borrower's name
    void reserveItem(String borrower);

    // Method to check if the item is available for reservation
    boolean checkAvailability();
}

// Subclass representing a Book item in the library
class Book extends LibraryItem implements Reservable {
    private boolean isReserved = false; // Tracks if the book is reserved
    private String borrower; // Stores the name of the borrower if reserved

    // Constructor to initialize a Book instance
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Implementation of loan duration specific to books
    @Override
    public int getLoanDuration() {
        return 14; // Books have a loan duration of 14 days
    }

    // Implementation of the reservation functionality
    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrower = borrower;
            System.out.println("Book reserved successfully by " + borrower);
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    // Method to check the availability of the book
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass representing a Magazine item in the library
class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved = false; // Tracks if the magazine is reserved
    private String borrower; // Stores the name of the borrower if reserved

    // Constructor to initialize a Magazine instance
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Implementation of loan duration specific to magazines
    @Override
    public int getLoanDuration() {
        return 7; // Magazines have a loan duration of 7 days
    }

    // Implementation of the reservation functionality
    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrower = borrower;
            System.out.println("Magazine reserved successfully by " + borrower);
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    // Method to check the availability of the magazine
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Subclass representing a DVD item in the library
class DVD extends LibraryItem implements Reservable {
    private boolean isReserved = false; // Tracks if the DVD is reserved
    private String borrower; // Stores the name of the borrower if reserved

    // Constructor to initialize a DVD instance
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Implementation of loan duration specific to DVDs
    @Override
    public int getLoanDuration() {
        return 5; // DVDs have a loan duration of 5 days
    }

    // Implementation of the reservation functionality
    @Override
    public void reserveItem(String borrower) {
        if (!isReserved) {
            this.isReserved = true;
            this.borrower = borrower;
            System.out.println("DVD reserved successfully by " + borrower);
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    // Method to check the availability of the DVD
    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

// Main class to demonstrate the Library Management System functionality
public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a Book instance using polymorphism
        LibraryItem book = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald");

        // Create a Magazine instance using polymorphism
        LibraryItem magazine = new Magazine("M201", "National Geographic", "Various");

        // Create a DVD instance using polymorphism
        LibraryItem dvd = new DVD("D301", "Inception", "Christopher Nolan");

        // Display book details and loan duration
        System.out.println("Book Details:\n" + book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

        // Display magazine details and loan duration
        System.out.println("Magazine Details:\n" + magazine.getItemDetails());
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

        // Display DVD details and loan duration
        System.out.println("DVD Details:\n" + dvd.getItemDetails());
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");

        // Reserve the book and check its availability
        Reservable reservableBook = (Reservable) book;
        reservableBook.reserveItem("John Doe");
        System.out.println("Book Availability: " + reservableBook.checkAvailability() + "\n");

        // Reserve the magazine and check its availability
        Reservable reservableMagazine = (Reservable) magazine;
        reservableMagazine.reserveItem("Jane Smith");
        System.out.println("Magazine Availability: " + reservableMagazine.checkAvailability() + "\n");

        // Reserve the DVD and check its availability
        Reservable reservableDVD = (Reservable) dvd;
        reservableDVD.reserveItem("Alice Johnson");
        System.out.println("DVD Availability: " + reservableDVD.checkAvailability());
    }
}
