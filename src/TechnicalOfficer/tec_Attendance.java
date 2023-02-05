/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechnicalOfficer;

import java.awt.HeadlessException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Umayanga
 */
public class tec_Attendance {
    private String stu_id;
     private String cu_id;
    private String type;
    private String day;
    private String hour;
    private String status;
    
   
     
    public void setstu_id(String stu_id){
         this.stu_id=stu_id;
    }
    
    public String getstu_id(){
        return stu_id;
    }
    
    
    public void setcu_id(String cu_id){
         this.cu_id=cu_id;
    }
    
    public String getcu_id(){
        return cu_id;
    }
    
    public void setday(String day){
         this.day=day;
    }
    
    public String getday(){
        return day;
    }
    
    public void settype(String type){
         this.type=type;
    }
    
     public String gettype(){
        return type;
    }
    
     
     public void sethours(String hour){
         this.hour=hour;
    }
     
     
     public String gethours(){
        return hour;
        
    }
    
     
    public void setstatus(String status){
         this.status=status;
    }
     
    public String getstatus(){
        return status;
        
    }
    
       public void editProfile()
    {
        Connection con=null;
        
        try
        {
             con = DbConnection.getMyConnection(); //Add connection
           
            String result=" update attendance set stu_id='"+getstu_id()+"',cu_id='"+getcu_id()+"',day="+getday()+",type='"+gettype()+"',hours='"+gethours()+"',status='"+getstatus()+"' where stu_id='"+getstu_id()+"'  ";
            
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
         
             javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(SQLException | HeadlessException e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
}
