
package obslugalogowania.logowanie;

import obslugalogowania.xklasy.XDaneLogowania;


public class DataValidator {
    
    
    private XDaneLogowania DaneDoWalidacji;
    private boolean validated;
    
    public DataValidator(XDaneLogowania dane){
        this.validated = true;
                    
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
