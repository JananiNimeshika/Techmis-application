/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecturer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
class DbConnection {
    
    public static Connection getConnection()
    {
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","");
        }catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,e);
            System.err.println(e);
        }    
        return con;
    }
    public static void main(String args[])
            
    {
        getConnection();
    }

    
}
