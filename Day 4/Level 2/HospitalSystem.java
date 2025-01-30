import java.util.*;

// Patient class
class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Doctor class
class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add a patient to the doctor's list
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    // Simulate a consultation
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            System.out.println("Patient " + patient.getName() + " is not registered with Dr. " + name + ".");
            return;
        }
        System.out.println("Dr. " + name + " is consulting with patient " + patient.getName() + ".");
    }

    // List all patients for this doctor
    public void listPatients() {
        System.out.println("Patients under Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Hospital class
class Hospital {
    private String name;
    private List<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // List all doctors in the hospital
    public void listDoctors() {
        System.out.println("Doctors in " + name + ":");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
    }
}

// Main class to demonstrate functionality
public class HospitalSystem {
    public static void main(String[] args) {
        // Create patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");
        Patient patient3 = new Patient("Charlie");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith");
        Doctor doctor2 = new Doctor("Dr. Johnson");

        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Establish associations between doctors and patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);

        doctor2.addPatient(patient2);
        doctor2.addPatient(patient3);

        // Display hospital doctors
        System.out.println("Hospital: " + hospital.getName());
        hospital.listDoctors();

        // Show doctor-patient relationships
        System.out.println("\nDoctor-Patient Associations:");
        doctor1.listPatients();
        doctor2.listPatients();

        // Simulate consultations
        System.out.println("\nConsultations:");
        doctor1.consult(patient1); // Valid
        doctor1.consult(patient3); // Invalid, as patient3 is not under doctor1
        doctor2.consult(patient3); // Valid
    }
}
