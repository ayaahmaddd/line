
import java.awt.HeadlessException;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author TestEnv
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.io.IOException;


public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    Connection con;
    public login() {
        initComponents();



    }
    String email;
public String getemail(){
    email=emailtxtlog.getText();
    return email;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        emailtxtlog = new javax.swing.JTextField();
        passtxt = new javax.swing.JPasswordField();
        forgbut = new javax.swing.JButton();
        logbut = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\LineProject\\wajhattt\\qqqqq.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        emailtxtlog.setBackground(new java.awt.Color(244, 233, 220));
        emailtxtlog.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emailtxtlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtlogActionPerformed(evt);
            }
        });

        passtxt.setBackground(new java.awt.Color(244, 233, 220));
        passtxt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(emailtxtlog, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(70, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(29, Short.MAX_VALUE)
                    .addComponent(emailtxtlog, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(332, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(154, Short.MAX_VALUE)
                    .addComponent(passtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(219, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 600, 400));

        forgbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgbutMouseClicked(evt);
            }
        });
        forgbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgbutActionPerformed(evt);
            }
        });
        getContentPane().add(forgbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 340, 40));

        logbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logbutActionPerformed(evt);
            }
        });
        getContentPane().add(logbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 350, 50));

        showpass.setBackground(new java.awt.Color(0, 0, 0));
        showpass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        showpass.setText("showpass");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        getContentPane().add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 60, 50));

        setSize(new java.awt.Dimension(1150, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forgbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgbutMouseClicked
       Forget INK = new Forget();
   INK.show();
       dispose();
    }//GEN-LAST:event_forgbutMouseClicked
     public JTextField getTextFieldFromLoginPage() {
    return emailtxtlog;
    }
    private void emailtxtlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtlogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtlogActionPerformed

    private void forgbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgbutActionPerformed
dispose();//close login page
                Forget forgetp = new Forget();
                forgetp.show();        // TODO add your handling code here:
    }//GEN-LAST:event_forgbutActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
if(showpass.isSelected())
{ passtxt.setEchoChar((char)0);}
else passtxt.setEchoChar('*');
// TODO add your handling code here:
    }//GEN-LAST:event_showpassActionPerformed
 
    private void logbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logbutActionPerformed
    getemail();
    //checkemail = false;
    //checkifemail();
    if (email.startsWith("m")) {
        // Email belongs to an employee with job title "manager"
        // Close login page
        selectpage INK = new selectpage();
        INK.show();
        dispose();
    } else if (email.startsWith("e")) {
        // Email starts with "e" but job title is not "manager"
     selectpageemployee INK = new selectpageemployee();
        INK.show();
        dispose();
    }  else {
       
        // Email does not belong to a manager or an employee
        JOptionPane.showMessageDialog(null, "");}
    // dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_logbutActionPerformed
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField emailtxtlog;
    private javax.swing.JButton forgbut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logbut;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JCheckBox showpass;
    // End of variables declaration//GEN-END:variables
}
