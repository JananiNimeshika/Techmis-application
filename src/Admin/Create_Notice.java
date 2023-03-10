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
public class Create_Notice extends javax.swing.JFrame {

    /**
     * Creates new form Create_Notice
     */
    public Create_Notice() {
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

        createDate = new javax.swing.JLabel();
        createTitle = new javax.swing.JLabel();
        createNotice = new javax.swing.JLabel();
        createDateTxt = new javax.swing.JTextField();
        sumbit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        createTitleTxt = new javax.swing.JTextArea();
        Exit = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        createNoticeTxt = new javax.swing.JTextArea();
        noticeBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Notice");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createDate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createDate.setForeground(new java.awt.Color(255, 255, 255));
        createDate.setText("Date");
        getContentPane().add(createDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        createTitle.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createTitle.setForeground(new java.awt.Color(255, 255, 255));
        createTitle.setText("Title");
        getContentPane().add(createTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        createNotice.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        createNotice.setForeground(new java.awt.Color(255, 255, 255));
        createNotice.setText("Notice");
        getContentPane().add(createNotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        createDateTxt.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        createDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDateTxtActionPerformed(evt);
            }
        });
        getContentPane().add(createDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 150, 25));

        sumbit.setText("Submit");
        sumbit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitActionPerformed(evt);
            }
        });
        getContentPane().add(sumbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, -1));

        createTitleTxt.setColumns(20);
        createTitleTxt.setRows(5);
        jScrollPane1.setViewportView(createTitleTxt);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 580, 70));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/exit.png"))); // NOI18N
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        createNoticeTxt.setColumns(20);
        createNoticeTxt.setRows(5);
        jScrollPane2.setViewportView(createNoticeTxt);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 600, 140));

        noticeBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/interface1.jpg"))); // NOI18N
        getContentPane().add(noticeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createDateTxtActionPerformed

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        Admin_Notice aNotice=new Admin_Notice();  // back to the user profiles
        aNotice.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ExitMouseClicked

    private void sumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitActionPerformed
      
        Notice no=new Notice();
   
        String date=createDateTxt.getText().trim();
        String title=createTitleTxt.getText().trim();
        String notice=createNoticeTxt.getText().trim();
        
        if(date.isEmpty() || title.isEmpty() || notice.isEmpty())
            {
                javax.swing.JOptionPane.showMessageDialog(null, "Please enter all fields!!!");
            }
    
        else
        {   
          
           no.setNoticeDate(createDateTxt.getText());
           no.setNoticeTitle(createTitleTxt.getText());
           no.setNoticeNotice(createNoticeTxt.getText());
           no.createNotice();

           clearNotice();
        }
        
    }//GEN-LAST:event_sumbitActionPerformed

    public void clearNotice()
    {
      
        createDateTxt.setText(null);
        createTitleTxt.setText(null);
        createNoticeTxt.setText(null);
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
            java.util.logging.Logger.getLogger(Create_Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Notice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel createDate;
    private javax.swing.JTextField createDateTxt;
    private javax.swing.JLabel createNotice;
    private javax.swing.JTextArea createNoticeTxt;
    private javax.swing.JLabel createTitle;
    private javax.swing.JTextArea createTitleTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel noticeBack;
    private javax.swing.JButton sumbit;
    // End of variables declaration//GEN-END:variables

    
}
