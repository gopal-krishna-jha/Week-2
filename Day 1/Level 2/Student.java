import java.util.*;

//Create a class Student for getting Mobile details
public class Student {
    // Create variable name,rollNumber and marks to store details of Student
    String name, rollNumber;
    double marks;

    // Constructor to initialize the variable
    Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Create a method calculateGrade to find the Grade of Student
    public char calculateTheGrade() {
        if (marks >= 80) {
            return 'A';
        } else if (marks >= 65 && marks < 80) {
            return 'B';
        } else if (marks >= 50 && marks < 65) {
            return 'C';
        } else if (marks >= 35 && marks < 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Create a method displayDetails to print the details of Student
    public void displayDetails(char grade) {
        // Print the result
        System.out.println("\nStudent details are: ");
        System.out.println(
                "Student's name is : " + name + "\nStudent rollNumber is: " + rollNumber + "\nStudent marks: " + marks);
        System.out.print("Student Grade is: " + grade);
    }
}

// Create a class GradeOfStudent to use the functionality of Student class
public class GradeOfStudent {

    public static void main(String[] args) {
        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Create a variable name, rollNumber and marks take input from user
        System.out.print("Enter Student name: ");
        String name = input.nextLine();

        System.out.print("Enter Student Roll Number : ");
        String rollNumber = input.nextLine();

        System.out.print("Enter Student marks: ");
        double marks = input.nextDouble();

        // Create an object of Student class
        Student getDetails = new Student(name, rollNumber, marks);

        // Create a variable grade to store the grade based on marks
        char grade = getDetails.calculateGrade();

        // Call displayDetails method using object of Student
        getDetails.displayDetails(grade);

        input.close();
    }

}
