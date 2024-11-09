package Exercises;

public class TestBayaran {
    public static void main(String[] args) {
        Pegawai manajer = new Manajer("Andi", 8000000, 2000000);
        Pegawai programmer = new Programmer("Budi", 5000000, 1000000);
        Bayaran bayaran = new Bayaran();

        System.out.println("Gaji Manajer: " + bayaran.hitungBayaran(manajer));
        System.out.println("Gaji Programmer: " + bayaran.hitungBayaran(programmer));
    }
}