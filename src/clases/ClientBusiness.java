package clases;

public class ClientBusiness implements SharedInformation,  CostumerBusines {

    public ClientBusiness(String CIF) {
        this.CIF = CIF;
    }

    private String CIF;

    /**
     * @return the CIF
     */
    @Override
    public String getCIF() {
        return CIF;
    }

    /**
     * @param CIF the CIF to set
     */
    @Override
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }
    
    
}
