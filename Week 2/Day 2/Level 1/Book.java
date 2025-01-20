// Create a class Book to store the book details
class Book2 {
    // Declare instance variables with access specifiers
    public String ISBN;
    protected String title;
    private String author;

    // Parameterized Constructor to initialize the book's details
    public Book2(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the book's title
    protected String getTitle() {
        return title;
    }
}

// Create a Subclass EBook
class EBook extends Book2 {

    // Parameterized Constructor to initialize the eBook's details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display the eBook's details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {
        // Create an object of EBook
        EBook getBook = new EBook("978-0-13-468599-1", "Effective Java", "Joshua Bloch");

        // Call a method to display the eBook's details
        getBook.displayDetails();

        // Call a method to modify the author's name
        getBook.setAuthor("Joshua Bloch & Others");

        // Call a method to display the updated details
        System.out.println("\nUpdated Details:");
        getBook.displayDetails();
    }
}
