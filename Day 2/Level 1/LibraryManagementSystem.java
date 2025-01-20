//Create a class LibraryBook to show details of the book
class LibraryBook {
    // Create variables bookTitle, bookAuthor, bookPrice, and isAvailable to store
    // details of the book
    String bookTitle, bookAuthor;
    double bookPrice;
    boolean isAvailable;

    // Parameterized Constructor to initialize variables
    public LibraryBook(String bookTitle, String bookAuthor, double bookPrice) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        this.isAvailable = true;
    }

    // Create a method loanBook to borrow the book
    public void loanBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as borrowed
            System.out.println("Book \"" + bookTitle + "\" by " + bookAuthor + " has been successfully borrowed.");
        } else {
            System.out.println("Book \"" + bookTitle + "\" by " + bookAuthor + " is currently unavailable.");
        }
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {
        // Create an object of LibraryBook class
        LibraryBook borrowedBook = new LibraryBook("Programming with Java", "E Balaguruswamy", 1000);

        // Call the method
        borrowedBook.loanBook();

        // Call the same method again
        borrowedBook.loanBook();
    }
}
