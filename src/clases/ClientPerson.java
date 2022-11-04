package clases;

/*
Esta clase de persona cliente se encuentran los atributos que diferencian a una
persona de un cliente, lo que es el Id de cliente, además de heredar objetos de
la clase Person, en esta clase se encuentra sl ToString y los metodos get y set.
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
