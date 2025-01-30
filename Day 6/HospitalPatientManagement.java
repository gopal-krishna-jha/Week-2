import java.util.*;

//Create an abstract class Patient to indicate the patient details
abstract class Patient {
    // Create private instance variable patientId, name and age
    private String patientId;
    private String name;
    private int age;

    // Parameterized Constructor to initialize variables
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.age = age;
        this.name = name;
    }

    // Create an abstract method calculateBill to calculate the bill
    abstract double calculateBill();

    // Create a method getPatientDetails to get the details about patient
    public String getPatientDetails() {
        String str = "Id of Patient: " + patientId;
        str += "\nName of Patient: " + name;
        str += "\nAge of Patient: " + age;

        return str;
    }
}

// Create a class Inpatient which extends to Patient class
class InPatient extends Patient {
    // Create instance variable noOfDays and perDayCharge
    public int noOfDays;
    public double perDayCharge;

    // Parameterized Constructor to initialize variables
    public InPatient(String patientId, int age, String name, int noOfDays, int perDayCharge) {
        super(patientId, name, age);
        this.noOfDays = noOfDays;
        this.perDayCharge = perDayCharge;
    }

    // Create a method calculateBill to calculate the bill and override it
    public double calculateBill() {
        return noOfDays * perDayCharge;
    }

}

class OutPatient extends Patient {
    // Create an instance consultationCharge
    public double consultationCharges;

    // Parameterized Constructor to initialize variables
    public OutPatient(String patientId, String name, int age, double consultationCharges) {
        super(patientId, name, age);
        this.consultationCharges = consultationCharges;
    }

    // Create a method calculateBill to calculate the bill and override it
    public double calculateBill() {
        return consultationCharges;
    }
}

// Create an interface MedicalRecord
interface MedicalRecord {
    // define a method addRecord
    void addRecord(String record);

    // define viewRecords method
    void viewRecords();
}

// Create a class GetMedicalRecords which implements MedicalRecord interface
class GetMedicalRecords implements MedicalRecord {
    // Create an array list to store records
    ArrayList<String> records = new ArrayList<>();

    // Create a method addRecord and override it
    public void addRecord(String record) {
        records.add(record);
    }

    // Create a method viewRecord and override it
    public void viewRecords() {
        System.out.println("Medical Records: ");
        for (String value : records) {
            System.out.println(value);
        }
    }
}

// Create a class HospitalPatientManagement to access the Patient, Inpatient,
// OutPatient and GetMedicalRecords class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Create an object of Inpatient class
        Patient patient1 = new InPatient("01921", 32, "Sumit", 15, 500);

        // Create an object of OutPatient class
        Patient patient2 = new OutPatient("01651", "Kanishk", 24, 2000);

        // Print the result of patient1 and call the method
        System.out.println("Patient Details: \n" + patient1.getPatientDetails());
        System.out.println("Total Bill Amount: " + patient1.calculateBill());

        // Print the result of patient1 and call the method
        System.out.println("\nPatient Details: \n" + patient2.getPatientDetails());
        System.out.println("Total Bill Amount: " + patient2.calculateBill());

        // Create an object of GetMedicalRecords class
        GetMedicalRecords newRecords = new GetMedicalRecords();

        System.out.println();

        // Call the methods to add the records
        newRecords.addRecord("Blood Test");
        newRecords.addRecord("Medicine");
        newRecords.addRecord("Cancer");

        // Call the method to view the records
        newRecords.viewRecords();
    }
}
