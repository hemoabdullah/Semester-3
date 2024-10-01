package Assigment;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Doctor> doctors;

    public Department(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        this.doctors.add(doctor);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public String getName() {
        return name;
    }

    public void listDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors available in the " + name + " department.");
        } else {
            System.out.println("Doctors available in " + name + " department:");
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }
}
