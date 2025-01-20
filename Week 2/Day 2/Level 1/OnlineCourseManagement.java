// Create a class Course to show the course details
class Course {
    // Declare instance variables courseName, duration, and fee to store course
    // details
    String courseName;
    int duration;
    double fee;

    // Class variable to store the institute name
    public static String instituteName = "National Institute of Technology";

    // Parameterized constructor to initialize variables
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display the details of a course
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " Years");
        System.out.println("Fee: $" + fee);
        System.out.println();
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

// Create a class OnlineCourseManagement to demonstrate course usage
public class OnlineCourseManagement {
    public static void main(String[] args) {

        // Create instances of the Course class
        Course course1 = new Course("Data Science and Analytics", 3, 180000.0);
        Course course2 = new Course("Mechanical Engineering", 4, 200000.0);

        // Display details of the courses
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update the institute name
        Course.updateInstituteName("Indian Institute of Technology");
        System.out.println("Institute name has been updated...");
        System.out.println();

        // Display details of the courses again after updating the institute name
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
