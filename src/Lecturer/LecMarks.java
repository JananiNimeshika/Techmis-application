/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecturer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class LecMarks {
    private String id=null;
     private String sub=null;
     private String q1=null;
     private String q2=null;
     private String q3=null;
     private String q4=null;
     private String a1=null;
     private String a2=null;
     private String a3=null;
     private String mid=null;
     private String theory=null;
     private String practical=null;
     
     
     
     public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

 
    public String getSub() {
        return sub;
    }

    
    public void setSub(String sub) {
        this.sub = sub;
    }

    
    public String getQ1() {
        return q1;
    }

    
    public void setQ1(String q1) {
        this.q1 = q1;
    }

   
    public String getQ2() {
        return q2;
    }

    
    public void setQ2(String q2) {
        this.q2 = q2;
    }

    
    public String getQ3() {
        return q3;
    }

    
    public void setQ3(String q3) {
        this.q3 = q3;
    }

    
    public String getQ4() {
        return q4;
    }

    
    public void setQ4(String q4) {
        this.q4 = q4;
    }

    
    public String getA1() {
        return a1;
    }

   
    public void setA1(String a1) {
        this.a1 = a1;
    }

   
    public String getA2() {
        return a2;
    }

    
    public void setA2(String a2) {
        this.a2 = a2;
    }

    
    public String getA3() {
        return a3;
    }

    
     public void setA3(String a3) {
        this.a3 = a3;
    }

    
    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }
    
    
    public String getTh() {
        return theory;
    }

    
    public void setTh(String theory) {
        this.theory = theory;
    }

        public String getPr() {
        return practical;
    }

   
    public void setPr(String practical) {
        this.practical = practical;
    }

    
    
    public void insert(){
        Connection con = null;
        
        try
        {
                con = DbConnection.getConnection();
                String result = "insert into ict_ca(sub_id,stu_id,q1,q2,q3,q4,ass1,ass2,ass3,mid) values('"+getSub()+"','"+getId()+"','"+getQ1()+"','"+getQ2()+"','"+getQ3()+"','"+getQ4()+"','"+getA1()+"','"+getA2()+"','"+getA3()+"','"+getMid()+"')";
                PreparedStatement ps = con.prepareStatement(result);
                ps.execute();
                
                String result1 = "insert into final_marks(sub_id,stu_id,practical,theory) values('"+getSub()+"','"+getId()+"','"+getTh()+"','"+getPr()+"')";
                PreparedStatement ps1 = con.prepareStatement(result1);
                ps1.execute();
                
                javax.swing.JOptionPane.showMessageDialog(null, "Data added successfully");
                     
        }
        
        catch(Exception e)
        {
                javax.swing.JOptionPane.showMessageDialog(null,e);
        }
    }
    
    
    
    public ResultSet searchMarks(String stuId,String subId) {
        ResultSet rs = null;
        
        try{
            Connection con = DbConnection.getConnection();
            String sql = "SELECT c.`sub_id`, c.`stu_id`, c.`q1`, c.`q2`, c.`q3`, c.`q4`, c.`ass1`, c.`ass2`, c.`ass3`, c.`mid`, f.`practical`, f.`theory` FROM `ict_ca` c,`final_marks` f  WHERE c.`stu_id`='"+stuId+"' and f.`sub_id`='"+subId+"' and c.`sub_id`=f.`sub_id` LIMIT 1";
            PreparedStatement ps = con.prepareCall(sql);

            rs = ps.executeQuery();
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }    
            return rs;
        } 
    
    
    public void updateMarks()
    {
        Connection con = null;
        
        try
        {
            con = DbConnection.getConnection();
            
            String result = "update ict_ca set q1='"+ getQ1()+"',q2='"+ getQ2()+"',q3='"+ getQ3()+"',q4='"+getQ4()+"',ass1='"+ getA3()+"',ass2='"+ getA2()+"',ass3='"+ getA3()+"', mid='"+ getMid()+"' where stu_id='"+ getId()+"' and sub_id='"+ getSub()+"'";
            PreparedStatement ps = con.prepareStatement(result);
            ps.execute();
            
            String result1 = "update final_marks set practical='"+getPr()+"',theory='"+getTh()+"' where stu_id='"+ getId()+"' and sub_id='"+ getSub()+"'";
            PreparedStatement ps1 = con.prepareStatement(result1);
            ps1.execute();
            
            javax.swing.JOptionPane.showMessageDialog(null, "Data update successfully");
            
            
        }
        
        catch(Exception e)
        {
            javax.swing.JOptionPane.showMessageDialog(null, e);
        }
    }
}

       
     

