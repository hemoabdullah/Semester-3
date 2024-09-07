public class TestMahasiswa {
    public static void main(String[] args) {
        System.out.println("--------------------------");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 511;
        mhs1.name = "majid hammam";
        mhs1.address = "Arjusari";
        mhs1.kelas = "2i";
        mhs1.tampilBiodata();

        System.out.println("--------------------------");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 512;
        mhs2.name = "Ali habshi";
        mhs2.address = "batu";
        mhs2.kelas = "3A";
        mhs2.tampilBiodata();

System.out.println("--------------------------");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 513;
        mhs3.name = "baihaqiii";
        mhs3.address = "Sawojajar";
        mhs3.kelas = "2B";
        mhs3.tampilBiodata();
    }
}
