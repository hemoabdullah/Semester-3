package overriding;

public class Dosen extends Manusia {
    @Override
    public void bernafas() {
        System.out.println("Dosen bernafas juga");
    }

    @Override
    public void makan() {
        System.out.println("Dosen makan juga");
    }
}