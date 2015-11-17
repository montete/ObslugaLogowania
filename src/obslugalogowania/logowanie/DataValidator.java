
package obslugalogowania.logowanie;

import obslugalogowania.xklasy.XDaneLogowania;


public class DataValidator {
    
    
    private XDaneLogowania DaneDoWalidacji;
    private boolean validated;
    private String[] notAllowed = {"!","@","#","$","%","^","&","*","(",")"};
    public DataValidator(XDaneLogowania dane){
        for(String v : notAllowed){
            if(dane.getLogin().contains(v)) {this.validated = false; break; }
            else if(dane.getPassword().contains(v)) {this.validated = false; break;}
            else this.validated = true;
        }

                    
    }
    public DataValidator(){

        this.validated = false;
    }

    public XDaneLogowania getDaneDoWalidacji() {
        return DaneDoWalidacji;
    }

    public void setDaneDoWalidacji(XDaneLogowania DaneDoWalidacji) {
        this.DaneDoWalidacji = DaneDoWalidacji;
    }

    /**
     * @return the validated
     */
    public boolean isValidated() {
        return validated;
    }
    
}
