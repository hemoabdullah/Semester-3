package hammam.percobaan4;
import javax.swing.table.DefaultTableModel;

public class TampilGui extends javax.swing.JFrame {

    public TampilGui() {
        initComponents();
        lihatDataMahasiswa();
    }

    public final void lihatDataMahasiswa() {
        String[] namaKolom = {"NIM", "Nama Mahasiswa", "Alamat"};
        Object[][] objekMahasiswa = new Object[dataMahasiswa.getData().size()][3];
        int i = 0;
        for (Mahasiswa mhs : dataMahasiswa.getData()) {
            String[] arrayMahasiswa = {mhs.getNim(), mhs.getNama(), mhs.getAlamat()};
            objekMahasiswa[i] = arrayMahasiswa;
            i++;
        }
        tableMahasiswa = new DefaultTableModel(objekMahasiswa, namaKolom);
        mTable.setModel(tableMahasiswa);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        mPanel = new javax.swing.JPanel();
        mLblNim = new javax.swing.JLabel();
        mLblNama = new javax.swing.JLabel();
        mLblAlamat = new javax.swing.JLabel();
        mTxtFieldAlamat = new javax.swing.JTextField();
        mTxtFieldNama = new javax.swing.JTextField();
        mTxtFieldNim = new javax.swing.JTextField();
        mBtnSimpan = new javax.swing.JButton();
        mScrlPanel = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mLblNim.setText("NIM");
        mLblNama.setText("Nama");
        mLblAlamat.setText("Alamat");

        mBtnSimpan.setText("Simpan");
        mBtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnSimpanActionPerformed(evt);
            }
        });

        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{"NIM", "Nama Mahasiswa", "Alamat"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false};
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        mScrlPanel.setViewportView(mTable);

        javax.swing.GroupLayout mPanelLayout = new javax.swing.GroupLayout(mPanel);
        mPanel.setLayout(mPanelLayout);
        mPanelLayout.setHorizontalGroup(
            mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mScrlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(mPanelLayout.createSequentialGroup()
                        .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mLblAlamat)
                            .addComponent(mLblNim)
                            .addComponent(mLblNama))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mBtnSimpan)
                            .addComponent(mTxtFieldAlamat)
                            .addComponent(mTxtFieldNama)
                            .addComponent(mTxtFieldNim, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mPanelLayout.setVerticalGroup(
            mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mLblNim)
                    .addComponent(mTxtFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mLblNama)
                    .addComponent(mTxtFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mLblAlamat)
                    .addComponent(mTxtFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mBtnSimpan)
                .addGap(18, 18, 18)
                .addComponent(mScrlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void mBtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        dataMahasiswa.isiData(mTxtFieldNim.getText(), mTxtFieldNama.getText(), mTxtFieldAlamat.getText());
        lihatDataMahasiswa();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TampilGui().setVisible(true));
    }

    private javax.swing.JButton mBtnSimpan;
    private javax.swing.JLabel mLblAlamat;
    private javax.swing.JLabel mLblNama;
    private javax.swing.JLabel mLblNim;
    private javax.swing.JPanel mPanel;
    private javax.swing.JScrollPane mScrlPanel;
    private javax.swing.JTable mTable;
    private javax.swing.JTextField mTxtFieldAlamat;
    private javax.swing.JTextField mTxtFieldNama;
    private javax.swing.JTextField mTxtFieldNim;
    private DefaultTableModel tableMahasiswa;
    private InputData dataMahasiswa = new InputData();
}
