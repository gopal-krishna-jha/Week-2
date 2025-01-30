// Define a Book class to hold book details and demonstrate single inheritance
class Book {
    // Declare variables to store book title and publication year
    private String title;
    private int publicationYear;

    // Constructor to initialize the book's title and publication year
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to return the book's title
    public String getTitle() {
        return title;
    }

    // Method to return the publication year of the book
    public int getPublicationYear() {
        return publicationYear;
    }

    // Method to display the book's details
    public void displayInfo() {
        System.out.println("Book title: " + getTitle() + "\nPublication Year: " + getPublicationYear());
    }
}

// Define an Author class that inherits from the Book class and adds
// author-specific details
class Author extends Book {
    // Declare variables to store author name and biography
    private String authorName;
    private String bio;

    // Constructor to initialize both book and author details
    public Author(String title, int publicationYear, String authorName, String bio) {
        // Call the Book class constructor to initialize book details
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    // Override displayInfo method to print both book and author details
    public void displayInfo() {
        // Call the displayInfo method from the Book class
        super.displayInfo();
        // Print author-specific details
        System.out.println("Author name: " + authorName + "\nAuthor Bio: " + bio);
    }
}

// Define the LibraryManagement class to demonstrate the use of the Author class
public class LibraryManagement {
    public static void main(String[] args) {
        // Create an Author object and initialize it with book and author details
        Author author = new Author("The Complete Reference", 1987, "Herbert Schildt",
                "Herbert Schildt is an American computing author, programmer, and musician. He has written books about various programming languages.");
        // Call the displayInfo method to print out both book and author details
        author.displayInfo();
    }
}
