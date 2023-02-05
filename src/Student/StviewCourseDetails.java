/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class StviewCourseDetails {

    //private  String sub_id=null;

    private String cu_id = null;
    private String cu_name = null;
    private static String sub_id = null;
    private String cu_dept_id = null;

    public void getsub_id(String subid) {
        this.sub_id = subid;
    }

    public void setsub_cu_id(String sub_cu_id) {
        this.sub_id = sub_cu_id;
    }

    public void setcu_id(String cu_id) {
        this.cu_id = cu_id;
    }

    public void setcu_name(String sub_name) {
        this.cu_name = cu_name;
    }

    Connection con = MyConnection.connect();

    ResultSet seeCoursedetails() {
        String sql = "SELECT `sub_id` AS 'subject id', `sub_cu_id` AS 'course id', `sub_name` AS 'Course Name ' FROM `subject`";
        ResultSet re = null;
        try {
            PreparedStatement st = con.prepareStatement(sql);
            re = st.executeQuery();
            return re;
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return re;
    }

}
