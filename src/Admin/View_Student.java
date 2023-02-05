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
public class View_Student extends javax.swing.JFrame {
    
    public View_Student() {
        initComponents();       
    }
    
    public View_Student(String id) {
        initComponents();
        viewStuIdTxt.setText(id);
        fill(id);
        
    }
    
    public void fill(String id){
        ProfileStudent p=new ProfileStudent();
        ResultSet rs=p.searchProfile(id);
        
        try {
            if(rs.next()){
                viewDepIdTxt.setText(rs.getString("stu_dept_id"));
                viewLecIdTxt.setText(rs.getString("menter_id"));
                viewStuNameTxt.setText(rs.getString("stu_name"));
                viewStuAddressTxt.setText(rs.getString("stu_address"));
                viewStuGenderTxt.setText(rs.getString("gender"));
                viewStuBdayTxt.setText(rs.getString("stu_b_day"));
                viewStuPnoTxt.setText(rs.getString("stu_p_no"));
                viewStuPwdTxt.setText(rs.getString("user_pwd"));
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

        Student = new javax.swing.JPanel();
        viewStuId = new javax.swing.JLabel();
        viewStuIdTxt = new javax.swing.JTextField();
        viewDepId = new javax.swing.JLabel();
        createLecId = new javax.swing.JLabel();
        createStuName = new javax.swing.JLabel();
        viewStuNameTxt = new javax.swing.JTextField();
        viewStuAddressTxt = new javax.swing.JTextField();
        createStuAddress = new javax.swing.JLabel();
        createStuGender = new javax.swing.JLabel();
        createStuBday = new javax.swing.JLabel();
        viewStuPnoTxt = new javax.swing.JTextField();
        createStuPno = new javax.swing.JLabel();
        createStuPwd = new javax.swing.JLabel();
        viewStuPwdTxt = new javax.swing.JPasswordField();
        Exit = new javax.swing.JLabel();
        viewStuBdayTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        StudentProPic = new javax.swing.JLabel();
        stuShowPassword = new javax.swing.JCheckBox();
        viewDepIdTxt = new javax.swing.JTextField();
        viewLecIdTxt = new javax.swing.JTextField();
        viewStuGenderTxt = new javax.swing.JTextField();
        back1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Student.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewStuId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewStuId.setForeground(new java.awt.Color(255, 255, 255));
        viewStuId.setText("Student ID");
        Student.add(viewStuId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        viewStuIdTxt.setEditable(false);
        viewStuIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        viewStuIdTxt.setText("tgxxx");
        Student.add(viewStuIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, 30));

        viewDepId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        viewDepId.setForeground(new java.awt.Color(255, 255, 255));
        viewDepId.setText("Department ID");
        Student.add(viewDepId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        createLecId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createLecId.setForeground(new java.awt.Color(255, 255, 255));
        createLecId.setText("Lecturer ID");
        Student.add(createLecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        createStuName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createStuName.setForeground(new java.awt.Color(255, 255, 255));
        createStuName.setText("Name");
        Student.add(createStuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        viewStuNameTxt.setEditable(false);
        viewStuNameTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Student.add(viewStuNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 150, 30));

        viewStuAddressTxt.setEditable(false);
        viewStuAddressTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Student.add(viewStuAddressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 350, 30));

        createStuAddress.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createStuAddress.setForeground(new java.awt.Color(255, 255, 255));
        createStuAddress.setText(" Address");
        Student.add(createStuAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        createStuGender.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createStuGender.setForeground(new java.awt.Color(255, 255, 255));
        createStuGender.setText("Gender");
        Student.add(createStuGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        createStuBday.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createStuBday.setForeground(new java.awt.Color(255, 255, 255));
        createStuBday.setText("Birthday");
        Student.add(createStuBday, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        viewStuPnoTxt.setEditable(false);
        viewStuPnoTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Student.add(viewStuPnoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 150, 30));

        createStuPno.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createStuPno.setForeground(new java.awt.Color(255, 255, 255));
        createStuPno.setText("Phone Number");
        Student.add(createStuPno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        createStuPwd.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createStuPwd.setForeground(new java.awt.Color(255, 255, 255));
        createStuPwd.setText("Password");
        Student.add(createStuPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        viewStuPwdTxt.setEditable(false);
        Student.add(viewStuPwdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 150, 30));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        Student.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        viewStuBdayTxt.setEditable(false);
        viewStuBdayTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Student.add(viewStuBdayTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 150, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        StudentProPic.setBackground(new java.awt.Color(255, 255, 0));
        StudentProPic.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(StudentProPic, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(StudentProPic, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Student.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 120, 120));

        stuShowPassword.setBackground(new java.awt.Color(51, 51, 51));
        stuShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        stuShowPassword.setText("Show Password");
        stuShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuShowPasswordActionPerformed(evt);
            }
        });
        Student.add(stuShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, -1, -1));

        viewDepIdTxt.setEditable(false);
        viewDepIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Student.add(viewDepIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 150, 30));

        viewLecIdTxt.setEditable(false);
        viewLecIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Student.add(viewLecIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 150, 30));

        viewStuGenderTxt.setEditable(false);
        viewStuGenderTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Student.add(viewStuGenderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 40, 30));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profBack.jpg"))); // NOI18N
        Student.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 620));

        getContentPane().add(Student, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
        
    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        View_Profile p=new View_Profile();  
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

    private void stuShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuShowPasswordActionPerformed
        if(stuShowPassword.isSelected())
        {
            viewStuPwdTxt.setEchoChar((char)0);
        }
        else
        {
             viewStuPwdTxt.setEchoChar('●');
        }
    }//GEN-LAST:event_stuShowPasswordActionPerformed

       
     
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
            java.util.logging.Logger.getLogger(View_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new View_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Student;
    private javax.swing.JLabel StudentProPic;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel createLecId;
    private javax.swing.JLabel createStuAddress;
    private javax.swing.JLabel createStuBday;
    private javax.swing.JLabel createStuGender;
    private javax.swing.JLabel createStuName;
    private javax.swing.JLabel createStuPno;
    private javax.swing.JLabel createStuPwd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox stuShowPassword;
    private javax.swing.JLabel viewDepId;
    private javax.swing.JTextField viewDepIdTxt;
    private javax.swing.JTextField viewLecIdTxt;
    private javax.swing.JTextField viewStuAddressTxt;
    private javax.swing.JTextField viewStuBdayTxt;
    private javax.swing.JTextField viewStuGenderTxt;
    private javax.swing.JLabel viewStuId;
    private javax.swing.JTextField viewStuIdTxt;
    private javax.swing.JTextField viewStuNameTxt;
    private javax.swing.JTextField viewStuPnoTxt;
    private javax.swing.JPasswordField viewStuPwdTxt;
    // End of variables declaration//GEN-END:variables
}