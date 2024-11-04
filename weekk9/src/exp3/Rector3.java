package exp3;

public class Rector3 {
    public void giveCumlaudeCertificate(ICumlaude3 student) {
        System.out.println("I am the RECTOR, awarding a cum laude certificate.");
        System.out.println("Congratulations! How did you achieve cum laude?");

        if (student instanceof Student3) {
            ((Student3) student).studyOnCampus();
        }
        student.graduate();
        student.achieveHighGPA();

        System.out.println("----------------------------------------------");
    }

    public void giveAchieverCertificate(IAchiever student) {
        System.out.println("I am the RECTOR, awarding the MAWAPRES certificate.");
        System.out.println("Congratulations! How did you achieve this success?");

        student.winCompetition();
        student.publishScientificPaper();

        System.out.println("----------------------------------------------");
    }
}
