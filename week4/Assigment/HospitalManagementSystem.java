package Assigment;

import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Department cardiology = new Department("Cardiology");
        Department neurology = new Department("Neurology");
        Department dermatology = new Department("Dermatology");
        Department orthopedics = new Department("Orthopedics");

        Doctor Hammam = new Doctor("Dr. Hammam", "Cardiologist", cardiology);
        Doctor faiz = new Doctor("Dr. faiz", "Neurologist", neurology);
        Doctor adzin = new Doctor("Dr. adzin", "Dermatologist", dermatology);
        Doctor imam = new Doctor("Dr. imam", "Orthopedic Surgeon", orthopedics);
        Doctor Agna = new Doctor("Dr. Agna", "Cardiologist", cardiology);
        Doctor omar = new Doctor("Dr. omar", "Neurologist", neurology);
        Doctor nadia = new Doctor("Dr. nadia", "Dermatologist", dermatology);
        Doctor mariam = new Doctor("Dr. mariam", "Orthopedic Surgeon", orthopedics);


        System.out.print(" patient name: ");
        String patientName = scanner.nextLine();
        System.out.print(" patient ID: ");
        int patientId = scanner.nextInt();
        scanner.nextLine(); 

        Patient patient = new Patient(patientName, patientId);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Book an Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. View Doctors by Department");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.println("\nSelect Department:");
                    System.out.println("1. Cardiology");
                    System.out.println("2. Neurology");
                    System.out.println("3. Dermatology");
                    System.out.println("4. Orthopedics");
                    int departmentChoice = scanner.nextInt();
                    scanner.nextLine(); 

                    Department selectedDepartment = null;
                    switch (departmentChoice) {
                        case 1: selectedDepartment = cardiology; break;
                        case 2: selectedDepartment = neurology; break;
                        case 3: selectedDepartment = dermatology; break;
                        case 4: selectedDepartment = orthopedics; break;
                        default: System.out.println("Invalid department choice."); continue;
                    }

                    selectedDepartment.listDoctors();

                    System.out.print("\nEnter Doctor's name: ");
                    String doctorName = scanner.nextLine();

                    Doctor selectedDoctor = null;
                    for (Doctor doctor : selectedDepartment.getDoctors()) {
                        if (doctor.getName().equalsIgnoreCase(doctorName)) {
                            selectedDoctor = doctor;
                            break;
                        }
                    }

                    if (selectedDoctor != null) {
                        System.out.print("Enter appointment date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        System.out.print("Enter appointment time (HH:MM AM/PM): ");
                        String time = scanner.nextLine();
                        Appointment appointment = new Appointment(date, time, patient, selectedDoctor);
                        patient.bookAppointment(appointment);
                    } else {
                        System.out.println("Doctor not found.");
                    }
                    break;

                case 2:
                    patient.viewAppointments();
                    break;

                case 3:
                    System.out.println("\nDepartments:");
                    System.out.println("1. Cardiology");
                    System.out.println("2. Neurology");
                    System.out.println("3. Dermatology");
                    System.out.println("4. Orthopedics");
                    departmentChoice = scanner.nextInt();
                    scanner.nextLine(); 

                    selectedDepartment = null;
                    switch (departmentChoice) {
                        case 1: selectedDepartment = cardiology; break;
                        case 2: selectedDepartment = neurology; break;
                        case 3: selectedDepartment = dermatology; break;
                        case 4: selectedDepartment = orthopedics; break;
                        default: System.out.println("Invalid department choice."); continue;
                    }

                    selectedDepartment.listDoctors();
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }

        scanner.close();
    }
}