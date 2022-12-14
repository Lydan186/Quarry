package clases;

/**
 * En esta clase se encuentra la información sobre el cliente empresa,
 * con el CIF, que la misma es la cedula juridica, en esta se encuentra 
 * el ToString y los metodos get y set.
 * @author dilan
 */
public class ClientPerson extends Person implements CostumerPerson {

    private String idCostumer;

    public ClientPerson() {
    }

    public ClientPerson(String idCostumer) {
        this.idCostumer = idCostumer;
    }

    public ClientPerson(String idCostumer, String name, String addres,
            String phone, String DNI) {
        super(name, addres, phone, DNI);
        this.idCostumer = idCostumer;
    }

    /**
     * @return the idCostumer
     */
    @Override
    public String getIdCostumer() {
        return idCostumer;
    }

    /**
     * @param idCostumer the idCostumer to set
     */
    @Override
    public void setIdCostumer(String idCostumer) {
        this.idCostumer = idCostumer;
    }

    @Override
    public String toString() {
        return super.toString() + "ClientPerson{" + "idCostumer="
                + idCostumer + '}';
    }

}
