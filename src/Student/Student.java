/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Student.DbConnect;
import Lecturer.LecCourse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Student {

    private static String stu_id = null;
    private String stu_dep_id = null;
    private String menter_id = null;
    private String stu_name = null;
    private String stu_address = null;
    private String gender = null;
    private String stu_b_day = null;
    private String stu_p_no = null;

    public void getstu_id(String stid) {
        this.stu_id = stid;
    }

    public void setstu_id(String stid) {
        this.stu_id = stid;
    }
    //db connection
    Connection con = MyConnection.connect();

    public void setstu_dep_id(String depid) {
        this.stu_dep_id = depid;
    }

    public void setmenter_id(String menid) {
        this.menter_id = menid;
    }

    public void setstu_name(String sname) {
        this.stu_name = sname;

    }

    public void setstu_address(String saddres) {
        this.stu_address = saddres;

    }

    public void setgender(String gen) {
        this.gender = gen;

    }

    public void setstu_b_day(String bdy) {
        this.stu_b_day = bdy;

    }

    public void setstu_p_no(String tp) {
        this.stu_p_no = tp;

    }

    public String getstu_dep_id() {
        return stu_dep_id;
    }

    public String getmenter_id() {
        return menter_id;
    }

    public String getstu_name() {
        return stu_name;
    }

    public String getstu_address() {
        return stu_address;
    }

    public String getgender() {
        return gender;
    }

    public String getstu_b_day() {
        return stu_b_day;
    }

    public String getstu_p_no() {
        return stu_p_no;
    }

    public void updateStudent() {
        if (getstu_p_no().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "You have to fill all the fields");
        } else {
            try {
                con = MyConnection.connect();
                String sql = "update student set stu_dept_id='" + stu_dep_id + "',menter_id='" + menter_id + "',stu_name='" + stu_name + "',gender='" + gender + "',stu_b_day='" + stu_b_day + "',stu_p_no='" + stu_p_no + "' where stu_id='" + stu_id + "'";
                PreparedStatement ps = con.prepareStatement(sql);
                int i = ps.executeUpdate();

                if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Data update successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "Data update Error");

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    String getstu_id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getRegno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    ResultSet seeNotices()
    {
        String sql="select `no` AS 'Notice No',`date` AS 'Date',`title` AS 'Title',`notice` AS 'Notice' from notice";  
            
        ResultSet re=null;
        try{
            Connection con=DbConnect.connect();
            PreparedStatement st=con.prepareStatement(sql);
            re=st.executeQuery();
            return re;
        } catch(SQLException ex){
            Logger.getLogger(LecCourse.class.getName()).log(Level.SEVERE, null, ex);
        }
        return re;
        
       
    }

}
