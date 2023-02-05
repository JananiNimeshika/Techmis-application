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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Umayanga
 */
public class tecAttendance extends javax.swing.JFrame {
    
     Connection con = DbConnection.getMyConnection(); //Add connection
    
    public tecAttendance() {
        initComponents();
        showdata();
         
    }
   void showdata(){
          tec_Attendance tec = new  tec_Attendance();
    
    Connection con=null;
     try
        {
                con = DbConnection.getMyConnection(); //Add connection
                String result = "SELECT * FROM attendance where stu_id = '"+tec.getstu_id()+"'";
                PreparedStatement ps = con.prepareStatement(result);
                ResultSet rs = ps.executeQuery();
     if(rs.next())
                {
                    id2.setText(rs.getString("stu_id"));
                    cuid2.setText(rs.getString("cu_id"));
                    day2.setText(rs.getString("day"));
                    type2.setText(rs.getString("type"));
                    hour2.setText(rs.getString("hours"));
                    status2.setText(rs.getString("status"));
                }     
     
        }
        
   
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
     
        id2.setText("");
        cuid2.setText("");
        day2.setText("");
        type2.setText("");
        hour2.setText("");
        status2.setText("");
        
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        deleteCheck = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        cuid = new javax.swing.JLabel();
        type2 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        view = new javax.swing.JButton();
        cuid2 = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        hour2 = new javax.swing.JTextField();
        status2 = new javax.swing.JTextField();
        day2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Technical Officer");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deleteCheck.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        deleteCheck.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(deleteCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 130, 20));

        title.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Attendance");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        day.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setText("Day");
        jPanel1.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        type.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("Type");
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        hours.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hours.setForeground(new java.awt.Color(255, 255, 255));
        hours.setText("Hours");
        jPanel1.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        status.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        cuid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cuid.setForeground(new java.awt.Color(255, 255, 255));
        cuid.setText("Course ID");
        jPanel1.add(cuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 270, 30));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 100, 40));

        Delete.setText("Delete");
        Delete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DeleteMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DeleteMouseMoved(evt);
            }
        });
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 100, 40));

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 100, 40));
        jPanel1.add(cuid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 270, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/exit.png"))); // NOI18N
        back.setPreferredSize(new java.awt.Dimension(20, 20));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtecWelcome(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 50));

        id1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("ID");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 270, 30));
        jPanel1.add(hour2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 270, 30));

        status2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status2ActionPerformed(evt);
            }
        });
        jPanel1.add(status2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 270, 30));
        jPanel1.add(day2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 270, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 840, 480));

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

   
    private void backtecWelcome(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backtecWelcome
        tecWelcome welcome = new tecWelcome();

        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backtecWelcome

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        ViewAttendance attendance = new ViewAttendance();

        attendance.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewActionPerformed

    //update
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
//       tec_Attendance log = new tec_Attendance();
//       
//       log.setstu_id(id2.getText());
//       log.setcu_id(cuid2.getText());
//       log.setday(day2.getText());
//       log.settype(type2.getText());
//       log.sethours(hour2.getText());
//       log.setstatus(status2.getText());
//       
//
//       log.editProfile();
//        
//       id2.setText("");
//       cuid2.setText("");
//       day2.setText("");
//       type2.setText("");
//       hour2.setText("");
//       status2.setText("");
         Connection con=null;
        
        try
        {
             con = DbConnection.getMyConnection(); //Add connection
           
            String result=" update attendance set cu_id='"+cuid2.getText()+"',day='"+day2.getText()+"',type='"+type2.getText()+"',hours='"+hour2.getText()+"',status='"+status2.getText()+"' where stu_id='"+id2.getText()+"' ";
            
            PreparedStatement ps=con.prepareStatement(result);
            if(ps.execute()){
             
            }
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
        
         JOptionPane.showMessageDialog(null, "Data update successfully");
                    id2.setText("");
                   cuid2.setText("");
                   day2.setText("");
                   type2.setText("");
                   hour2.setText("");
                   status2.setText("");

        
        
    }//GEN-LAST:event_updateActionPerformed

    //delete
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        
        String stu_id = id2.getText();
        String cu_id =cuid2.getText();
        String day =day2.getText();
        String type =type2.getText();
        String hours =hour2.getText();
        String status = status2.getText();
      
        if( !"".equals(stu_id)){
        
       
       String remove = "DELETE FROM attendance WHERE stu_id = '"+stu_id+"'";
       
       PreparedStatement ps;
       
        try {
            ps = con.prepareStatement(remove);
            if(ps.execute()){
               id2.setText("");
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(tecAttendance.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Deleted");
            
        }
       id2.setText("");
       JOptionPane.showMessageDialog(null, "Deleted");
//        cuid2.setText("");
//        day2.setText("");
//        type2.setText("");
//        hour2.setText("");
//        status2.setText("");
        }else{
        JOptionPane.showMessageDialog(null, "Enter ID");
        }  
    }//GEN-LAST:event_DeleteActionPerformed

    private void status2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status2ActionPerformed

    private void DeleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseMoved
        // TODO add your handling code here:
        deleteCheck.setText("Enter Only Student ID");
    }//GEN-LAST:event_DeleteMouseMoved
  
    private void DeleteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteMouseDragged

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
            java.util.logging.Logger.getLogger(tecAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tecAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tecAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tecAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tecAttendance().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JLabel back;
    private javax.swing.JLabel cuid;
    private javax.swing.JTextField cuid2;
    private javax.swing.JLabel day;
    private javax.swing.JTextField day2;
    private static javax.swing.JLabel deleteCheck;
    private javax.swing.JTextField hour2;
    private javax.swing.JLabel hours;
    private javax.swing.JLabel id1;
    private javax.swing.JTextField id2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel status;
    private javax.swing.JTextField status2;
    private javax.swing.JLabel title;
    private javax.swing.JLabel type;
    private javax.swing.JTextField type2;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
