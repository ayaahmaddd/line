/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author TestEnv
 */



import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;

public class student extends javax.swing.JFrame {
     Connection con;
    /**
     * Creates new form student
     */
    public student() {
        
        initComponents();
                StudentTable.updateUI();

        String url="jdbc:oracle:thin:@localhost:1521:xe";
        
        try{
                con = DriverManager.getConnection(url, "c##mylinecnter", "654321");
        }
        catch(SQLException ex)
        {
            System.out.println("Error:"+ex.getMessage());
        }
        String sql="SELECT * FROM STUDENT";
        try{
        PreparedStatement pst=con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        TableModel tableModel = StudentTable.getModel();
    DefaultTableModel model = (DefaultTableModel) tableModel;


        while(rs.next()){
            model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
        }
    }
        catch(SQLException ex){
        System.out.println("Error:"+ex.getMessage());

        }
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
        jPanel1 = new javax.swing.JPanel();
        txt = new javax.swing.JTextField();
        addbutt = new javax.swing.JButton();
        delbut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentTable = new javax.swing.JTable();
        backbutton = new javax.swing.JButton();
        show = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ComboBox = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("StudentPage");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\LineProject\\wajhattt\\Update.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt.setBackground(new java.awt.Color(225, 200, 178));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, 50));

        addbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttMouseClicked(evt);
            }
        });
        addbutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttActionPerformed(evt);
            }
        });
        getContentPane().add(addbutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 170, 50));

        delbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delbutMouseClicked(evt);
            }
        });
        delbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbutActionPerformed(evt);
            }
        });
        getContentPane().add(delbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 210, 50));

        StudentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "FNAME", "MNAME", "LNAME", "GENDER", "EMAIL", "ADDRESS", "PHONE", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(StudentTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 790, 200));

        backbutton.setText("jButton1");
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 130, 100));

        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SSN", "FNAME", "MNAME", "LNAME", "GENDER", "EMAIL", "ADDRESS", "PHONE", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 387, 780, 50));

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SSN", "FNAME", "MNAME", "LNAME", "GENDER", "EMAIL", "ADDRESS", "PHONE", "PRICE", " " }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, 50));

        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 170, 40));

        setSize(new java.awt.Dimension(1382, 798));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addbuttMouseClicked

    private void delbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_delbutMouseClicked

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
selectpage INK= new selectpage(); 
INK.show();
dispose();

    }//GEN-LAST:event_backbuttonMouseClicked

    private void delbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbutActionPerformed
int row = StudentTable.getSelectedRow();
        String cell = StudentTable.getModel().getValueAt(row,0).toString();
        String sql= "DELETE FROM STUDENT where SSN= "+cell;
        try{
       PreparedStatement pst=con.prepareStatement(sql);
         pst.execute();
       
         JOptionPane.showMessageDialog(null,"Deleted Succesfully");

        // pst.close();
         //rs.close();
} catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
}        // TODO add your handling code here:
    }//GEN-LAST:event_delbutActionPerformed

    private void addbuttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttActionPerformed
addsudent INK=new addsudent();
INK.show();
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_addbuttActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
   TableModel tableModel = jTable1.getModel();
        DefaultTableModel model = (DefaultTableModel) tableModel;

        try {
    String selectedColumn = ComboBox.getSelectedItem().toString();
    String query = "SELECT * FROM STUDENT WHERE " + selectedColumn + " = "+txt.getText()+"";
    PreparedStatement pst = con.prepareStatement(query);
// Statment pst=con.createStatment(query);
    ResultSet rs = pst.executeQuery();
    
    if (rs.next()) {
        // Clear existing rows in the table
          model.setRowCount(0);
            model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
        
            } else {
        JOptionPane.showMessageDialog(null, "No data found!");
    }
} catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
}        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_showActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
       updatestudent INK=new updatestudent();
INK.show();
dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        updatestudent update = new updatestudent();
        update.show();
        dispose();
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTable StudentTable;
    private javax.swing.JButton addbutt;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton delbut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton show;
    private javax.swing.JTextField txt;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
