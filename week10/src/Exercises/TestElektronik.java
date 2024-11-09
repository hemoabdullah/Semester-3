package Exercises;

public class TestElektronik {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Elektronik tvJadul = new TelevisiJadul();
        Elektronik tvModern = new TelevisiModern();

        manusia.nyalakanPerangkat(tvJadul);
        manusia.nyalakanPerangkat(tvModern);
    }
}
