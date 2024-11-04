package exp3;

public class Program3 {
    public static void main(String[] args) {
        Rector3 rector = new Rector3();

        Undergraduate undergraduateCumlaude = new Undergraduate("Hammam");
        Graduate graduateCumlaude = new Graduate("Majid");

        rector.giveCumlaudeCertificate(undergraduateCumlaude);
        rector.giveCumlaudeCertificate(graduateCumlaude);

        rector.giveAchieverCertificate(undergraduateCumlaude);
        rector.giveAchieverCertificate(graduateCumlaude);
    }
}
