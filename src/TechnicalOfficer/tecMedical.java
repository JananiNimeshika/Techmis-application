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

/**
 *
 * @author Umayanga
 */
public class tecMedical extends javax.swing.JFrame {

    Connection Conn = DbConnection.getMyConnection(); //Add connection
    
     public tecMedical() {
        initComponents();
        showdata();
    }
   void showdata(){
          tec_Medical tec = new  tec_Medical();
    
    Connection con=null;
     try
        {
                con = DbConnection.getMyConnection(); //Add connection
                String result = "SELECT * FROM medical where stu_id = '"+tec.getstu_id()+"'";
                PreparedStatement ps = con.prepareStatement(result);
                ResultSet rs = ps.executeQuery();
     if(rs.next())
                {
                    id2.setText(rs.getString("stu_id"));
                    cuid2.setText(rs.getString("cu_id"));
                    day2.setText(rs.getString("day"));
                    type2.setText(rs.getString("type"));
                    hour2.setText(rs.getString("hours"));
                    
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
        title = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        type2 = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        update = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        id2 = new javax.swing.JTextField();
        cuid = new javax.swing.JLabel();
        cuid2 = new javax.swing.JTextField();
        hour2 = new javax.swing.JTextField();
        day2 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Technical Officer");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Medical");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        day.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        day.setForeground(new java.awt.Color(255, 255, 255));
        day.setText("Day");
        jPanel1.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        type.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        type.setForeground(new java.awt.Color(255, 255, 255));
        type.setText("Type");
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        hours.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        hours.setForeground(new java.awt.Color(255, 255, 255));
        hours.setText("Hours");
        jPanel1.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        id.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(255, 255, 255));
        id.setText("ID");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 20, -1));
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 270, 30));

        view.setText("View");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel1.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 90, 40));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 90, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/exit.png"))); // NOI18N
        back.setPreferredSize(new java.awt.Dimension(20, 20));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tecWelcome(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 50));

        delete1.setText("Delete");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel1.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 90, 40));
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 270, 30));

        cuid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cuid.setForeground(new java.awt.Color(255, 255, 255));
        cuid.setText("Course ID");
        jPanel1.add(cuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));
        jPanel1.add(cuid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 270, 30));
        jPanel1.add(hour2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 270, 30));
        jPanel1.add(day2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 270, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 840, 450));

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

     
        
    
    
       
    private void tecWelcome(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tecWelcome
        tecWelcome welcome = new tecWelcome();
        
        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tecWelcome

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        ViewMedical medical = new ViewMedical();
        
        medical.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_viewActionPerformed

    //update
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
//       tec_Medical log = new tec_Medical();
//       
//       log.setstu_id(id2.getText());
//       log.setcu_id(cuid2.getText());
//       log.setday(day2.getText());
//       log.settype(type2.getText());
//       log.sethours(hour2.getText());
//      
//       
//
//       log.editProfile();
//       
//       id2.setText("");
//       cuid2.setText("");
//       day2.setText("");
//       type2.setText("");
//       hour2.setText("");
       
Connection con=null;
        
        try
        {
             con = DbConnection.getMyConnection(); //Add connection
           
            String result=" update medical set cu_id='"+cuid2.getText()+"',day='"+day2.getText()+"',type='"+type2.getText()+"',hours='"+hour2.getText()+"' where stu_id='"+id2.getText()+"' ";
            
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
                  
       
    }//GEN-LAST:event_updateActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        String stu_id = id2.getText();
        String cu_id =cuid2.getText();
        String day =day2.getText();
        String type =type2.getText();
        String hours =hour2.getText();
       
      if( !"".equals(stu_id)){
       String remove = "DELETE FROM medical WHERE stu_id = '"+stu_id+"'";
       
       PreparedStatement ps;
       
        try {
            ps = Conn.prepareStatement(remove);
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(tecMedical.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Deleted");
            
        }
         id2.setText("");
       JOptionPane.showMessageDialog(null, "Deleted");
//        id2.setText("");
//        cuid2.setText("");
//        day2.setText("");
//        type2.setText("");
//        hour2.setText("");
      }else{
      JOptionPane.showMessageDialog(null, "Enter ID");
      }
    }//GEN-LAST:event_delete1ActionPerformed

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
            java.util.logging.Logger.getLogger(tecMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tecMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tecMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tecMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tecMedical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cuid;
    private javax.swing.JTextField cuid2;
    private javax.swing.JLabel day;
    private javax.swing.JTextField day2;
    private javax.swing.JButton delete1;
    private javax.swing.JTextField hour2;
    private javax.swing.JLabel hours;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel title;
    private javax.swing.JLabel type;
    private javax.swing.JTextField type2;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
