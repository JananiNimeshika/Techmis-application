/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalOfficer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Admin.forms_Login;

/**
 *
 * @author Umayanga
 */
public class tecLogin extends javax.swing.JFrame {

    /**
     * Creates new form TecLogin
     */
    public tecLogin() {
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

        background = new javax.swing.JPanel();
        errMsg = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        technical = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        password2 = new javax.swing.JTextField();
        id3 = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        backgrond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Technical Officer");
        setResizable(false);
        setSize(new java.awt.Dimension(840, 480));

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errMsg.setBackground(new java.awt.Color(255, 255, 255));
        errMsg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        errMsg.setForeground(new java.awt.Color(204, 0, 0));
        errMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        errMsg.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        background.add(errMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 260, 20));

        title.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Technical Officer");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        technical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/technical.png"))); // NOI18N
        background.add(technical, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 170, 160));

        password.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        background.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        id1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("ID");
        background.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        background.add(password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 260, 30));

        id3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id3ActionPerformed(evt);
            }
        });
        background.add(id3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 260, 30));

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        background.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 150, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/exit.png"))); // NOI18N
        back.setPreferredSize(new java.awt.Dimension(20, 20));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLogin(evt);
            }
        });
        background.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 60, 50));

        backgrond.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/background.jpg"))); // NOI18N
        background.add(backgrond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
//        tecWelcome welcome = new tecWelcome();
//        
//        welcome.setVisible(true);
//        this.dispose();
        
        String password=password2.getText().trim();
        String Id=id3.getText().trim();

        if(Id.isEmpty() && password.isEmpty())
        {
            errMsg.setText("Please enter both fields!!!");
        }
        else if(password.isEmpty())
        {
            errMsg.setText("Please enter password!!!");
        }
        else if(Id.isEmpty())
        {
            errMsg.setText("Please enter id!!!");
        }
        else{
            ResultSet rs=null;
            try{
               Connection con = DbConnection.getMyConnection(); //Add connection
                String sql="select * from users where user_id='"+Id+"' and user_pwd = '"+password+"' LIMIT 1";
                PreparedStatement ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                if(rs.next())
                {
                    

                   // tecWelcome welcome=new tecWelcome();
                    //welcome.setVisible(true);
                    //this.setVisible(false);
                    if("Tech officer".equals(rs.getString("user_role"))){
                       
                        
                        
                        
                        tecWelcome tecWelcome1 = new tecWelcome(rs);
                        tecWelcome1.setVisible(true);
                        setVisible(false);
                     
                    }
                    
                }
                else{
                    errMsg.setText("invalid user");
                }

            }
            catch(Exception e)
            {
                errMsg.setText("system error");
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_loginActionPerformed

    private void UserLogin(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLogin
        forms_Login login = new forms_Login();
        
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserLogin

    private void id3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id3ActionPerformed

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
            java.util.logging.Logger.getLogger(tecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tecLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tecLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel backgrond;
    private javax.swing.JPanel background;
    private javax.swing.JLabel errMsg;
    private javax.swing.JLabel id1;
    private javax.swing.JTextField id3;
    private javax.swing.JButton login;
    private javax.swing.JLabel password;
    private javax.swing.JTextField password2;
    private javax.swing.JLabel technical;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

  
}
