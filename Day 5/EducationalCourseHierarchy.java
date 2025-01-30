// Define a Course class to indicate the basic course details
class Course {
    // Declare instance variables to store the course name and duration
    public String courseName;
    public int duration;

    // Parameterized constructor to initialize courseName and duration
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to return the course details as a string
    public String getCourseDetails() {
        String str = "Course Name: " + courseName + ", Duration: " + duration + " weeks";
        return str;
    }
}

// Define an OnlineCourse class to represent an online course, which extends the
// Course class
class OnlineCourse extends Course {
    // Declare instance variables for platform and whether the course is recorded
    public String platform;
    public boolean isRecorded;

    // Parameterized constructor to initialize courseName, duration, platform, and
    // isRecorded
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the constructor of the base class (Course)
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override the getCourseDetails method to include details specific to an online
    // course
    public String getCourseDetails() {
        String str = super.getCourseDetails(); // Get base course details
        str += ", Platform: " + platform + ", Recorded: " + (isRecorded ? "Yes" : "No");
        return str;
    }
}

// Define a PaidOnlineCourse class to represent a paid online course, which
// extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    // Declare instance variables for the course fee and discount percentage
    public double fee, discount;

    // Parameterized constructor to initialize courseName, duration, platform,
    // isRecorded, fee, and discount
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
            double discount) {
        super(courseName, duration, platform, isRecorded); // Call the constructor of the OnlineCourse class
        this.fee = fee;
        this.discount = discount;
    }

    // Override the getCourseDetails method to include details specific to a paid
    // online course
    public String getCourseDetails() {
        String str = super.getCourseDetails(); // Get details from the OnlineCourse class
        str += ", Fee: " + fee + " rupees , Discount: " + discount + "%";
        return str;
    }
}

// Define the EducationalCourseHierarchy class to demonstrate the usage of
// Course, OnlineCourse, and PaidOnlineCourse
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create an object of the Course class with course name and duration
        Course course1 = new Course("Java Full Stack", 15);

        // Create an object of the OnlineCourse class with course details, platform, and
        // recording status
        OnlineCourse course2 = new OnlineCourse("MERN Stack", 10, "Coursera", true);

        // Create an object of the PaidOnlineCourse class with course details, platform,
        // fee, and discount
        PaidOnlineCourse course3 = new PaidOnlineCourse("Data Structure", 8, "Coding Ninja", false, 5000, 10);

        // Print the details of the basic course (course1)
        System.out.println(course1.getCourseDetails());

        // Print the details of the online course (course2)
        System.out.println(course2.getCourseDetails());

        // Print the details of the paid online course (course3)
        System.out.println(course3.getCourseDetails());
    }
}
