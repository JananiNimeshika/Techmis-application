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
public class tec_Medical {
    private String stu_id,cu_id,type;
    private String day;
    private String hours;
    
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
    
     
     public void sethours(String hours){
         this.hours=hours;
    }
     
     
     public String gethours(){
        return hours;
        
    }
    
    
    
       public void editProfile()
    {
        Connection con=null;
        
        try
        {
            con = DbConnection.getMyConnection(); //Add connection
           
            String result=" update medical set stu_id='"+getstu_id()+"',cu_id='"+getcu_id()+"',day="+getday()+",type='"+gettype()+"',hours='"+gethours()+"' ";
            
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
