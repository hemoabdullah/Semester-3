package Percobaan5;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Swing extends javax.swing.JFrame {

    public Swing() {
        initComponents();
    }


    @SuppressWarnings("unchecked")

    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        mPanelHal1 = new javax.swing.JPanel();
        mLabelTitleHal1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTableHal1 = new javax.swing.JTable();
        mLabelNamaHal1 = new javax.swing.JLabel();
        mLabelNimHal1 = new javax.swing.JLabel();
        mTxtFieldNamaHal1 = new javax.swing.JTextField();
        mTxtFieldNimHal1 = new javax.swing.JTextField();
        mLabelKlsHal1 = new javax.swing.JLabel();
        mTxtFieldKlsHal1 = new javax.swing.JTextField();
        mBtnAddHal1 = new javax.swing.JButton();
        mBtnRmHal1 = new javax.swing.JButton();
        mPanelHal2 = new javax.swing.JPanel();
        mLabelTitleHal2 = new javax.swing.JLabel();
        mScrollPanelHal2 = new javax.swing.JScrollPane();
        mTableHal2 = new javax.swing.JTable();
        mLblNmBrgHal2 = new javax.swing.JLabel();
        mTxtFieldNmBrgHal2 = new javax.swing.JTextField();
        mLabelHargaHal2 = new javax.swing.JLabel();
        mTxtFieldHrgHal2 = new javax.swing.JTextField();
        mLabelQtyHal2 = new javax.swing.JLabel();
        mTxtFieldQtyHal2 = new javax.swing.JTextField();
        mBtnAddHal2 = new javax.swing.JButton();
        mBtnRmHal2 = new javax.swing.JButton();
        mPanelHal3 = new javax.swing.JPanel();
        mScrollPanelHal3 = new javax.swing.JScrollPane();
        mTreeHal3 = new javax.swing.JTree();
        mLabelPewaris = new javax.swing.JLabel();
        mTxtFieldPewaris = new javax.swing.JTextField();
        mBtnPewaris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mLabelTitleHal1.setText("Halaman Pertama");

        mTableHal1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "No", "Nama", "Nim", "Kelas"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(mTableHal1);

        mLabelNamaHal1.setText("Nama");

        mLabelNimHal1.setText("NIM");

        mLabelKlsHal1.setText("Kelas");

        mBtnAddHal1.setText("Tambah");
        mBtnAddHal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnAddHal1ActionPerformed(evt);
            }
        });

        mBtnRmHal1.setText("Hapus");
        mBtnRmHal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnRmHal1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mPanelHal1Layout = new javax.swing.GroupLayout(mPanelHal1);
        mPanelHal1.setLayout(mPanelHal1Layout);
        mPanelHal1Layout.setHorizontalGroup(
                mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelHal1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mPanelHal1Layout.createSequentialGroup()
                                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mLabelTitleHal1)
                                                        .addGroup(mPanelHal1Layout.createSequentialGroup()
                                                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mLabelNamaHal1)
                                                                        .addComponent(mLabelNimHal1)
                                                                        .addComponent(mLabelKlsHal1))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(mTxtFieldNamaHal1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                                                                .addComponent(mTxtFieldNimHal1)
                                                                                .addComponent(mTxtFieldKlsHal1))
                                                                        .addGroup(mPanelHal1Layout.createSequentialGroup()
                                                                                .addComponent(mBtnAddHal1)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(mBtnRmHal1)))))
                                                .addGap(50, 50, 50))
                                        .addGroup(mPanelHal1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        mPanelHal1Layout.setVerticalGroup(
                mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelHal1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mLabelTitleHal1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mLabelNamaHal1)
                                        .addComponent(mTxtFieldNamaHal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mTxtFieldNimHal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mLabelNimHal1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mLabelKlsHal1)
                                        .addComponent(mTxtFieldKlsHal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mPanelHal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtnAddHal1)
                                        .addComponent(mBtnRmHal1))
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Halaman 1", mPanelHal1);

        mLabelTitleHal2.setText("Halaman Kedua");

        mTableHal2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "No", "Nama Barang", "Harga", "Quantity"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        mScrollPanelHal2.setViewportView(mTableHal2);

        mLblNmBrgHal2.setText("Nama Barang");

        mLabelHargaHal2.setText("Harga");

        mLabelQtyHal2.setText("Quantity");

        mBtnAddHal2.setText("Tambah");
        mBtnAddHal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnAddHal2ActionPerformed(evt);
            }
        });

        mBtnRmHal2.setText("Hapus");
        mBtnRmHal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnRmHal2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mPanelHal2Layout = new javax.swing.GroupLayout(mPanelHal2);
        mPanelHal2.setLayout(mPanelHal2Layout);
        mPanelHal2Layout.setHorizontalGroup(
                mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelHal2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mPanelHal2Layout.createSequentialGroup()
                                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mLabelTitleHal2)
                                                        .addGroup(mPanelHal2Layout.createSequentialGroup()
                                                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mLblNmBrgHal2)
                                                                        .addComponent(mLabelHargaHal2)
                                                                        .addComponent(mLabelQtyHal2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(mTxtFieldNmBrgHal2)
                                                                                .addComponent(mTxtFieldHrgHal2)
                                                                                .addComponent(mTxtFieldQtyHal2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                                                        .addGroup(mPanelHal2Layout.createSequentialGroup()
                                                                                .addComponent(mBtnAddHal2)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(mBtnRmHal2)))))
                                                .addGap(42, 42, 42))
                                        .addGroup(mPanelHal2Layout.createSequentialGroup()
                                                .addComponent(mScrollPanelHal2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        mPanelHal2Layout.setVerticalGroup(
                mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelHal2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mLabelTitleHal2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mScrollPanelHal2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mLblNmBrgHal2)
                                        .addComponent(mTxtFieldNmBrgHal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mLabelHargaHal2)
                                        .addComponent(mTxtFieldHrgHal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mLabelQtyHal2)
                                        .addComponent(mTxtFieldQtyHal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelHal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtnAddHal2)
                                        .addComponent(mBtnRmHal2))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Halaman 2", mPanelHal2);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        mTreeHal3.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        mScrollPanelHal3.setViewportView(mTreeHal3);

        mLabelPewaris.setText("Masukkan Pewaris/Turunan");

        mBtnPewaris.setText("tambah");
        mBtnPewaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnPewarisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mPanelHal3Layout = new javax.swing.GroupLayout(mPanelHal3);
        mPanelHal3.setLayout(mPanelHal3Layout);
        mPanelHal3Layout.setHorizontalGroup(
                mPanelHal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelHal3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(mPanelHal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mScrollPanelHal3)
                                        .addGroup(mPanelHal3Layout.createSequentialGroup()
                                                .addGroup(mPanelHal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mLabelPewaris)
                                                        .addGroup(mPanelHal3Layout.createSequentialGroup()
                                                                .addComponent(mTxtFieldPewaris, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(mBtnPewaris)))
                                                .addGap(0, 42, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        mPanelHal3Layout.setVerticalGroup(
                mPanelHal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mPanelHal3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mScrollPanelHal3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mLabelPewaris)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mPanelHal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mTxtFieldPewaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mBtnPewaris))
                                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Halaman 3", mPanelHal3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTabbedPane1)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mBtnPewarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnPewarisActionPerformed
        DefaultMutableTreeNode admin = new DefaultMutableTreeNode(mTxtFieldPewaris.getText());
        DefaultMutableTreeNode set = (DefaultMutableTreeNode) mTreeHal3.getLastSelectedPathComponent();
        DefaultTreeModel dt = (DefaultTreeModel) mTreeHal3.getModel();
        dt.insertNodeInto(admin, set, set.getChildCount());
    }//GEN-LAST:event_mBtnPewarisActionPerformed

    private void mBtnAddHal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnAddHal1ActionPerformed
        int no = mTableHal1.getRowCount() + 1;
        String nama = mTxtFieldNamaHal1.getText();
        String nim = mTxtFieldNimHal1.getText();
        String kelas = mTxtFieldKlsHal1.getText();

        DefaultTableModel tableModel = (DefaultTableModel) mTableHal1.getModel();
        Object[] row = {no, nama, nim, kelas};
        tableModel.addRow(row);
    }//GEN-LAST:event_mBtnAddHal1ActionPerformed

    private void mBtnRmHal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnRmHal1ActionPerformed
        try {
            int row = mTableHal1.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) mTableHal1.getModel();
            tableModel.removeRow(row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang dihapus");
        }
    }//GEN-LAST:event_mBtnRmHal1ActionPerformed

    private void mBtnAddHal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnAddHal2ActionPerformed
        int no = mTableHal2.getRowCount() + 1;
        String namaBrg = mTxtFieldNmBrgHal2.getText();
        String harga = "Rp " + mTxtFieldHrgHal2.getText();
        String qty = mTxtFieldQtyHal2.getText();

        DefaultTableModel tableModel = (DefaultTableModel) mTableHal2.getModel();
        Object[] row = {no, namaBrg, harga, qty};
        tableModel.addRow(row);
    }//GEN-LAST:event_mBtnAddHal2ActionPerformed

    private void mBtnRmHal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnRmHal2ActionPerformed
        try {
            int row = mTableHal2.getSelectedRow();
            DefaultTableModel tableModel = (DefaultTableModel) mTableHal2.getModel();
            tableModel.removeRow(row);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang dihapus");
        }
    }//GEN-LAST:event_mBtnRmHal2ActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton mBtnAddHal1;
    private javax.swing.JButton mBtnAddHal2;
    private javax.swing.JButton mBtnPewaris;
    private javax.swing.JButton mBtnRmHal1;
    private javax.swing.JButton mBtnRmHal2;
    private javax.swing.JLabel mLabelHargaHal2;
    private javax.swing.JLabel mLabelKlsHal1;
    private javax.swing.JLabel mLabelNamaHal1;
    private javax.swing.JLabel mLabelNimHal1;
    private javax.swing.JLabel mLabelPewaris;
    private javax.swing.JLabel mLabelQtyHal2;
    private javax.swing.JLabel mLabelTitleHal1;
    private javax.swing.JLabel mLabelTitleHal2;
    private javax.swing.JLabel mLblNmBrgHal2;
    private javax.swing.JPanel mPanelHal1;
    private javax.swing.JPanel mPanelHal2;
    private javax.swing.JPanel mPanelHal3;
    private javax.swing.JScrollPane mScrollPanelHal2;
    private javax.swing.JScrollPane mScrollPanelHal3;
    private javax.swing.JTable mTableHal1;
    private javax.swing.JTable mTableHal2;
    private javax.swing.JTree mTreeHal3;
    private javax.swing.JTextField mTxtFieldHrgHal2;
    private javax.swing.JTextField mTxtFieldKlsHal1;
    private javax.swing.JTextField mTxtFieldNamaHal1;
    private javax.swing.JTextField mTxtFieldNimHal1;
    private javax.swing.JTextField mTxtFieldNmBrgHal2;
    private javax.swing.JTextField mTxtFieldPewaris;
    private javax.swing.JTextField mTxtFieldQtyHal2;
    // End of variables declaration//GEN-END:variables
}