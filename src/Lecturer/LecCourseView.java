/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecturer;

/**
 *
 * @author HP
 */
public class LecCourseView {
    
     private String did;
    private String subid;
    private String name;
    private String Lecid;
     
    public LecCourseView(String did,String subid,String name,String Lecid)
    {
        this.did=did;
        this.subid=subid;
        this.name=name;
        this.Lecid=Lecid;     
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
}
    

