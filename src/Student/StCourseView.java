/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author admin
 */
public class StCourseView {
    private String depId;
    private String subId;
    private String subName;
    private String lecId;
     
    public StCourseView(String depId,String subId,String subName,String lecId)
    {
        this.depId=depId;
        this.subId=subId;
        this.subName=subName;
        this.lecId=lecId;     
    }
    
    public String getCourseDepId()
    {
        return depId;
    }
    
    public String getCourseSubId()
    {
        return subId;
    }
    
    public String getCourseSubName()
    {
        return subName;
    }
    
    public String getCourseLecId()
    {
        return lecId;
    }
}
