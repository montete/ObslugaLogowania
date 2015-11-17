
package obslugalogowania.logowanie;
import obslugalogowania.interfejsy.IDaneLogowania;
import obslugalogowania.interfejsy.ILogowanie;
import obslugalogowania.xklasy.XDaneLogowania;

/**
 *
 * @author Mon
 */
public class Logowanie implements IDaneLogowania, ILogowanie {
    
   private XDaneLogowania Dane;
   private DataValidator DataVal;
    
    public Logowanie(String login, String password){
        
        Dane = new XDaneLogowania(login,password);
        if(!CzyPolaWypelnione(Dane)){
            System.out.println("Login Unsuccesful");
            
        }else{
            System.out.println("Login Succesful");
            DataVal = new DataValidator(Dane);
        
        }
        
    }

    @Override
    public XDaneLogowania przekazDane() {
        XDaneLogowania przenosimy = this.getDane();
        return przenosimy;
    }

    @Override
    public boolean CzyPolaWypelnione(XDaneLogowania Dane) {
        if(Dane.getLogin().isEmpty()) return false;
        if(Dane.getPassword().isEmpty()) return false;
        return true;
    }

    public XDaneLogowania getDane() {
        return Dane;
    }

    /**
     * @param Dane the Dane to set
     */
    public void setDane(XDaneLogowania Dane) {
        this.Dane = Dane;
    }

    /**
     * @return the DataVal
     */
    public DataValidator getDataVal() {
        return DataVal;
    }

    /**
     * @param DataVal the DataVal to set
     */
    public void setDataVal(DataValidator DataVal) {
        this.DataVal = DataVal;
    }
}
