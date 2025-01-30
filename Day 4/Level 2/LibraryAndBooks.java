import java.util.ArrayList;

// Book class representing individual books
class Book {
    private String title;
    private String author;

    // Constructor to initialize Book attributes
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // To display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }
}

// Library class representing a collection of books
class Library {
    private ArrayList<Book> books;

    // Constructor to initialize the library
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in this Library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating library objects
        Library library1 = new Library();
        Library library2 = new Library();

        // Adding books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);

        // Displaying books in each library
        System.out.println("Library 1:");
        library1.displayBooks();

        System.out.println("\nLibrary 2:");
        library2.displayBooks();
    }
}
