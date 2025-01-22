//Create a class LibraryBook to represent and manage book details
class LibraryBook {
    // Define static and instance variables for library and book details
    private static String libraryName = "Gurukul Library"; // Library name common to all books
    private String bookTitle; // Title of the book
    private String bookAuthor; // Author of the book
    private final String bookISBN; // Unique ISBN for the book

    // Constructor to initialize book details
    public LibraryBook(String bookTitle, String bookAuthor, String bookISBN) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Instance method to display the details of a book
    public void displayDetails() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("ISBN: " + bookISBN);
    }
}

// Create a class LibrarySystem to demonstrate the LibraryBook class
public class LibrarySystem {
    public static void main(String[] args) {
        // Create objects of LibraryBook class with book details
        LibraryBook book1 = new LibraryBook("Java", "Herbert Schildt", "978-1-945209-05-5");
        LibraryBook book2 = new LibraryBook("C++", "A.K. Sharma", "979-9-562418-15-3");

        // Display the library name
        LibraryBook.displayLibraryName();

        // Check if book1 is an instance of LibraryBook before displaying details
        if (book1 instanceof LibraryBook) {
            // Display details of the first book
            book1.displayDetails();
            System.out.println(); // New line for better readability

            // Display details of the second book
            book2.displayDetails();
        }
    }
}
