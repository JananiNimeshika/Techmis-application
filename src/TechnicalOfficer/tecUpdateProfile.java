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

/**
 *
 * @author Umayanga
 */
public class tecUpdateProfile extends javax.swing.JFrame {
    
    String filename=null;
    /**
     * Creates new form LectureUpdate
     */
    public tecUpdateProfile() {
        LogTO_1 logTO_1 = new LogTO_1();
        System.out.println("up class"+logTO_1.getId2());
       
        
        
        initComponents();
        showdata();
    }
  public static void showdata(){
     
    LogTO_1 tec = new  LogTO_1();
    String id = tec.getId2(); 
    Connection con=null;
     try
        {
            
                con = DbConnection.getMyConnection(); //Add connection
                String result = "SELECT * FROM tecnical_officer where tec_id = '3'";
                PreparedStatement ps = con.prepareStatement(result);
                ResultSet rs = ps.executeQuery();
               if(rs.next())
                {
                   System.out.println("hey"+rs.getString("tec_name"));
                    id2.setText(rs.getString("tec_id"));
                    depid2.setText(rs.getString("tec_dept_id"));
                    name2.setText(rs.getString("tec_name"));
                    gender2.setText(rs.getString("gender"));
                    phnum2.setText(rs.getString("tec_p_no"));
                   
                        
                }     
     
        }
        
   
        catch(Exception e)
        {
                System.out.println(e.getMessage());
        }
     
//        id2.setText("");
//        depid2.setText("");
//        name2.setText("");
//        gender2.setText("");
//        phnum2.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        phnum = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        depid = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        depid2 = new javax.swing.JTextField();
        phnum2 = new javax.swing.JTextField();
        name2 = new javax.swing.JTextField();
        id2 = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        back = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        gender2 = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Technical Officer");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 540, 80));

        title.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Update Profile");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        phnum.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        phnum.setForeground(new java.awt.Color(255, 255, 255));
        phnum.setText("Phone Number");
        jPanel1.add(phnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, -1, -1));

        name.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        depid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        depid.setForeground(new java.awt.Color(255, 255, 255));
        depid.setText("Department ID");
        jPanel1.add(depid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        id1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 255, 255));
        id1.setText("ID");
        jPanel1.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        depid2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depid2ActionPerformed(evt);
            }
        });
        jPanel1.add(depid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 260, 30));
        jPanel1.add(phnum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 260, 30));
        jPanel1.add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 260, 30));
        jPanel1.add(id2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 260, 30));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 100, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/exit.png"))); // NOI18N
        back.setPreferredSize(new java.awt.Dimension(20, 20));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backtecWelcome(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 50));

        gender.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setText("Gender");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));
        jPanel1.add(gender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 260, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/background.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.setVisible(false);
        
    }//GEN-LAST:event_backtecWelcome

   
    //update profile
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
       
     

         Connection con=null;
        
        try
        {
             con = DbConnection.getMyConnection(); //Add connection
           
            String result=" update tecnical_officer set tec_name='"+name2.getText()+"',tec_dept_id='"+depid2.getText()+"',tec_p_no="+phnum2.getText()+",gender='"+gender2.getText()+"' where tec_id='"+id2.getText()+"' ";
            System.out.println(result);
            PreparedStatement ps=con.prepareStatement(result);
            if(!ps.execute()){
            
             javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            }else{
                System.out.println("No");
            }
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
        
        
         
    }//GEN-LAST:event_updateActionPerformed

    private void depid2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depid2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depid2ActionPerformed

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
            java.util.logging.Logger.getLogger(tecUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tecUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tecUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tecUpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tecUpdateProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel depid;
    public static javax.swing.JTextField depid2;
    private javax.swing.JLabel gender;
    public static javax.swing.JTextField gender2;
    private javax.swing.JLabel id1;
    public static javax.swing.JTextField id2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    public static javax.swing.JTextField name2;
    private javax.swing.JLabel phnum;
    public static javax.swing.JTextField phnum2;
    private javax.swing.JLabel title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
