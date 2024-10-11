package percobaan1;
import java.util.Locale;

public class Manager extends Karyawan {
    private double mTunjangan;
    private String mBagian;
    private Staff[] mSt;

    public double getTunjangan() {
        return mTunjangan;
    }

    public void setTunjangan(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getBagian() {
        return mBagian;
    }

    public void setBagian(String mBagian) {
        this.mBagian = mBagian;
    }

    public void setStaff(Staff[] mSt) {
        this.mSt = mSt;
    }

    public void viewStaff() {
        System.out.println("===============");
        for (int i = 0; i < mSt.length; i++) {
            mSt[i].lihatInfo();
        }
        System.out.println("===============");
    }

    public void lihatInfo() {
        System.out.println("percobaan.Manager\t\t: " + this.getBagian());
        System.out.println("NIP\t\t\t: " + this.getNip());
        System.out.println("Nama\t\t: " + this.getNama());
        System.out.println("Golongan\t: " + this.getGolongan());
        System.out.printf(Locale.ITALY, "Tunjangan\t: Rp %,.0f\n", this.getTunjangan());
        System.out.printf(Locale.ITALY, "Gaji\t\t: Rp %,.0f\n", this.getGaji());
        System.out.println("Bagian\t\t: " + this.getBagian());
        this.viewStaff();
    }

    @Override
    public Double getGaji() {
        return super.getGaji() + mTunjangan;
    }
}
