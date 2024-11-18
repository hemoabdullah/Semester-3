package Assignment;


public class calc extends javax.swing.JFrame {


    public calc() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        mTxtFieldTop = new javax.swing.JTextField();
        mBtn7 = new javax.swing.JButton();
        mBtn8 = new javax.swing.JButton();
        mBtn9 = new javax.swing.JButton();
        mBtnDivide = new javax.swing.JButton();
        mBtn4 = new javax.swing.JButton();
        mBtn5 = new javax.swing.JButton();
        mBtn6 = new javax.swing.JButton();
        mBtnMultiply = new javax.swing.JButton();
        mBtn1 = new javax.swing.JButton();
        mBtn2 = new javax.swing.JButton();
        mBtn3 = new javax.swing.JButton();
        mBtnMinus = new javax.swing.JButton();
        mBtn0 = new javax.swing.JButton();
        mBtnDot = new javax.swing.JButton();
        mBtnPlus = new javax.swing.JButton();
        mBtnEquals = new javax.swing.JButton();

        jButton4.setText("+");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setMinimumSize(new java.awt.Dimension(178, 238));
        setResizable(false);

        mTxtFieldTop.setEditable(false);
        mTxtFieldTop.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        mBtn7.setText("7");
        mBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn7ActionPerformed(evt);
            }
        });

        mBtn8.setText("8");
        mBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn8ActionPerformed(evt);
            }
        });

        mBtn9.setText("9");
        mBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn9ActionPerformed(evt);
            }
        });

        mBtnDivide.setText("/");
        mBtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnDivideActionPerformed(evt);
            }
        });

        mBtn4.setText("4");
        mBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn4ActionPerformed(evt);
            }
        });

        mBtn5.setText("5");
        mBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn5ActionPerformed(evt);
            }
        });

        mBtn6.setText("6");
        mBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn6ActionPerformed(evt);
            }
        });

        mBtnMultiply.setText("*");
        mBtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnMultiplyActionPerformed(evt);
            }
        });

        mBtn1.setText("1");
        mBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn1ActionPerformed(evt);
            }
        });

        mBtn2.setText("2");
        mBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn2ActionPerformed(evt);
            }
        });

        mBtn3.setText("3");
        mBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn3ActionPerformed(evt);
            }
        });

        mBtnMinus.setText("-");
        mBtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnMinusActionPerformed(evt);
            }
        });

        mBtn0.setText("0");
        mBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtn0ActionPerformed(evt);
            }
        });

        mBtnDot.setText(".");
        mBtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnDotActionPerformed(evt);
            }
        });

        mBtnPlus.setText("+");
        mBtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnPlusActionPerformed(evt);
            }
        });

        mBtnEquals.setText("=");
        mBtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBtnEqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mTxtFieldTop)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(mBtnEquals, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(mBtn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(mBtn1)
                                                                                        .addComponent(mBtn4)
                                                                                        .addComponent(mBtn7))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(mBtn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(mBtn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(mBtn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(mBtn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(mBtn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(mBtnDot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(mBtn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(mBtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(mBtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(mBtnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(mBtnMultiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(mTxtFieldTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtn7)
                                        .addComponent(mBtn8)
                                        .addComponent(mBtn9)
                                        .addComponent(mBtnDivide))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtn4)
                                        .addComponent(mBtn5)
                                        .addComponent(mBtn6)
                                        .addComponent(mBtnMultiply))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtn1)
                                        .addComponent(mBtn2)
                                        .addComponent(mBtn3)
                                        .addComponent(mBtnMinus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mBtn0)
                                        .addComponent(mBtnDot)
                                        .addComponent(mBtnPlus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mBtnEquals)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String mDisplay;

    private void mBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn1ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "1");
    }//GEN-LAST:event_mBtn1ActionPerformed

    private void mBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn2ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "2");
    }//GEN-LAST:event_mBtn2ActionPerformed

    private void mBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn3ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "3");
    }//GEN-LAST:event_mBtn3ActionPerformed

    private void mBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn4ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "4");
    }//GEN-LAST:event_mBtn4ActionPerformed

    private void mBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn5ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "5");
    }//GEN-LAST:event_mBtn5ActionPerformed

    private void mBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn6ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "6");
    }//GEN-LAST:event_mBtn6ActionPerformed

    private void mBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn7ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "7");
    }//GEN-LAST:event_mBtn7ActionPerformed

    private void mBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn8ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "8");
    }//GEN-LAST:event_mBtn8ActionPerformed

    private void mBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn9ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "9");
    }//GEN-LAST:event_mBtn9ActionPerformed

    private void mBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtn0ActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "0");
    }//GEN-LAST:event_mBtn0ActionPerformed

    private void mBtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnDotActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + ".");
    }//GEN-LAST:event_mBtnDotActionPerformed

    private void mBtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnPlusActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "+");
    }//GEN-LAST:event_mBtnPlusActionPerformed

    private void mBtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnMinusActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "-");
    }//GEN-LAST:event_mBtnMinusActionPerformed

    private void mBtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnMultiplyActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "*");
    }//GEN-LAST:event_mBtnMultiplyActionPerformed

    private void mBtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnDivideActionPerformed
        mDisplay = mTxtFieldTop.getText();
        mTxtFieldTop.setText(mDisplay + "/");
    }//GEN-LAST:event_mBtnDivideActionPerformed

    private void mBtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBtnEqualsActionPerformed
        mTxtFieldTop.setText(evaluate(mTxtFieldTop.getText()));
    }//GEN-LAST:event_mBtnEqualsActionPerformed

    private String evaluate(String expression) {
        char[] arr = expression.toCharArray();
        String operand1 = "";
        String operand2 = "";
        String operator = "";
        double result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') {
                if (operator.isEmpty()) {
                    operand1 += arr[i];
                } else {
                    operand2 += arr[i];
                }
            }

            if (arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
                operator += arr[i];
            }
        }

        switch (operator) {
            case "+":
                result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
                break;
            case "-":
                result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
                break;
            case "/":
                result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
                break;
            default:
                result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));
                break;
        }
        return String.valueOf(result);
    }

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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton mBtn0;
    private javax.swing.JButton mBtn1;
    private javax.swing.JButton mBtn2;
    private javax.swing.JButton mBtn3;
    private javax.swing.JButton mBtn4;
    private javax.swing.JButton mBtn5;
    private javax.swing.JButton mBtn6;
    private javax.swing.JButton mBtn7;
    private javax.swing.JButton mBtn8;
    private javax.swing.JButton mBtn9;
    private javax.swing.JButton mBtnDivide;
    private javax.swing.JButton mBtnDot;
    private javax.swing.JButton mBtnEquals;
    private javax.swing.JButton mBtnMinus;
    private javax.swing.JButton mBtnMultiply;
    private javax.swing.JButton mBtnPlus;
    private javax.swing.JTextField mTxtFieldTop;
    // End of variables declaration//GEN-END:variables
}