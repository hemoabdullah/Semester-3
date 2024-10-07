public class Tabung extends bangun {
    protected int t;

    void setSuperPhi(double phi) {
        super.phi = phi;
    }

    void setSuperR(int r) {
        super.r = r;
    }

    public void setT(int t) {
        this.t = t;
    }

    void volume() {
        System.out.println("Volume Tabung = " + (super.phi * super.r * super.r * this.t));

    }
}