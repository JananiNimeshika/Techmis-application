/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MyConnection {

    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, e);
            System.err.println(e);
        }
        return con;
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
