/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;



/**
 *
 * @author user
 */
public class View_Lecturer extends javax.swing.JFrame {
    
    public View_Lecturer() {
        initComponents();       
    }
    
    public View_Lecturer(String id) {
        initComponents();
        viewLecIdTxt.setText(id);
        fill(id);
        
    }
    
    public void fill(String id){
        ProfileLecturer l=new ProfileLecturer();
        ResultSet rs=l.searchProfile(id);
        
        try {
            if(rs.next()){
                viewDepIdTxt.setText(rs.getString("lec_dept_id"));
                viewLecIdTxt.setText(rs.getString("lec_id"));
                viewLecNameTxt.setText(rs.getString("lec_name"));
                viewLecAddressTxt.setText(rs.getString("lec_address"));
                viewLecGenderTxt.setText(rs.getString("gender"));
                viewLecPnoTxt.setText(rs.getString("lec_p_no"));
                viewLecPwdTxt.setText(rs.getString("user_pwd"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
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

        jPanel5 = new javax.swing.JPanel();
        LecturerProPic = new javax.swing.JLabel();
        viewLecd = new javax.swing.JLabel();
        viewLecIdTxt = new javax.swing.JTextField();
        viewDepId = new javax.swing.JLabel();
        viewDepIdTxt = new javax.swing.JTextField();
        viewLecAddressTxt = new javax.swing.JTextField();
        viewLecName = new javax.swing.JLabel();
        viewLecNameTxt = new javax.swing.JTextField();
        viewLecAddress = new javax.swing.JLabel();
        viewLecGenderTxt = new javax.swing.JTextField();
        createLecGender = new javax.swing.JLabel();
        viewLecPno = new javax.swing.JLabel();
        viewLecPnoTxt = new javax.swing.JTextField();
        viewLecPwd = new javax.swing.JLabel();
        viewLecPwdTxt = new javax.swing.JPasswordField();
        stuShowPassword = new javax.swing.JCheckBox();
        Exit = new javax.swing.JLabel();
        back1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        LecturerProPic.setBackground(new java.awt.Color(255, 255, 0));
        LecturerProPic.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LecturerProPic, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LecturerProPic, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        viewLecd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewLecd.setForeground(new java.awt.Color(255, 255, 255));
        viewLecd.setText("Lecturer ID");
        getContentPane().add(viewLecd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        viewLecIdTxt.setEditable(false);
        viewLecIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        viewLecIdTxt.setText("lecxx");
        getContentPane().add(viewLecIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 150, 30));

        viewDepId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewDepId.setForeground(new java.awt.Color(255, 255, 255));
        viewDepId.setText("Department ID");
        getContentPane().add(viewDepId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        viewDepIdTxt.setEditable(false);
        viewDepIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(viewDepIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 150, 30));

        viewLecAddressTxt.setEditable(false);
        viewLecAddressTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(viewLecAddressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 350, 30));

        viewLecName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewLecName.setForeground(new java.awt.Color(255, 255, 255));
        viewLecName.setText("Name");
        getContentPane().add(viewLecName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        viewLecNameTxt.setEditable(false);
        viewLecNameTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(viewLecNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 180, 30));

        viewLecAddress.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewLecAddress.setForeground(new java.awt.Color(255, 255, 255));
        viewLecAddress.setText(" Address");
        getContentPane().add(viewLecAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        viewLecGenderTxt.setEditable(false);
        viewLecGenderTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(viewLecGenderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 40, 30));

        createLecGender.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createLecGender.setForeground(new java.awt.Color(255, 255, 255));
        createLecGender.setText("Gender");
        getContentPane().add(createLecGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        viewLecPno.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewLecPno.setForeground(new java.awt.Color(255, 255, 255));
        viewLecPno.setText("Phone Number");
        getContentPane().add(viewLecPno, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        viewLecPnoTxt.setEditable(false);
        viewLecPnoTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(viewLecPnoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 150, 30));

        viewLecPwd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewLecPwd.setForeground(new java.awt.Color(255, 255, 255));
        viewLecPwd.setText("Password");
        getContentPane().add(viewLecPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        viewLecPwdTxt.setEditable(false);
        getContentPane().add(viewLecPwdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 150, 30));

        stuShowPassword.setBackground(new java.awt.Color(51, 51, 51));
        stuShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        stuShowPassword.setText("Show Password");
        stuShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(stuShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, -1, -1));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, -1));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profBack.jpg"))); // NOI18N
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stuShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuShowPasswordActionPerformed
        if(stuShowPassword.isSelected())
        {
            viewLecPwdTxt.setEchoChar((char)0);
        }
        else
        {
            viewLecPwdTxt.setEchoChar('???');
        }
    }//GEN-LAST:event_stuShowPasswordActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        View_Profile p=new View_Profile();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

   
        
       
     
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
            java.util.logging.Logger.getLogger(View_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Lecturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Lecturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel LecturerProPic;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel createLecGender;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JCheckBox stuShowPassword;
    private javax.swing.JLabel viewDepId;
    private javax.swing.JTextField viewDepIdTxt;
    private javax.swing.JLabel viewLecAddress;
    private javax.swing.JTextField viewLecAddressTxt;
    private javax.swing.JTextField viewLecGenderTxt;
    private javax.swing.JTextField viewLecIdTxt;
    private javax.swing.JLabel viewLecName;
    private javax.swing.JTextField viewLecNameTxt;
    private javax.swing.JLabel viewLecPno;
    private javax.swing.JTextField viewLecPnoTxt;
    private javax.swing.JLabel viewLecPwd;
    private javax.swing.JPasswordField viewLecPwdTxt;
    private javax.swing.JLabel viewLecd;
    // End of variables declaration//GEN-END:variables
}
