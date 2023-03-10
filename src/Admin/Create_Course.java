/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class Create_Course extends javax.swing.JFrame {

    /**
     * Creates new form Create_Course
     */
    public Create_Course() {
        initComponents();
        comboBoxLec();
        comboBoxDep();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Exit = new javax.swing.JLabel();
        createSubIdTxt = new javax.swing.JTextField();
        createSubId = new javax.swing.JLabel();
        createSubNameTxt = new javax.swing.JTextField();
        createSubName = new javax.swing.JLabel();
        createDepIdTxt = new javax.swing.JComboBox<>();
        createLecId = new javax.swing.JLabel();
        createDepId = new javax.swing.JLabel();
        createLecIdTxt = new javax.swing.JComboBox<>();
        sumbit = new javax.swing.JButton();
        noticeBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Course");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        createSubIdTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(createSubIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 25));

        createSubId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createSubId.setForeground(new java.awt.Color(255, 255, 255));
        createSubId.setText("Subject ID");
        getContentPane().add(createSubId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        createSubNameTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(createSubNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 300, 30));

        createSubName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createSubName.setForeground(new java.awt.Color(255, 255, 255));
        createSubName.setText("Subject Name");
        getContentPane().add(createSubName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        getContentPane().add(createDepIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        createLecId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createLecId.setForeground(new java.awt.Color(255, 255, 255));
        createLecId.setText("Lecturer ID");
        getContentPane().add(createLecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        createDepId.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createDepId.setForeground(new java.awt.Color(255, 255, 255));
        createDepId.setText("Department ID");
        getContentPane().add(createDepId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        getContentPane().add(createLecIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        sumbit.setText("Submit");
        sumbit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitActionPerformed(evt);
            }
        });
        getContentPane().add(sumbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, -1, -1));

        noticeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface1.jpg"))); // NOI18N
        noticeBack.setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().add(noticeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        Admin_Course co=new Admin_Course();  // back to the user profiles
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

    public void comboBoxLec()
    { 
        try {
            Connection con=MyConnection.getConnection();
            String sql="SELECT * FROM lecturer";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while(rs.next())
            {
                createLecIdTxt.addItem(rs.getString("lec_id"));
            }
            
        } catch (Exception e) {
        }
    }
    
     public void comboBoxDep()
    { 
        try {
            Connection con=MyConnection.getConnection();
            String sql="SELECT * FROM department";
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs =ps.executeQuery();
            while(rs.next())
            {
                createDepIdTxt.addItem(rs.getString("dept_id"));
            }
            
        } catch (Exception e) {
        }
    }
    
    private void sumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitActionPerformed

        Course co=new Course();
        
        Object dId= createDepIdTxt.getSelectedItem();
        String depId=dId.toString();
        
        String subId=createSubIdTxt.getText().trim();
        String subName=createSubNameTxt.getText().trim();
        
        Object lId= createLecIdTxt.getSelectedItem();
        String lecId=lId.toString();
        
       

        if(subId.isEmpty() || subName.isEmpty())
        {
            javax.swing.JOptionPane.showMessageDialog(null, "Please enter all fields!!!");
        }

        else
        {

            co.setCourseDepId(depId);
            co.setCourseSubId(createSubIdTxt.getText());
            co.setCourseSubName(createSubNameTxt.getText());
            co.setCourseLecId(lecId);
            
            co.createCourse();

           clearCourse();
        }

    }//GEN-LAST:event_sumbitActionPerformed

      public void clearCourse()
    {
        createSubIdTxt.setText(null);
        createSubNameTxt.setText(null);
    } 
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
            java.util.logging.Logger.getLogger(Create_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel createDepId;
    private javax.swing.JComboBox<String> createDepIdTxt;
    private javax.swing.JLabel createLecId;
    private javax.swing.JComboBox<String> createLecIdTxt;
    private javax.swing.JLabel createSubId;
    private javax.swing.JTextField createSubIdTxt;
    private javax.swing.JLabel createSubName;
    private javax.swing.JTextField createSubNameTxt;
    private javax.swing.JLabel noticeBack;
    private javax.swing.JButton sumbit;
    // End of variables declaration//GEN-END:variables
}
