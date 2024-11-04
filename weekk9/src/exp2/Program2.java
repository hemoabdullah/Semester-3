package exp2;

public class Program2 {
    public static void main(String[] args) {
        Rector rector = new Rector();

        Student regularStudent = new Student("Hammam");
        Bachelor cumlaudeBachelor = new Bachelor("Ridho");

        rector.giveCumlaudeCertificate(regularStudent);
        rector.giveCumlaudeCertificate(cumlaudeBachelor);

    }
}