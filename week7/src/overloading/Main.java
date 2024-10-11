package overloading;
public class Main {
    public static void main(String[] args) {
        segitiga segitiga = new segitiga();

        System.out.println("1. Sudut = 180 - sudutA: " + segitiga.totalSudut(60));
        System.out.println("2. Sudut = 180 - (sudutA + sudutB): " + segitiga.totalSudut(60, 70));
        System.out.println("3. Keliling = sisiA + sisiB + sisiC: " + segitiga.keliling(10, 20, 30));
        System.out.println("4. Ganti menjadi phytagoras = \u221A(sisiA\u00B2 + sisiB\u00B2): "
                + segitiga.keliling(4, 3));
    }
}
