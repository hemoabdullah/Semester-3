import java.util.Scanner;

public class AssignmentBarang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;  // In Rupiah
    public float diskon;    // In %

    public int hitungHargaJual() {
        return hargaDasar - ((int) (diskon / 100 * hargaDasar));
    }

    public void tampilData() {
        System.out.println("\n--- Product Information ---");
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp" + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Jual  : Rp" + hitungHargaJual());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AssignmentBarang barang1 = new AssignmentBarang();
        System.out.print("Enter Product Code: ");
        barang1.kode = scanner.nextLine();

        System.out.print("Enter Product Name : ");
        barang1.namaBarang = scanner.nextLine();

        System.out.print("Enter Base Price in Rupiah: ");
        barang1.hargaDasar = scanner.nextInt();

        System.out.print("Enter Discount % : ");
        barang1.diskon = scanner.nextFloat();

        barang1.tampilData();

        scanner.close();
    }
}
