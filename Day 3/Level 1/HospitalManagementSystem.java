//Create a class Patient to represent and manage patient details
class Patient {
    // Define static and instance variables for hospital and patient details
    private static String hospitalName = "AIIMS"; // Hospital name common to all patients
    private String name; // Patient name
    private int age; // Patient age
    private String ailment; // Patient ailment description
    private final int patientID; // Unique patient ID
    private static int numberOfPatients = 0; // Counter for total patients

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        numberOfPatients++; // Increment patient count
    }

    // Static method to display the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + numberOfPatients);
    }

    // Instance method to display the details of a patient
    public void displayPatientDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
    }
}

// Create a class HospitalManagementSystem to demonstrate the Patient class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create objects of Patient class with patient details
        Patient patient1 = new Patient("Kishan", 24, "Fever", 1);
        Patient patient2 = new Patient("Ajay", 25, "COVID-19", 2);

        // Check if patient1 is an instance of Patient before displaying details
        if (patient1 instanceof Patient) {
            // Display details of the first patient
            patient1.displayPatientDetails();
            System.out.println(); // New line for better readability

            // Display details of the second patient
            patient2.displayPatientDetails();
        }
        System.out.println(); // New line for better readability

        // Display the total number of patients
        Patient.getTotalPatients();
    }
}
