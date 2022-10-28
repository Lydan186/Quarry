package SibajitasQuarry;

import SibajitasQuarry.CostumerPerson;
import SibajitasQuarry.Person;

public class ClientPerson extends Person implements CostumerPerson {

    private String idCostumer;

    public ClientPerson() {
    }

    public ClientPerson(String idCostumer) {
        this.idCostumer = idCostumer;
    }

    public ClientPerson(String idCostumer, String name, String addres, String phone, String DNI) {
        super(name, addres, phone, DNI);
        this.idCostumer = idCostumer;
    }

    /**
     * @return the idCostumer
     */
    public String getIdCostumer() {
        return idCostumer;
    }

    /**
     * @param idCostumer the idCostumer to set
     */
    public void setIdCostumer(String idCostumer) {
        this.idCostumer = idCostumer;
    }

    @Override
    public String toString() {
        return super.toString() + "ClientPerson{" + "idCostumer=" + idCostumer + '}';
    }

    @Override
    public String getIdCustomer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setIdCustomer(String idCustomer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
