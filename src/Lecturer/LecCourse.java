/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecturer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class LecCourse {
    private String did = null;
     private String subid = null;
    private String name = null;
    private String Lecid = null;
    
     public void setCourseDepId(String did)
    {
        this.did = did;
    }
     public void setCourseSubId(String subid)
    {
        this.subid = subid;
    }
     public void setCourseName(String name)
     {
         this.name = name;
     }
     public void setCourseLecid(String Lecid)
     {
         this.Lecid = Lecid;
         
     }
      public String getCourseDepId()
    {
        return did;
    }
    
    public String getCourseSubId()
    {
        return subid;
    }
    
    public String getCourseSubName()
    {
        return name;
    }
    
    public String getCourseLecId()
    {
        return Lecid;
    }
    
    public void createCourse()
    {
        Connection con = null;
        
        
        try
        {
       
            
                con=DbConnection.getConnection();
                String result="insert into subjects(sub_dept_id,sub_id,sub_name,lec_id) values('"+getCourseDepId()+"','"+getCourseSubId()+"','"+getCourseSubName()+"','"+getCourseLecId()+"')";
                PreparedStatement ps = con.prepareStatement(result);
                ps.execute();
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");
          
                          
        }
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
}
    
    
    
     public ResultSet searchCourse(String subId) 
    {
        ResultSet rs=null;
        try{
            Connection con=DbConnection.getConnection();
            String sql="SELECT * FROM subjects WHERE sub_id='"+subId+"' LIMIT 1";
            PreparedStatement ps=con.prepareCall(sql);
            rs=ps.executeQuery();
        }
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
        return rs;
    } 


 public void editCourse()
    {
        Connection con=null;
        
        try
        {
            con=DbConnection.getConnection();
            String result="update subjects set sub_dept_id='"+ getCourseDepId()+"',sub_name='"+ getCourseSubName()+"',lec_id='"+ getCourseLecId()+"' where sub_id='"+ getCourseSubId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
          
    
 public void deleteCourse()
    {
        Connection con=null;
        
        try
        {
            con=DbConnection.getConnection();
            String result="delete from subjects where Sub_id='"+getCourseSubId()+"'";
            PreparedStatement ps=con.prepareStatement(result);
            ps.execute();
            javax.swing.JOptionPane.showMessageDialog(null, "Data delete successfully");
        }
        
        catch(Exception e)
        {
            
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
 
  ResultSet seeNotices()
    {
        String sql="select `no` AS 'Notice No',`date` AS 'Date',`title` AS 'Title',`notice` AS 'Notice' from notice";  
            
        ResultSet re=null;
        try{
            Connection con=DbConnection.getConnection();
            PreparedStatement st=con.prepareStatement(sql);
            re=st.executeQuery();
            return re;
        } catch(SQLException ex){
            Logger.getLogger(LecCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return re;
        
       
    }

}

