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

public class tools extends javax.swing.JFrame {
 Connection con;
    public tools() {
        initComponents();
        
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        
        try{
                con = DriverManager.getConnection(url, "c##mylinecnter", "654321");
        }
        catch(SQLException ex)
        {
            System.out.println("Error:"+ex.getMessage());
        }
        String sql="SELECT * FROM TOOLS";
        try{
        PreparedStatement pst=con.prepareStatement(sql);
        ResultSet rs=pst.executeQuery();
        TableModel tableModel = ToolsTable.getModel();
    DefaultTableModel model = (DefaultTableModel) tableModel;


        while(rs.next()){
            model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
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
        jScrollPane2 = new javax.swing.JScrollPane();
        ToolsTable = new javax.swing.JTable();
        addbut = new javax.swing.JButton();
        deletbut = new javax.swing.JButton();
        backbutt = new javax.swing.JButton();
        ComboBox = new javax.swing.JComboBox<>();
        show = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tools Page");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TestEnv\\Documents\\NetBeansProjects\\LineProject\\wajhattt\\update (1).png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        txt.setBackground(new java.awt.Color(141, 123, 108));
        txt.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(954, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(143, Short.MAX_VALUE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(567, 567, 567)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 760));

        ToolsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tools_Id", "Tools_Name", "Purchase_Date", "Amount", "Course_number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ToolsTable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 750, 190));

        addbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbutMouseClicked(evt);
            }
        });
        getContentPane().add(addbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 180, 50));

        deletbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletbutMouseClicked(evt);
            }
        });
        deletbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletbutActionPerformed(evt);
            }
        });
        getContentPane().add(deletbut, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 230, 50));

        backbutt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttMouseClicked(evt);
            }
        });
        getContentPane().add(backbutt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 110, 110));

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TOOLS_ID", "TOOLS_NAME", "PURCHASE_DATE", "AMOUNT", "COURSE_NUMBER" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, 50));

        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TOOLS_ID", "TOOLS_NAME", "PURCHASE_DATE", "AMOUNT", "COURSE_NUMBER"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 780, 50));

        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 170, 50));

        setSize(new java.awt.Dimension(1382, 802));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbutMouseClicked
      addtools INK= new addtools();
      INK.show();
      dispose();
      
        // TODO add your handling code here:
    }//GEN-LAST:event_addbutMouseClicked

    private void deletbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletbutMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deletbutMouseClicked

    private void backbuttMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttMouseClicked
selectpage INK= new selectpage(); 
INK.show();
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_backbuttMouseClicked
private void updateTable(){
String sql="select * from TOOLS"; 
try{
         PreparedStatement pst=con.prepareStatement(sql);
 ResultSet rs=pst.executeQuery();
//ToolsTable.setModel(DbUtils.resultSetToTableModel(rs));
}
 catch(Exception e){
          JOptionPane.showMessageDialog(null,e);}}
    private void deletbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletbutActionPerformed
int row = ToolsTable.getSelectedRow();
        String cell = ToolsTable.getModel().getValueAt(row,0).toString();
        String sql= "DELETE FROM TOOLS where TOOLS_ID = "+cell;
        try{
         PreparedStatement pst=con.prepareStatement(sql);
         pst.execute();
         JOptionPane.showMessageDialog(null,"Deleted Succesfully");
             updateTable();

        // pst.close();
         //rs.close();
} 
        catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
}        // TODO add your handling code here:
    }//GEN-LAST:event_deletbutActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
 TableModel tableModel = jTable1.getModel();
        DefaultTableModel model = (DefaultTableModel) tableModel;

        try {
    String selectedColumn = ComboBox.getSelectedItem().toString();
    String query = "SELECT * FROM TOOLS WHERE " + selectedColumn + " = "+txt.getText()+"";
    PreparedStatement pst = con.prepareStatement(query);
// Statment pst=con.createStatment(query);
    ResultSet rs = pst.executeQuery();
    
    if (rs.next()) {
        // Clear existing rows in the table
          model.setRowCount(0);
            model.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
        
            } else {
        JOptionPane.showMessageDialog(null, "No data found!");
    }
} catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
}         // TODO add your handling code here:
    }//GEN-LAST:event_showActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateMouseClicked

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
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tools().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JTable ToolsTable;
    private javax.swing.JButton addbut;
    private javax.swing.JButton backbutt;
    private javax.swing.JButton deletbut;
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
