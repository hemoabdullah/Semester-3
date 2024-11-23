package hammam.percobaan4;

import java.util.ArrayList;

public class InputData {
    private ArrayList<Mahasiswa> listMahasiswa;

    public InputData() {
        listMahasiswa = new ArrayList<>();
    }

    public void isiData(String nim, String nama, String alamat) {
        Mahasiswa mhs = new Mahasiswa(nim, nama, alamat);
        listMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getData() {
        return listMahasiswa;
    }
}
