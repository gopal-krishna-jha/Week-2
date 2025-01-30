// Define a Person class to initialize person details and demonstrate hierarchical inheritance
class Person {
    // Declare variables to store name and age of the person
    private String name;
    private int age;

    // Constructor to initialize the person's name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to return the person's name
    public String getName() {
        return name;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Name of person: " + name + "\nAge of person: " + age);
    }
}

// Define a Teacher class that inherits from the Person class and adds
// teacher-specific details
class Teacher extends Person {
    // Declare a variable to store the subject the teacher teaches
    private String subject;

    // Constructor to initialize teacher details along with inherited person details
    public Teacher(String name, int age, String subject) {
        // Call the Person class constructor to initialize name and age
        super(name, age);
        this.subject = subject;
    }

    // Method to display the teacher's role and subject taught
    public void displayRole() {
        // Call the displayDetails method from the Person class
        super.displayDetails();
        // Print the teacher's role and subject
        System.out.println("Role of person: Teacher\nSubject is: " + subject);
    }
}

// Define a Student class that inherits from the Person class and adds
// student-specific details
class Student extends Person {
    // Declare a variable to store the student's grade
    private char grade;

    // Constructor to initialize student details along with inherited person details
    public Student(String name, int age, char grade) {
        // Call the Person class constructor to initialize name and age
        super(name, age);
        this.grade = grade;
    }

    // Method to display the student's role and grade
    public void displayRole() {
        // Call the displayDetails method from the Person class
        super.displayDetails();
        // Print the student's role and grade
        System.out.println("Role of person: Student\nGrade is: " + grade);
    }
}

// Define a Staff class that inherits from the Person class and adds
// staff-specific details
class Staff extends Person {
    // Declare a variable to store the department the staff member works in
    private String department;

    // Constructor to initialize staff details along with inherited person details
    public Staff(String name, int age, String department) {
        // Call the Person class constructor to initialize name and age
        super(name, age);
        this.department = department;
    }

    // Method to display the staff's role and department
    public void displayRole() {
        // Call the displayDetails method from the Person class
        super.displayDetails();
        // Print the staff's role and department
        System.out.println("Role of person: Staff\nDepartment is: " + department);
    }
}

// Define the SchoolSystem class to demonstrate the use of Teacher, Student, and
// Staff classes
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a Teacher object and initialize it with teacher details
        Teacher teacher = new Teacher("Prof. Ravi", 35, "Mathematics");

        // Create a Student object and initialize it with student details
        Student student = new Student("Sohan", 15, 'A');

        // Create a Staff object and initialize it with staff details
        Staff staff = new Staff("Ankit", 26, "Science");

        // Call the displayRole method for Teacher to print their details
        teacher.displayRole();

        System.out.println(); // Add an empty line for separation

        // Call the displayRole method for Student to print their details
        student.displayRole();

        System.out.println(); // Add an empty line for separation

        // Call the displayRole method for Staff to print their details
        staff.displayRole();
    }
}
