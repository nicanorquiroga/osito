/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.atm;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CUSTOMER extends javax.swing.JFrame {

    ATM var;

    /**
     * Creates new form CUSTOMER
     */
    public CUSTOMER(ATM a) {
        var = a;
        this.user = new ArrayList<Customer_Data>();
        initComponents();
    }
    List<Customer_Data> user;

    private boolean onlyContainsNumbers(String text) {
        try {
            Long.parseLong(text);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public void fastCash() {
        int ab;
        String[] s10 = {"500", "1000", "2000", "5000", "10000", "15000", "20000", ""};
        s10[7] = (String) JOptionPane.showInputDialog(null, "Select Type...", "Account Type", JOptionPane.QUESTION_MESSAGE, null, s10, s10[0]);

        switch (s10[7]) {
            case "500":
                if (var.var1.startingBalance > 500 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 500;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "500" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "1000":
                if (var.var1.startingBalance > 1000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 1000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "1000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "2000":
                if (var.var1.startingBalance > 2000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 2000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "2000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "5000":
                if (var.var1.startingBalance > 5000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 5000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "5000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "10000":
                if (var.var1.startingBalance > 10000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 10000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "10000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "15000":
                if (var.var1.startingBalance > 15000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 15000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "15000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case "20000":
                if (var.var1.startingBalance > 20000 && var.var1.startingBalance > 0) {
                    var.var1.startingBalance = var.var1.startingBalance - 20000;
                    JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);

                    ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                    // 0=yes ; 1=no
                    if (ab == 0) {
                        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + "20000" + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "You do not have enough Amount\nCurrent Amount : " + var.var1.startingBalance, "Account information", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
    }

    public void cashTransfer() {
        user = var.user1;
        int account1 = 0;
        int amount = 0, account = 0;
        String s;
        do {
            s = JOptionPane.showInputDialog(null, "Enter amount you want to transfer ");
            if (onlyContainsNumbers(s)) {
                amount = Integer.parseInt(s);
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
            }
        } while (!onlyContainsNumbers(s));
        if (amount < var.var1.startingBalance) {
            String s1;
            do {
                s1 = JOptionPane.showInputDialog(null, "Enter the account number to which you want to transfer: ");
                if (onlyContainsNumbers(s1)) {
                    account = Integer.parseInt(s1);
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
                }
            } while (!onlyContainsNumbers(s1));
//            account = Integer.parseInt(s1);
            if (account != var.var1.accountNum) {
                boolean found = false;
                for (int i = 0; i < user.size(); i++) {
                    Customer_Data var2 = user.get(i);
                    if (var2.accountNum == account) {
                        int ab = JOptionPane.showConfirmDialog(null, "You wish to transfer Rs  " + amount + " in account held by Mr." + var2.name, "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
                        // 0=yes ; 1=no
                        if (ab == 0) {
                            String s2;
                            do {
                                s2 = JOptionPane.showInputDialog(null, "Please re-enter the account number to which you want to transfer: ");
                                if (onlyContainsNumbers(s1)) {
                                    account1 = Integer.parseInt(s2);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
                                }
                            } while (!onlyContainsNumbers(s2));
                            if (account == account1) {
                                var2.startingBalance = var2.startingBalance + amount;
                                var.var1.startingBalance = var.var1.startingBalance - amount;
                                JOptionPane.showMessageDialog(null, "Transaction confirmed.\n", "Cash Transfer", JOptionPane.INFORMATION_MESSAGE);
                                int ab1 = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Cash Transfer", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                                // 0=yes ; 1=no
                                if (ab1 == 0) {
                                    JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nAmount Transferred:  " + amount + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);

                                }
                            }
                        }
                        found = true;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(null, "Not Fount", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select other account instead of this account", "Cash Transfer", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "you do not have enough cash for transfer.\nYour current cash is " + var.var1.startingBalance, "Cash Transfer", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cashWithdrawal() {
        int amount = 0;
        String s = JOptionPane.showInputDialog(null, "Enter amount you want to Withdrawal ");
        if (onlyContainsNumbers(s)) {
            amount = Integer.parseInt(s);
         
        if (amount < 20000 && amount < var.var1.startingBalance) {
            var.var1.startingBalance = var.var1.startingBalance - amount;
            JOptionPane.showMessageDialog(null, "Cash Successfully Withdrawn! ", "Account information", JOptionPane.PLAIN_MESSAGE);
            int ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            // 0=yes ; 1=no
            if (ab == 0) {
                JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nWithdrawn: " + amount + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "You cannot withdrawal amount more then 20000 ", "Account information", JOptionPane.ERROR_MESSAGE);
        }
    }else {
            JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Withdrawal", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void depositAmount() {
        int amount = 0;
        String s = JOptionPane.showInputDialog(null, "Enter the cash Amount you want to deposit ");

        if (onlyContainsNumbers(s)) {
            amount = Integer.parseInt(s);
        
        var.var1.startingBalance = var.var1.startingBalance + amount;
        JOptionPane.showMessageDialog(null, "Cash Deposited Successfully.", "Deposit Cash ", JOptionPane.PLAIN_MESSAGE);
        int ab = JOptionPane.showConfirmDialog(null, "Do you wish to print a receipt?", "Warning", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        // 0=yes ; 1=no
        if (ab == 0) {
            JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nDeposited: " + amount + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
        }
    }else {
            JOptionPane.showMessageDialog(null, "Please Enter digits only..", "Cash Withdrawal", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void getCash() {
        JOptionPane.showMessageDialog(null, "Account #" + var.var1.accountNum + "\nDate: " + new SimpleDateFormat("MM/dd/yyyy").format(Calendar.getInstance().getTime()) + "\nBalance: " + var.var1.startingBalance, "Account information", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 204));

        jButton1.setBackground(new java.awt.Color(204, 51, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Deposit Cash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Transfer Cash");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 51, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Withdrawal Cash");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 51, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Get Cash");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 51, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 51, 255));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Fast Cash");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Customer Portal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        getCash();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        depositAmount();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        cashWithdrawal();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cashTransfer();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //new ADMIN().setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        fastCash();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new CUSTOMER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
