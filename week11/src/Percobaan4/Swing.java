package Percobaan4;


import java.awt.event.ActionEvent;
import javax.swing.*;

public class Swing extends javax.swing.JFrame {

    private String mNama;
    private String mNim;
    private String mAlamat;
    private String mJenisKelamin = "";
    private String mInfo;
    private String mJurusan;
    private String mMataKuliah = "";
    private String mSemester;

    public Swing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        mLabelTitle = new javax.swing.JLabel();
        mLabelNama = new javax.swing.JLabel();
        mLabelNim = new javax.swing.JLabel();
        mTxtFieldNama = new javax.swing.JTextField();
        mTxtFieldNim = new javax.swing.JTextField();
        mLabelJk = new javax.swing.JLabel();
        mLabelMk = new javax.swing.JLabel();
        mLabelJurusan = new javax.swing.JLabel();
        mRbLaki = new javax.swing.JRadioButton();
        mRbPerempuan = new javax.swing.JRadioButton();
        mCbMk1 = new javax.swing.JCheckBox();
        mCbMk2 = new javax.swing.JCheckBox();
        mScrollPanelJurusan = new javax.swing.JScrollPane();
        mListJurusan = new javax.swing.JList<>();
        mLabelSemester = new javax.swing.JLabel();
        mComboBoxSemester = new javax.swing.JComboBox<>();
        mScrollPanelTxtArea = new javax.swing.JScrollPane();
        mTxtArea = new javax.swing.JTextArea();
        mBtnClear = new javax.swing.JButton();
        mBtnTampil = new javax.swing.JButton();
        mLabelAlamat = new javax.swing.JLabel();
        mTxtFieldAlamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        mLabelTitle.setText("Data Mahasiswa");

        mLabelNama.setLabelFor(mTxtFieldNama);
        mLabelNama.setText("Nama");

        mLabelNim.setLabelFor(mTxtFieldNim);
        mLabelNim.setText("NIM");

        mLabelJk.setText("Jenis Kelamin");

        mLabelMk.setText("Mata Kuliah");

        mLabelJurusan.setText("Jurusan");

        mRbLaki.setText("Laki-Laki");

        mRbPerempuan.setText("Perempuan");

        mCbMk1.setText("Sistem Terdistribusi");

        mCbMk2.setText("PBO");

        mScrollPanelJurusan.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        mListJurusan.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "DIV Teknik Informatika", "DIII Manajemen Informatika", "DIV Telekomunikasi", "DIII TeDIV Teknik Informatika", "DIII Manajemen Informatika", "DIV Telekomunikasi", "DIII Teknik Elektronika", "DIV Teknik Mesin", "DIV Teknik Sipil" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        mScrollPanelJurusan.setViewportView(mListJurusan);

        mLabelSemester.setText("Semester");

        mComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semester1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8" }));

        mScrollPanelTxtArea.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        mTxtArea.setColumns(20);
        mTxtArea.setRows(5);
        mScrollPanelTxtArea.setViewportView(mTxtArea);

