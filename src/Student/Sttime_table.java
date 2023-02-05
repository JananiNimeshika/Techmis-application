/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author shan
 */
public class Sttime_table {
    private String time;
    private String mon;
    private String tue;
    private String wed;
    private String thu;
    private String fri;
    
    public Sttime_table(String time,String mon,String tue,String wed,String thu,String fri)
    {
        this.time=time;
        this.mon=mon;
        this.tue=tue;
        this.wed=wed;
        this.thu=thu;
        this.fri=fri;
    }
    
    public String gettime(){
        return time;
    }
    
    public String getmon(){
        return mon;
    }
    
    public String gettue(){
        return tue;
    }
    
    public String getwed(){
        return wed;
    }
    
    public String getthu(){
        return thu;
    }
    
    public String getfri(){
        return fri;
    }
}
