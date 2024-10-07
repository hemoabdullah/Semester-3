public class Pegawai {
    protected String nip;
    protected String nama;
    protected String alamat;
    protected int jamKerja; // Work hours
    private static final int TARIF_PER_JAM = 30000; // Hourly rate

    public Pegawai(String nip, String nama, String alamat, int jamKerja) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jamKerja = jamKerja;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public int getGaji() {
        return jamKerja * TARIF_PER_JAM; // Calculate salary based on work hours
    }

    public void displayInfo() {
        System.out.println("NIP: " + nip + ", Nama: " + nama + ", Alamat: " + alamat + ", Gaji: Rp " + getGaji());
    }
}