        mBtnClear.setText("Clear");
        mBtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnClearActionPerformed(evt);
            }
        });

        mBtnTampil.setText("Tampil");
        mBtnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnTampilActionPerformed(evt);
            }
        });

        mLabelAlamat.setText("Alamat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mLabelJk)
                                                        .addComponent(mLabelMk)
                                                        .addComponent(mLabelJurusan))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(mCbMk1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(mCbMk2))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(mRbLaki)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(mRbPerempuan))
                                                        .addComponent(mScrollPanelJurusan))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mScrollPanelTxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(mBtnClear)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(mBtnTampil))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mLabelSemester)
                                                                        .addComponent(mLabelAlamat))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mTxtFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(130, 130, 130)
                                                                .addComponent(mLabelTitle))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mLabelNama)
                                                                        .addComponent(mLabelNim))
                                                                .addGap(50, 50, 50)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mTxtFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mTxtFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mLabelTitle)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addComponent(mLabelNama))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(mTxtFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mLabelNim)
                                                        .addComponent(mTxtFieldNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mLabelJk)
                                                        .addComponent(mRbLaki)
                                                        .addComponent(mRbPerempuan))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mLabelMk)
                                                        .addComponent(mCbMk1)
                                                        .addComponent(mCbMk2))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(mLabelJurusan)
                                                                .addGap(69, 69, 69))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(mScrollPanelJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(mScrollPanelTxtArea)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(mBtnClear)
                                                        .addComponent(mBtnTampil))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mLabelSemester))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mTxtFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mLabelAlamat))
                                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBtnTampilActionPerformed(ActionEvent evt) {
        mNama = mTxtFieldNama.getText();
        mNim = mTxtFieldNim.getText();

        if (mCbMk1.isSelected()) {
            mMataKuliah = mCbMk1.getText();
        }
        if (mCbMk2.isSelected()) {
            mMataKuliah += mCbMk2.getText();
        }

        if (mRbLaki.isSelected()) {
            mJenisKelamin = mRbLaki.getText();
        }
        if (mRbPerempuan.isSelected()) {
            mJenisKelamin += mRbPerempuan.getText();
        }
        mJurusan = mListJurusan.getSelectedValue().toString();
        mSemester = mComboBoxSemester.getSelectedItem().toString();

        mAlamat = mTxtFieldAlamat.getText();
        if (mAlamat.equalsIgnoreCase("")) {
            String alamatInfo = "Alamat masih kosong mohon diisi terlebih dahulu";
            JOptionPane.showMessageDialog(null, alamatInfo);
        } else {
            mInfo = "Nama\t: " + mNama + "\n";
            mInfo += "NIM\t: " + mNim + "\n";
            mInfo += "Alamat\t: " + mAlamat + "\n";
            mInfo += "Jenis Kelamin\t: " + mJenisKelamin + "\n";
            mInfo += "Jurusan\t: " + mJurusan + "\n";
            mInfo += "Semester\t: " + mSemester + "\n";
            mInfo += "Mata Kuliah\t: " + mMataKuliah;
            mTxtArea.setText(mInfo);
            JOptionPane.showMessageDialog(null, mInfo);
        }
    }

    private void mBtnClearActionPerformed(java.awt.event.ActionEvent evt) {
        mTxtFieldNim.setText("");
        mRbLaki.setSelected(false);
        mRbPerempuan.setSelected(false);
        mCbMk1.setSelected(false);
        mCbMk2.setSelected(false);
        mListJurusan.clearSelection();
        mTxtArea.setText("");
        mTxtFieldAlamat.setText("");
        mComboBoxSemester.setSelectedIndex(0);
    }//GEN-LAST:event_mBtnClearActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mBtnClear;
    private javax.swing.JButton mBtnTampil;
    private javax.swing.JCheckBox mCbMk1;
    private javax.swing.JCheckBox mCbMk2;
    private javax.swing.JComboBox<String> mComboBoxSemester;
    private javax.swing.JLabel mLabelAlamat;
    private javax.swing.JLabel mLabelJk;
    private javax.swing.JLabel mLabelJurusan;
    private javax.swing.JLabel mLabelMk;
    private javax.swing.JLabel mLabelNama;
    private javax.swing.JLabel mLabelNim;
    private javax.swing.JLabel mLabelSemester;
    private javax.swing.JLabel mLabelTitle;
    private javax.swing.JList<String> mListJurusan;
    private javax.swing.JRadioButton mRbLaki;
    private javax.swing.JRadioButton mRbPerempuan;
    private javax.swing.JScrollPane mScrollPanelJurusan;
    private javax.swing.JScrollPane mScrollPanelTxtArea;
    private javax.swing.JTextArea mTxtArea;
    private javax.swing.JTextField mTxtFieldAlamat;
    private javax.swing.JTextField mTxtFieldNama;
    private javax.swing.JTextField mTxtFieldNim;
}