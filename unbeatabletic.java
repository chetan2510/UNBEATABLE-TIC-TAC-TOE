
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class unbeatabletic extends javax.swing.JFrame implements ActionListener {

    boolean flag2 = true;
    boolean flag;
    boolean count = true;
    boolean count2 = true;

    public unbeatabletic() {
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setTitle("beat me if u can");

        initComponents();
        b4.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b7.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b3.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b4.setText("-");

        b1.setText("-");

        b2.setText("-");

        b7.setText("-");

        b5.setText("-");

        b6.setText("-");

        b8.setText("-");

        b9.setText("-");

        b3.setText("-");

        lb1.setText("COMPUTER VS HUMAN -------PLEASE PROCEED");

        lb2.setText("LETS SEE WHO WINS!!!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(unbeatabletic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(unbeatabletic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(unbeatabletic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(unbeatabletic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new unbeatabletic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        count2 = true;
        if (flag2 == true) {
            if (e.getSource() == b1) {
                b1.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b2.getText() == "X") {
                        b3.setText("0");
                    } else if (b4.getText() == "X") {
                        b7.setText("0");
                    } else if (b5.getText() == "X") {
                        if (b9.getText() != "0") {
                            b9.setText("0");
                        } else {
                            place();
                        }
                    } else if (b3.getText() == "X") {
                        b2.setText("0");
                    } else if (b7.getText() == "X") {
                        b4.setText("0");
                    } else if (b9.getText() == "X") {
                        if (b5.getText() != "0") {
                            b5.setText("0");
                        } else {
                            place();
                        }
                    } else {
                        place();
                    }

                }
                check();
            } else if (e.getSource() == b2) {
                b2.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b1.getText() == "X") {
                        b3.setText("0");
                    } else if (b3.getText() == "X") {
                        b1.setText("0");
                    } else if (b5.getText() == "X") {
                        b8.setText("0");
                    } else if (b8.getText() == "X") {
                        if (b5.getText() != "0") {
                            b5.setText("0");
                        } else {
                            place();
                        }
                    } else {
                        place();
                    }
                }
                check();
            } else if (e.getSource() == b3) {
                b3.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b1.getText() == "X") {
                        b2.setText("0");
                    } else if (b2.getText() == "X") {
                        b1.setText("0");
                    } else if (b5.getText() == "X") {
                        if (b7.getText() != "0") {
                            b7.setText("0");
                        } else {
                            place();
                        }
                    } else if (b7.getText() == "X") {
                        if (b5.getText() != "0") {
                            b5.setText("0");
                        } else {
                            place();
                        }
                    } else if (b6.getText() == "X") {
                        b9.setText("0");
                    } else if (b9.getText() == "X") {
                        b6.setText("0");
                    } else {
                        place();
                    }

                }
                check();

            } else if (e.getSource() == b4) {
                b4.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b1.getText() == "X") {
                        b7.setText("0");
                    } else if (b7.getText() == "X") {
                        b1.setText("0");
                    } else if (b5.getText() == "X") {
                        if (b6.getText() != "0") {
                            b6.setText("0");
                        } else {
                            place();
                        }
                    } else if (b6.getText() == "X") {
                        if (b5.getText() == "0") {
                            b5.setText("0");
                        } else {
                            place();
                        }
                    } else {
                        place();
                    }

                }
                check();
            } else if (e.getSource() == b5) {
                b5.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b1.getText() == "X") {
                        b9.setText("0");
                    } else if (b9.getText() == "X") {
                        b1.setText("0");
                    } else if (b3.getText() == "X") {
                        b7.setText("0");
                    } else if (b7.getText() == "X") {
                        b3.setText("0");
                    } else if (b2.getText() == "X") {
                        b8.setText("0");
                    } else if (b8.getText() == "X") {
                        b2.setText("0");
                    } else {
                        place();
                    }
                }
                check();
            } else if (e.getSource() == b6) {
                b6.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b3.getText() == "X") {
                        b9.setText("0");
                    } else if (b9.getText() == "X") {
                        b3.setText("0");
                    } else if (b5.getText() == "X") {
                        if (b5.getText() != "0") {
                            b4.setText("0");
                        } else {
                            place();
                        }
                    } else if (b4.getText() == "X") {
                        b5.setText("0");
                    } else {
                        place();
                    }

                }
                check();
            } else if (e.getSource() == b7) {
                b7.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b1.getText() == "X") {
                        b4.setText("0");
                    } else if (b4.getText() == "X") {
                        b1.setText("0");
                    } else if (b5.getText() == "X") {
                        if (b3.getText() != "0") {
                            b3.setText("0");
                        } else {
                            place();
                        }
                    } else if (b3.getText() == "X") {
                        if (b5.getText() != "0") {
                            b5.setText("0");
                        } else {
                            place();
                        }
                    } else if (b8.getText() == "X") {
                        b9.setText("0");
                    } else if (b9.getText() == "X") {
                        b8.setText("0");
                    } else {
                        place();
                    }

                }
                check();
            } else if (e.getSource() == b8) {
                b8.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b5.getText() == "X") {
                        if (b5.getText() != "0") {
                            b2.setText("0");
                        } else {
                            place();
                        }
                    } else if (b2.getText() == "X") {
                        if (b5.getText() != "0") {
                            b5.setText("0");
                        } else {
                            place();
                        }
                    } else if (b9.getText() == "X") {
                        b7.setText("0");
                    } else if (b7.getText() == "X") {
                        b9.setText("0");
                    } else {
                        place();
                    }

                }
                check();
            } else if (e.getSource() == b9) {
                b9.setText("X");
                check();
                artificial();
                if (flag2 == true && count2 == true) {
                    if (b1.getText() == "0") {
                        place();
                    }
                    if (b1.getText() == "X") {
                        if (b5.getText() != "0") {
                            b5.setText("0");
                        } else {
                            place();
                        }
                    } else if (b5.getText() == "X") {
                        b1.setText("0");
                    } else if (b6.getText() == "X") {
                        b3.setText("0");
                    } else if (b3.getText() == "X") {
                        b6.setText("0");
                    } else if (b7.getText() == "X") {
                        b8.setText("0");
                    } else if (b8.getText() == "X") {
                        b7.setText("0");
                    } else {
                        place();
                    }

                }
                check();
            }
        }
    }

    void check() {
        if (b3.getText() == "X" && b1.getText() == "X" && b2.getText() == "X") {

            flag2 = false;
        } else if (b4.getText() == "X" && b5.getText() == "X" && b6.getText() == "X") {

            flag2 = false;
        } else if (b8.getText() == "X" && b9.getText() == "X" && b7.getText() == "X") {
            flag2 = false;

        } else if (b4.getText() == "X" && b7.getText() == "X" && b1.getText() == "X") {
            flag2 = false;
        } else if (b1.getText() == "X" && b5.getText() == "X" && b9.getText() == "X") {
            flag2 = false;

        } else if (b9.getText() == "X" && b6.getText() == "X" && b3.getText() == "X") {
            flag2 = false;

        } else if (b7.getText() == "X" && b5.getText() == "X" && b3.getText() == "X") {
            flag2 = false;

        } else if (b2.getText() == "X" && b5.getText() == "X" && b8.getText() == "X") {
            flag2 = false;

        } else if (b1.getText() == "0" && b2.getText() == "0" && b3.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else if (b4.getText() == "0" && b5.getText() == "0" && b6.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else if (b7.getText() == "0" && b8.getText() == "0" && b9.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else if (b1.getText() == "0" && b4.getText() == "0" && b7.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else if (b2.getText() == "0" && b5.getText() == "0" && b8.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else if (b3.getText() == "0" && b6.getText() == "0" && b9.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else if (b1.getText() == "0" && b5.getText() == "0" && b9.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else if (b3.getText() == "0" && b5.getText() == "0" && b7.getText() == "0") {
            flag2 = false;
            lb2.setText("MACHINE WINS");
            lb2.setBackground(Color.green);
        } else {
            return;
        }
    }

    void place() {
        boolean fl = false;
        if (count) {

            if (b5.getText() == "-") {
                b5.setText("0");
                count = false;
                return;
            } else if (b1.getText() == "-") {
                b1.setText("0");
                count = false;
                return;
            }

        }
        if (!count) {
            if (b1.getText() == "X" && b9.getText() == "X") {
                b6.setText("0");
                fl = true;
            } else if (b3.getText() == "X" && b7.getText() == "X") {
                fl = true;
                b4.setText("0");
            } else if (b5.getText() == "0" && b4.getText() == "X" && b6.getText() == "X") {
                fl = true;
                b7.setText("0");
            } else if (b5.getText() == "X" && b9.getText() == "X" && b1.getText() == "0") {
                fl = true;
                b3.setText("0");
            }
             else if( b5.getText()=="0"&&b8.getText()=="0"&&b2.getText()=="X")
        {
            b4.setText("0");
            fl=true;
        }

            if (!fl) {
                artificial2();
            }
        }
    }

    void artificial() {
        if (b1.getText() == "0" && b2.getText() == "0" && b3.getText() == "-") {
            b3.setText("0");
            count2=false;
        } else if (b1.getText() == "0" && b3.getText() == "0" && b2.getText() == "-") {
            b2.setText("0");
            count2=false;
        } else if (b1.getText() == "0" && b5.getText() == "0" && b9.getText() == "-") {
            b9.setText("0");
            count2=false;
        } else if (b1.getText() == "0" && b9.getText() == "0" && b5.getText() == "-") {
            b5.setText("0");
            count2=false;
        } else if (b1.getText() == "0" && b4.getText() == "0" && b7.getText() == "-") {
            b7.setText("0");
            count2=false;
        } else if (b1.getText() == "0" && b7.getText() == "0" && b4.getText() == "-") {
            b4.setText("0");
            count2=false;
        } else if (b2.getText() == "0" && b1.getText() == "0" && b3.getText() == "-") {
            b3.setText("0");
            count2=false;
        } else if (b2.getText() == "0" && b3.getText() == "0" && b1.getText() == "-") {
            b1.setText("0");
            count2=false;
        } else if (b2.getText() == "0" && b5.getText() == "0" && b8.getText() == "-") {
            b8.setText("0");
            count2=false;
        } else if (b2.getText() == "0" && b8.getText() == "0" && b5.getText() == "-") {
            count2=false;
            b5.setText("0");
        } else if (b3.getText() == "0" && b2.getText() == "0" && b1.getText() == "-") {
            count2=false;
            b1.setText("0");
        } else if (b3.getText() == "0" && b1.getText() == "0" && b2.getText() == "-") {
            count2=false;
            b2.setText("0");
        } else if (b3.getText() == "0" && b5.getText() == "0" && b7.getText() == "-") {
            count2=false;
            b7.setText("0");
        } else if (b3.getText() == "0" && b7.getText() == "0" && b5.getText() == "-") {
            count2=false;
            b5.setText("0");
        } else if (b3.getText() == "0" && b6.getText() == "0" && b9.getText() == "-") {
            count2=false;
            b9.setText("0");
        } else if (b3.getText() == "0" && b9.getText() == "0" && b6.getText() == "-") {
            count2=false;
            b6.setText("0");
        } else if (b4.getText() == "0" && b1.getText() == "0" && b7.getText() == "-") {
            count2=false;
            b7.setText("0");
        } else if (b4.getText() == "0" && b7.getText() == "0" && b1.getText() == "-") {
            count2=false;
            b1.setText("0");
        } else if (b4.getText() == "0" && b5.getText() == "0" && b6.getText() == "-") {
            count2=false;
            b6.setText("0");
        } else if (b4.getText() == "0" && b6.getText() == "0" && b5.getText() == "-") {
            count2=false;
            b5.setText("0");
        } else if (b5.getText() == "0" && b4.getText() == "0" && b6.getText() == "-") {
            count2=false;
            b6.setText("0");
        } else if (b5.getText() == "0" && b6.getText() == "0" && b4.getText() == "-") {
            count2=false;
            b4.setText("0");
        } else if (b6.getText() == "0" && b3.getText() == "0" && b9.getText() == "-") {
            count2=false;
            b9.setText("0");
        } else if (b6.getText() == "0" && b9.getText() == "0" && b3.getText() == "-") {
            count2=false;
            b3.setText("0");
        } else if (b7.getText() == "0" && b5.getText() == "0" && b3.getText() == "-") {
            count2=false;
            b3.setText("0");
        } else if (b7.getText() == "0" && b8.getText() == "0" && b9.getText() == "-") {
            count2=false;
            b9.setText("0");
        } else if (b7.getText() == "0" && b9.getText() == "0" && b8.getText() == "-") {
            count2=false;
            b8.setText("0");
        } else if (b8.getText() == "0" && b9.getText() == "0" && b7.getText() == "-") {
            count2=false;
            b7.setText("0");
        } else if (b8.getText() == "0" && b5.getText() == "0" && b2.getText() == "-") {
            count2=false;
            b2.setText("0");
        } else if (b9.getText() == "0" && b5.getText() == "0" && b1.getText() == "-") {
            count2=false;
            b1.setText("0");
        }

    }

    void artificial2() {
        if (b1.getText() == "X" && b8.getText() == "X") {
            b7.setText("0");
        } else if (b2.getText() == "X" && b4.getText() == "X") {
            b1.setText("0");
        } else if (b2.getText() == "X" && b6.getText() == "X") {
            b3.setText("0");
        } else if (b2.getText() == "X" && b8.getText() == "X") {
            b9.setText("0");
        } else if (b2.getText() == "X" && b7.getText() == "X") {
            b9.setText("0");
        } else if (b2.getText() == "X" && b9.getText() == "X") {
            b7.setText("0");
        } else if (b3.getText() == "X" && b4.getText() == "X") {
            b1.setText("0");
        } else if (b4.getText() == "X" && b8.getText() == "X") {
            b7.setText("0");
        } else if (b4.getText() == "X" && b9.getText() == "X") {
            b7.setText("0");
        } else if (b6.getText() == "X" && b1.getText() == "X") {
            b3.setText("0");
        } else if (b6.getText() == "X" && b7.getText() == "X") {
            b9.setText("0");
        } else if (b6.getText() == "X" && b8.getText() == "X") {
            b9.setText("0");
        } else if (b8.getText() == "X" && b3.getText() == "X") {
            b9.setText("0");
        } else if (b5.getText() == "0" && b4.getText() == "0" && b6.getText() == "X") {
            b2.setText("0");
        } else if (b5.getText() == "0" && b6.getText() == "0" && b4.getText() == "X") {
            b2.setText("0");
        } else if (b7.getText() == "0" && b8.getText() == "0" && b9.getText() == "X") {
            b2.setText("0");
        }
       

    }

}
