/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class form_Admin extends javax.swing.JFrame {

    
    /**
     * Creates new form form_Admin
     */
    public form_Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminTxt = new javax.swing.JTextField();
        adminPwd = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        adminLabel = new javax.swing.JLabel();
        adminImg = new javax.swing.JLabel();
        line = new javax.swing.JPanel();
        adminPwdTxt = new javax.swing.JPasswordField();
        adminExit = new javax.swing.JLabel();
        adminSubmit = new javax.swing.JButton();
        adminClear = new javax.swing.JButton();
        errMsg = new javax.swing.JLabel();
        adminBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(adminTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 150, 25));

        adminPwd.setBackground(new java.awt.Color(255, 255, 255));
        adminPwd.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adminPwd.setForeground(new java.awt.Color(255, 255, 255));
        adminPwd.setText("Password");
        getContentPane().add(adminPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 120, 30));

        adminName.setBackground(new java.awt.Color(255, 255, 255));
        adminName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        adminName.setForeground(new java.awt.Color(255, 255, 255));
        adminName.setText("User Name");
        getContentPane().add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 120, 30));

        adminLabel.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(255, 255, 0));
        adminLabel.setText("ADMIN");
        getContentPane().add(adminLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        adminImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/admin.png"))); // NOI18N
        getContentPane().add(adminImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 120, 130));

        line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lineLayout = new javax.swing.GroupLayout(line);
        line.setLayout(lineLayout);
        lineLayout.setHorizontalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        lineLayout.setVerticalGroup(
            lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        getContentPane().add(line, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 5, 260));

        adminPwdTxt.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        getContentPane().add(adminPwdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 150, 25));

        adminExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        adminExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminExitMouseClicked(evt);
            }
        });
        getContentPane().add(adminExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        adminSubmit.setText("Login");
        adminSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(adminSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        adminClear.setText("Clear");
        adminClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminClearActionPerformed(evt);
            }
        });
        getContentPane().add(adminClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, -1));
        getContentPane().add(errMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 170, 20));

        adminBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface1.jpg"))); // NOI18N
        getContentPane().add(adminBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSubmitActionPerformed
        
        String password=adminPwdTxt.getText().trim();
         String user_name=adminTxt.getText().trim();
         
        if(user_name.isEmpty() && password.isEmpty())
        {
            errMsg.setText("Please enter both fields!!!");
        }
        else if(password.isEmpty())
        {
            errMsg.setText("Please enter password!!!");
        }
        else if(user_name.isEmpty())
        {
            errMsg.setText("Please enter user name!!!");
        }
        else{
            ResultSet rs=null;
            try{
                Connection con=DBConnection.getConnection();
                String sql="select * from users where user_role='"+user_name+"' LIMIT 1";
                PreparedStatement ps=con.prepareCall(sql);
                rs=ps.executeQuery();
                if(rs.next()==true)
                {
                    LogUser log=new LogUser();
                    log.setId(rs.getString("user_id"));
                    
                    Admin_Interface inter=new Admin_Interface();
                    inter.setVisible(true);
                    this.setVisible(false);
                }
                else{
                    errMsg.setText("invalid user");
                }
               
            }
            catch(Exception e)
            {
                errMsg.setText("system error");
            }    
        }             
    }//GEN-LAST:event_adminSubmitActionPerformed

    private void adminExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminExitMouseClicked
        forms_Login log=new forms_Login();  // back to the user profiles
        log.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_adminExitMouseClicked

    private void adminClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminClearActionPerformed
        adminTxt.setText(null);
        adminPwdTxt.setText(null);
    }//GEN-LAST:event_adminClearActionPerformed

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
            java.util.logging.Logger.getLogger(form_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminBack;
    private javax.swing.JButton adminClear;
    private javax.swing.JLabel adminExit;
    private javax.swing.JLabel adminImg;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel adminPwd;
    private javax.swing.JPasswordField adminPwdTxt;
    private javax.swing.JButton adminSubmit;
    private javax.swing.JTextField adminTxt;
    private javax.swing.JLabel errMsg;
    private javax.swing.JPanel line;
    // End of variables declaration//GEN-END:variables
}
