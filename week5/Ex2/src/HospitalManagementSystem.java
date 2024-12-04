// Abstract User Class
abstract class User {
    private String uniqueID;
    private String name;

    public User(String uniqueID, String name) {
        this.uniqueID = uniqueID;
        this.name = name;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }
}

// Bill Class
class Bill {
    private String billID;
    private String name;
    private double amount;
    private boolean paidStatus;

    public Bill(String billID, String name, double amount) {
        this.billID = billID;
        this.name = name;
        this.amount = amount;
        this.paidStatus = false;
    }

    public void markAsPaid() {
        paidStatus = true;
        System.out.println("Bill " + billID + " has been paid.");
    }

    public boolean isPaid() {
        return paidStatus;
    }

    public String getBillID() {
        return billID;
    }

    public double getAmount() {
        return amount;
    }
}

// Patient Class
class Patient extends User {
    private Bill bill;

    public Patient(String uniqueID, String name) {
        super(uniqueID, name);
    }

    public void assignBill(Bill bill) {
        this.bill = bill;
    }

    public void payBill() {
        if (bill != null && !bill.isPaid()) {
            bill.markAsPaid();
        } else {
            System.out.println("No bill to pay or bill already paid.");
        }
    }

    public Bill getBill() {
        return bill;
    }
}

// Receptionist Class
class Receptionist extends User {
    public Receptionist(String uniqueID, String name) {
        super(uniqueID, name);
    }

    public void giveAppointment(Patient patient, String appointmentDetails) {
        System.out.println("Appointment for patient " + patient.getName() + " scheduled: " + appointmentDetails);
    }

    public Bill generateBill(String billID, String name, double amount) {
        System.out.println("Bill generated: " + name + ", Amount: " + amount);
        return new Bill(billID, name, amount);
    }
}

// Doctor Class
class Doctor extends User {
    public Doctor(String uniqueID, String name) {
        super(uniqueID, name);
    }

    public void checkPatient(Patient patient) {
        System.out.println("Doctor " + getName() + " is checking patient " + patient.getName());
    }
}

// Hospital Management System Main Class
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating users
        Patient patient = new Patient("P001", "John Doe");
        Receptionist receptionist = new Receptionist("R001", "Jane Smith");
        Doctor doctor = new Doctor("D001", "Dr. House");

        // Receptionist schedules appointment
        receptionist.giveAppointment(patient, "10:00 AM, Dec 6th, 2024");

        // Receptionist generates a bill
        Bill bill = receptionist.generateBill("B001", "Medical Consultation", 200);
        patient.assignBill(bill);

        // Doctor checks the patient
        doctor.checkPatient(patient);

        // Patient pays the bill
        patient.payBill();
    }
}
