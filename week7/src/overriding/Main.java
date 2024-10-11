package overriding;

public class Main {
    public static void main(String[] args) {
        Manusia mns = new Manusia();
        Dosen dsn = new Dosen();
        Mahasiswa mhs = new Mahasiswa();

        System.out.println("Normal");
        mns.bernafas();
        mns.makan();

        System.out.println("\nDynamic Method Dispatch Dosen");
        mns = dsn;
        mns.bernafas();
        mns.makan();

        System.out.println("\nDynamic Method Dispatch Mahasiswa");
        mns = mhs;
        mns.bernafas();
        mns.makan();

        System.out.println("\nKembali normal");
        mns = new Manusia();
        mns.bernafas();
        mns.makan();
    }
}