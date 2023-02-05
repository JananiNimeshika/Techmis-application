/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalOfficer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Umayanga
 */
public class DbConnection {
    private static void registerMyConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error in registering the diver");
        }
    }
    
    public static Connection getMyConnection(){
        registerMyConnection();
        Connection myConnection = null;
        String url = "jdbc:mysql://localhost:3306/java";
        String user = "root"; 
        String pw = ""; 
        
        try {
            myConnection = DriverManager.getConnection(url, user, pw);
        } catch (SQLException ex) {
            System.out.println("Error in getting connection");
        }
        return myConnection;
    }
}
