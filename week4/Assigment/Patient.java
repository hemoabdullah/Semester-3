package Assigment;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private int id;
    private List<Appointment> appointments;

    public Patient(String name, int id) {
        this.name = name;
        this.id = id;
        this.appointments = new ArrayList<>();
    }

    public void bookAppointment(Appointment appointment) {
        this.appointments.add(appointment);
        System.out.println("Appointment booked for " + this.name + " with Dr. " + appointment.getDoctor().getName());
    }

    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println(this.name + " has no appointments.");
        } else {
            System.out.println(this.name + "'s appointments:");
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    public String getName() {
        return name;
    }
}
