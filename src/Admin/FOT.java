/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

/**
 *
 * @author user
 */
public class FOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        form_Admin ad= new form_Admin();
        ad.setVisible(false);
        
        forms_Login log= new forms_Login();
        log.setVisible(false);
        
        form_Home home= new form_Home();
        home.setVisible(true);
        
        Admin_Interface inter= new Admin_Interface();
        inter.setVisible(false);
        
        Admin_Notice notice= new Admin_Notice();
        notice.setVisible(false);
       
        
       
        
    }
    
}
