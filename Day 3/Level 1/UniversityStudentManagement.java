// Define the Student class to encapsulate student information and manage their details
class Student {
    // Declare static and instance variables to hold student and university data
    private static String universityName = "TIT Bhopal"; // University name (common for all students)
    private String name; // Student's name
    private final int rollNumber; // Unique identifier for each student (immutable)
    private char grade; // Grade received by the student
    private static int numberOfStudent = 0; // Tracks the total number of students created

    // Constructor to initialize the student's details
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        numberOfStudent++; // Increment the student count each time a new student is instantiated
    }

    // Static method to display the total number of students enrolled
    public static void displayTotalStudent() {
        System.out.println("Total number of students: " + numberOfStudent);
    }

    // Instance method to display individual student details
    public void displayStudentDetails() {
        System.out.println("Name of Student: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("University: " + universityName);
    }
}

// UniversityStudentManagement class to demonstrate usage of the Student class
public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Create new student objects with specific details
        Student studentObj1 = new Student("Arun", 117, 'A');
        Student studentObj2 = new Student("Ravi", 15, 'C');

        // Check if studentObj1 is an instance of the Student class before displaying details
        if (studentObj1 instanceof Student) {
            // Display details of the first student
            studentObj1.displayStudentDetails();
            System.out.println(); // Print a blank line for clarity

            // Display details of the second student
            studentObj2.displayStudentDetails();
        }

        // Call the static method to show the total count of students created
        Student.displayTotalStudent();
    }
}
