/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package obslugalogowania.xklasy;

/**
 *
 * @author Mon
 */
public class XDaneLogowania {
    
   private String Login;
   private String Password;

   public XDaneLogowania(String log, String passwd){
       this.Login = log;
       this.Password = passwd;
   }
   
    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    
    
    
}
