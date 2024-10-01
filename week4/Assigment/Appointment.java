package Assigment;
public class Appointment {
    private String date;
    private String time;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String date, String time, Patient patient, Doctor doctor) {
        this.date = date;
        this.time = time;
        this.patient = patient;
        this.doctor = doctor;
        doctor.addAppointment(this);
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Appointment with Dr. " + doctor.getName() + " on " + date + " at " + time;
    }
}
