// Base Student class
class Student {
    // Create instance variables with access modifiers
    public int rollNumber; // Roll number is public
    protected String name; // Name is protected
    private double CGPA; // CGPA is private

    // Parameterized Constructor to initialize the student's details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to get the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Method to set the CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Method to get the student's name
    protected String getName() {
        return name;
    }
}

// Create a Subclass PostgraduateStudent
class PostgraduateStudent extends Student {

    // Parameterized Constructor to initialize the postgraduate student's details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    // Method to display the postgraduate student's details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + getName());
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        // Create an object of postgraduate student class
        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Sanjay", 7.8);

        // Call a method to display the postgraduate student's details
        pgStudent.displayDetails();

        // Call a method to modify the CGPA
        pgStudent.setCGPA(8.5);

        // Call a method to display the updated details
        System.out.println("\nUpdated Details:");
        pgStudent.displayDetails();
    }
}
