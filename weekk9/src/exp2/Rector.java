package exp2;

public class Rector {
    public void giveCumlaudeCertificate(Student student) {
        System.out.println("I am the RECTOR, awarding a cumlaude certificate.");
        System.out.println("Congratulations! Please introduce your self");

        student.studyOnCampus();
        student.graduate();
        student.achieveHighGPA();

        System.out.println("----------------------------------------------");
    }
}
