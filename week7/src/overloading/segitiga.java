package overloading;
public class segitiga {
    private int mSudut;

    public int totalSudut(int sudutA) {
        return mSudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return mSudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double keliling(int sisiA, int sisiB) {
        double keliling = Math.sqrt((Math.pow(sisiA, 2) + Math.pow(sisiB, 2)));
        return keliling;
    }
}
