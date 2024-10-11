package percobaan1;
import java.util.Locale;

public class Staff extends Karyawan {
    private int mLembur;
    private double mGajiLembur;

    public int getLembur() {
        return mLembur;
    }

    public void setLembur(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getGajiLembur(int mLembur, double mGajiLembur) {
        return super.getGaji() + mGajiLembur * mGajiLembur;
    }

    public double getGajiLembur() {
        return super.getGaji() + mLembur * mGajiLembur;
    }

    public void setGajiLembur(double mGajiLembur) {
        this.mGajiLembur = mGajiLembur;
    }

    public void lihatInfo() {
        System.out.println("NIP\t\t\t: " + this.getNip());
        System.out.println("Nama\t\t: " + this.getNama());
        System.out.println("Golongan\t: " + this.getGolongan());
        System.out.println("Jml Lembur\t: " + this.getLembur());
        System.out.printf(Locale.ITALY, "Gaji Lembur\t: Rp %,.0f\n", this.getGajiLembur());
        System.out.printf(Locale.ITALY, "Gaji\t\t: Rp %,.0f\n\n", this.getGaji());
    }
}