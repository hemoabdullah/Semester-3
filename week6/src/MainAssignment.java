import java.util.Scanner;

public class MainAssignment {
    public static void main(String[] args) {
        GajiDaftar daftarGaji = new GajiDaftar(5);

        Dosen dosen1 = new Dosen("5432", "Dr. Afif", "Jl. Bandulan");
        dosen1.setSKS(12);
        daftarGaji.addPegawai(dosen1);

        Dosen dosen2 = new Dosen("2356", "Dr. Ameen", "Jl. Suhat");
        dosen2.setSKS(14);
        daftarGaji.addPegawai(dosen2);

        Pegawai pegawai1 = new Pegawai("9879", "Hammam", "Jl. Sukun", 160);
        daftarGaji.addPegawai(pegawai1);

        Pegawai pegawai2 = new Pegawai("1010", "Majid", "Jl. Batu", 120);
        daftarGaji.addPegawai(pegawai2);

        Scanner scanner = new Scanner(System.in);
        boolean continueRunning = true;

        while (continueRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Show All Pegawai");
            System.out.println("2. Search by NIP");
            System.out.println("3. Show Daftar Pegawai");
            System.out.println("4. Exit");
            System.out.print("Pick option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    daftarGaji.tampilkanSemuaPegawai();
                    break;
                case 2:
                    System.out.print("Enter the NIP you are looking for: ");
                    String nip = scanner.nextLine();
                    Pegawai pegawai = daftarGaji.cariPegawai(nip);
                    if (pegawai != null) {
                        pegawai.displayInfo();
                    } else {
                        System.out.println("Pegawai dengan NIP " + nip + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.println("Daftar Gaji Pegawai:");
                    daftarGaji.tampilkanSemuaPegawai();
                    break;
                case 4:
                    continueRunning = false;
                    System.out.println("Thank you! Program ended.");
                    break;
                default:
                    System.out.println("Option not valid.");
            }
        }

        scanner.close();
    }
}
