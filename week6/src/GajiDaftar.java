public class GajiDaftar {
    private Pegawai[] listPegawai;
    private int index;

    public GajiDaftar(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
        index = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (index < listPegawai.length) {
            listPegawai[index] = pegawai;
            index++;
        }
    }

    public Pegawai cariPegawai(String nip) {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null && pegawai.getNip().equals(nip)) {
                return pegawai;
            }
        }
        return null;
    }

    public void tampilkanSemuaPegawai() {
        for (Pegawai pegawai : listPegawai) {
            if (pegawai != null) {
                pegawai.displayInfo();
            }
        }
    }
}
