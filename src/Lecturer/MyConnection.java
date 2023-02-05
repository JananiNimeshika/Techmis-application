/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecturer;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author HP
 */
public class MyConnection {
   
public static Connection getConnection()
    {
       Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");
            
            
        } catch (Exception ex) {
            //Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            javax.swing.JOptionPane.showMessageDialog(null,"phpMyadmin not connected.");
        }
        return con;
    } 
    
    public static void main(String args[])
    {
        getConnection();
    }
}


