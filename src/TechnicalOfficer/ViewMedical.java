/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalOfficer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Umayanga
 */
public class ViewMedical extends javax.swing.JFrame {

    /**
     * Creates new form ViewMedical
     */
    public ViewMedical() {
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

        panal = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        stid = new javax.swing.JLabel();
        stid2 = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        cuid = new javax.swing.JLabel();
        cuid2 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        serach = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Medical");

        panal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Adobe Caslon Pro", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("See Medical");
        panal.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        stid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        stid.setForeground(new java.awt.Color(255, 255, 255));
        stid.setText("Student ID");
        panal.add(stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));
        panal.add(stid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 180, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/exit.png"))); // NOI18N
        back.setPreferredSize(new java.awt.Dimension(20, 20));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tecMedical(evt);
            }
        });
        panal.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 50));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Stu_id", "Cu_id", "Day", "Type", "Hours"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(4).setResizable(false);
        }

        panal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 580, 140));

        cuid.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cuid.setForeground(new java.awt.Color(255, 255, 255));
        cuid.setText("Course ID");
        panal.add(cuid, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));
        panal.add(cuid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 180, 30));

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        panal.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 150, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TechnicalOfficer/background.jpg"))); // NOI18N
        panal.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));

        serach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serachMouseClicked(evt);
            }
        });
        panal.add(serach, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void serachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serachMouseClicked
        String StuId = stid2.getText();
        String SubId = cuid2.getText();

        if (!StuId.equals("") && !SubId.equals("")) {
            try {
                Connection con = DbConnection.getMyConnection(); //Add connection
                String sql = "select `stu_id` AS 'Stu_id', `cu_id` AS 'Cu_id', `day` AS 'Day',`type` AS 'Type',`hours` AS 'Hours' from medical where stu_id='" + StuId + "' and cu_id='" + SubId + "' ";
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                table.setModel(DbUtils.resultSetToTableModel(rs));
                table.setVisible(true);

            } catch (Exception e) {
                table.setVisible(false);
            }
        } else {
            table.setVisible(false);
            JOptionPane.showMessageDialog(null, "Please Enter Student ID and Subject ID");
        }

    }//GEN-LAST:event_serachMouseClicked

  
    private void tecMedical(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tecMedical
        tecMedical medical = new tecMedical();

        medical.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_tecMedical

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String StuId=stid2.getText();
       // String SubId=cuid2.getText();

        try {
            Connection con = DbConnection.getMyConnection(); //Add connection
            String sql = "select * from medical where stu_id = '" + StuId + "' ";

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //                table.setModel(DbUtils.resultSetToTableModel(rs));

            while (rs.next()) {
                System.out.println(rs.getString("day"));
                // table.setModel(DbUtils.resultSetToTableModel(rs));
                 DefaultTableModel model = (DefaultTableModel) (table.getModel());
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                System.out.println("here");
            }
        } catch (Exception e) {
            //                table.setVisible(false);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(ViewMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMedical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMedical().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cuid;
    private javax.swing.JTextField cuid2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panal;
    private javax.swing.JButton search;
    private javax.swing.JLabel serach;
    private javax.swing.JLabel stid;
    private javax.swing.JTextField stid2;
    public static javax.swing.JTable table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}