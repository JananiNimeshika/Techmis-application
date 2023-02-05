/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalOfficer;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Umayanga
 */
public class Dean {
    private static String id2=null;
    private String name2=null;
    private String gender2=null;
    private String phnum2=null;
    

     public static void setId(String Id) {
        id2 = Id;
    }
    
    public static String getId() {
        return id2;
    }
    
    
     public void setName(String name2) {
        this.name2 = name2;
    }
     
     public String getName() {
        return name2;
    }

    public void setGender(String gender2) {
        this.gender2 = gender2;
    }
    
    public String getGender() {
        return gender2;
    }

    public void setPno(String phnum2) {
        this.phnum2 = phnum2;
    }
    
    public String getPno() {
        return phnum2;
    }
    
    
    
     public void editProfile()
    {
        Connection con=null;
        
        try
        {
             con = DbConnection.getMyConnection(); //Add connection
           
            String result=" update dean set de_id='"+getId()+"',de_name='"+getName()+"',gender="+getGender()+" ,de_p_no="+getPno()+" where de_id='"+getId()+"' ";
            
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
         
             javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
}
