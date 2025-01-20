import java.util.*;

//Create a class Book for getting Book details
 class Book {
    // Create variable title,author and price to store details of book
    String title, author;
    double price;

    // Constructor to initialize the variable
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Create a method displayTheDetails to print the details of Book
    public void displayTheDetails() {
        // Print the result
        System.out.println("Book details are: ");
        System.out.println(
                "Book's title is : " + title + "\nBook's Author name: " + author + "\nBook Price is: " + price);
    }
}

// Create a class BookDetails to use the functionality of Book class
public class BookDetails {

    public static void main(String[] args) {
        // Create an object of Book class
        Book getDetails = new Book("Programming with Java", "E Balaguruswamy", 1000);

        // Call displayTheDetails method using object of Book class
        getDetails.displayTheDetails();
    }

}
