package clases;

/**
 * En esta clase se encuentra la información sobre el cliente empresa, con el 
 * CIF,que la misma es la cedula juridica, en esta se encuentra el ToString y 
 * los metodos get y set.
 * @author dilan
 */
public class ClientBusiness implements SharedInformation, CostumerBusines {

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
