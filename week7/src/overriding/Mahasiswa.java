package overriding;


public class Mahasiswa extends Manusia {
    @Override
    public void bernafas() {
        System.out.println("Mahasiswa juga bernafas");
    }

    @Override
    public void makan() {
        System.out.println("Mahasiswa juga makan");
    }
}