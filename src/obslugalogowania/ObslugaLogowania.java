/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package obslugalogowania;

import obslugalogowania.interfejsy.IDaneLogowania;
import obslugalogowania.logowanie.Logowanie;
import obslugalogowania.xklasy.XDaneLogowania;


public class ObslugaLogowania {


    public static void main(String[] args) {
    
        String login = "Zenon";
        String passwd ="asd123";

        Logowanie zaloguj = new Logowanie(login,passwd);
       // XDaneLogowania przeniesione = IDaneLogowania.przekazDane();
        
       
        
    }
    
}
