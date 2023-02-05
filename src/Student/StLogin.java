/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Admin.forms_Login;

/**
 *
 * @author admin
 */
public class StLogin extends javax.swing.JFrame {

    /**
     * Creates new form StLogin
     */
    public StLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        Slogin = new javax.swing.JButton();
        Stpw = new javax.swing.JPasswordField();
        Stid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        Slogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Slogin.setText("Login");
        Slogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SloginActionPerformed(evt);
            }
        });
        jPanel1.add(Slogin);
        Slogin.setBounds(230, 250, 90, 30);
        jPanel1.add(Stpw);
        Stpw.setBounds(300, 170, 150, 30);
        jPanel1.add(Stid);
        Stid.setBounds(300, 100, 150, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 110, 70, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 170, 90, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/student.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 60, 120, 140);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(200, 30, 150, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/back.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(440, 10, 80, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/background.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 540, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SloginActionPerformed

        String user_name = Stid.getText().trim();
        String password = Stpw.getText().trim();

        if(user_name.isEmpty() && password.isEmpty())
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Please enter both fields!!!");
        }
        else if(password.isEmpty())
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Please enter password!!!");
        }
        else if(user_name.isEmpty())
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Please enter user name!!!");
        }
        else{
            ResultSet rs=null;
            try{
                Connection con=DbConnect.connect();
                String sql="select * from users where user_role='"+user_name+"' LIMIT 1";
                PreparedStatement ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                    if(rs.next()==true)
                    {
                        Student stu = new Student();
                        stu.setstu_id(rs.getString("user_id"));

                        welcome inter = new welcome();
                        inter.setVisible(true);
                        this.setVisible(false);
                    }
                    else{
                        javax.swing.JOptionPane.showMessageDialog(null,"invalid user");
                    }
            }
            catch(Exception e)
            {
                javax.swing.JOptionPane.showMessageDialog(null,"system error");
            }
        }

    }//GEN-LAST:event_SloginActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        forms_Login stu=new forms_Login();
        stu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(StLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Slogin;
    private javax.swing.JTextField Stid;
    private javax.swing.JPasswordField Stpw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}