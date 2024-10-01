package Assigment;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private String specialization;
    private Department department;
    private List<Appointment> appointments;

    public Doctor(String name, String specialization, Department department) {
        this.name = name;
        this.specialization = specialization;
        this.department = department;
        this.appointments = new ArrayList<>();
        department.addDoctor(this);
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (" + specialization + ")";
    }
}

