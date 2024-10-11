package percobaan1;

public class Karyawan {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public String getNama() {
        return mNama;
    }

    public void setNama(String mNama) {
        this.mNama = mNama;
    }

    public String getNip() {
        return mNip;
    }

    public void setNip(String mNip) {
        this.mNip = mNip;
    }

    public String getGolongan() {
        return mGolongan;
    }

    public void setGolongan(String mGolongan) {
        this.mGolongan = mGolongan;

        switch (mGolongan.charAt(0)) {
            case '1':
                this.mGaji = 5000000;
                break;
            case '2':
                this.mGaji = 3000000;
                break;
            case '3':
                this.mGaji = 2000000;
                break;
            case '4':
                this.mGaji = 1000000;
                break;
            case '5':
                this.mGaji = 750000;
                break;
        }
    }

    public Double getGaji() {
        return mGaji;
    }

    public void setGaji(Double mGaji) {
        this.mGaji = mGaji;
    }
}


