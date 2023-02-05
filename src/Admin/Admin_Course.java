/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author user
 */
public class Admin_Course extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Course
     */
    public Admin_Course() {
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

        ViewCourse = new javax.swing.JLabel();
        NoticeExit = new javax.swing.JLabel();
        deleteTxt = new javax.swing.JLabel();
        editTxt = new javax.swing.JLabel();
        createTxt = new javax.swing.JLabel();
        editCourse = new javax.swing.JLabel();
        createCourse = new javax.swing.JLabel();
        viewTxt = new javax.swing.JLabel();
        deleteCourse = new javax.swing.JLabel();
        noticeBackImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create & Maintain Courses");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewTimetable.png"))); // NOI18N
        ViewCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewCourseMouseClicked(evt);
            }
        });
        getContentPane().add(ViewCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 50, 50));

        NoticeExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        NoticeExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NoticeExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NoticeExitMouseClicked(evt);
            }
        });
        getContentPane().add(NoticeExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        deleteTxt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        deleteTxt.setForeground(new java.awt.Color(255, 255, 255));
        deleteTxt.setText("Delete Subject");
        deleteTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteTxtMouseClicked(evt);
            }
        });
        getContentPane().add(deleteTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        editTxt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        editTxt.setForeground(new java.awt.Color(255, 255, 255));
        editTxt.setText("Edit Subject");
        editTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTxtMouseClicked(evt);
            }
        });
        getContentPane().add(editTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        createTxt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        createTxt.setForeground(new java.awt.Color(255, 255, 255));
        createTxt.setText("Create Subject");
        createTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createTxtMouseClicked(evt);
            }
        });
        getContentPane().add(createTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        editCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/editCourse.png"))); // NOI18N
        editCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCourseMouseClicked(evt);
            }
        });
        getContentPane().add(editCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 50, 50));

        createCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/createCourse.png"))); // NOI18N
        createCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createCourseMouseClicked(evt);
            }
        });
        getContentPane().add(createCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 50, 50));

        viewTxt.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        viewTxt.setForeground(new java.awt.Color(255, 255, 255));
        viewTxt.setText("View Subject");
        viewTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewTxtMouseClicked(evt);
            }
        });
        getContentPane().add(viewTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));

        deleteCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/deleteCourse.png"))); // NOI18N
        deleteCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteCourseMouseClicked(evt);
            }
        });
        getContentPane().add(deleteCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 50, 50));

        noticeBackImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface1.jpg"))); // NOI18N
        getContentPane().add(noticeBackImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewTxtMouseClicked
        View_Course co=new View_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewTxtMouseClicked

    private void ViewCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewCourseMouseClicked
        View_Course co=new View_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewCourseMouseClicked

    private void NoticeExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NoticeExitMouseClicked
        Admin_Interface inter=new Admin_Interface();  // back to the user profiles
        inter.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_NoticeExitMouseClicked

    private void deleteTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteTxtMouseClicked
        Delete_Course co=new Delete_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteTxtMouseClicked

    private void editTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTxtMouseClicked
        Edit_Course co=new Edit_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editTxtMouseClicked

    private void createTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTxtMouseClicked
        Create_Course co=new Create_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createTxtMouseClicked

    private void editCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCourseMouseClicked
        Edit_Course co=new Edit_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editCourseMouseClicked

    private void createCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createCourseMouseClicked
        Create_Course co=new Create_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_createCourseMouseClicked

    private void deleteCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteCourseMouseClicked
        Delete_Course co=new Delete_Course();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteCourseMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Course().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NoticeExit;
    private javax.swing.JLabel ViewCourse;
    private javax.swing.JLabel createCourse;
    private javax.swing.JLabel createTxt;
    private javax.swing.JLabel deleteCourse;
    private javax.swing.JLabel deleteTxt;
    private javax.swing.JLabel editCourse;
    private javax.swing.JLabel editTxt;
    private javax.swing.JLabel noticeBackImg;
    private javax.swing.JLabel viewTxt;
    // End of variables declaration//GEN-END:variables
}