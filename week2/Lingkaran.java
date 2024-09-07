import java.util.Scanner;

public class Lingkaran {
    public double phi = 3.14;
    public double r;

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

    public void tampilHasil() {
        System.out.println("\n--- Circle Information ---");
        System.out.println("Radius: " + r);
        System.out.println("Area: " + hitungLuas());
        System.out.println("Circumference: " + hitungKeliling());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lingkaran lingkaran1 = new Lingkaran();

        System.out.print("Enter the radius of the circle: ");
        lingkaran1.r = scanner.nextDouble();
        lingkaran1.tampilHasil();
        scanner.close();
    }
}
