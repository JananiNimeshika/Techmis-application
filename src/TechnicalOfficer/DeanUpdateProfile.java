/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalOfficer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Umayanga
 */
public class DeanUpdateProfile extends javax.swing.JFrame {
    
    String filename=null;
    /**
     * Creates new form LectureUpdate
     */
    public DeanUpdateProfile() {
        initComponents();
        showdata();
    }
  void showdata(){
          Dean tec = new  Dean();
    
    Connection con=null;
     try
        {
                con = DbConnection.getMyConnection(); //Add connection
                String result = "SELECT * FROM dean where de_id = '"+tec.getId()+"'";
                PreparedStatement ps = con.prepareStatement(result);
                ResultSet rs = ps.executeQuery();
     if(rs.next())
                {
                    id2.setText(rs.getString("de_id"));
                    name2.setText(rs.getString("de_name"));
                    gender2.setText(rs.getString("gender"));
                    phnum2.setText(rs.getString("de_p_no"));
                }     
     
        }
        
   
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
     
        id2.setText("");
        name2.setText("");
        gender2.setText("");
        phnum2.setText("");
    }
   


    Connection con = DbConnection.getMyConnection(); //Add connection
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        phnum = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        gender2 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        phnum2 = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dean");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Update Profile");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        gender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        phnum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        phnum.setForeground(new java.awt.Color(255, 255, 255));
        phnum.setText("Phone Number");
        jPanel1.add(phnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 260, 30));
        jPanel1.add(gender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 260, 30));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 100, 40));
        jPanel1.add(phnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 260, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/exit.png"))); // NOI18N
        back.setPreferredSize(new java.awt.Dimension(20, 20));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeanLogin(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 50));
        jPanel1.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 260, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 840, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void DeanLogin(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeanLogin
        DeanLogin login = new DeanLogin();

        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeanLogin

    //update profile
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
      
        Dean log = new Dean();
       
        log.setName(id2.getText());
        log.setName(name2.getText());
        log.setName(gender2.getText());
        log.setPno(phnum2.getText());

        log.editProfile();
        
        id2.setText("");
        name2.setText("");
        gender2.setText("");
        phnum2.setText("");
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
            java.util.logging.Logger.getLogger(DeanUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeanUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeanUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeanUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeanUpdateProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel gender;
    private javax.swing.JTextField gender2;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField name2;
    private javax.swing.JLabel phnum;
    private javax.swing.JTextField phnum2;
    private javax.swing.JLabel title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
