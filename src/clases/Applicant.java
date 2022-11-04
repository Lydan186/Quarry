package clases;

/**
 * En esta clase se encuentra los datos que han sido implementados desde las
 * clases CostumerPerson, CostumerBusiness y PersonInterface, para asi poder
 * añadir a los cliente, en esta se encuentra el contructor ToString y 
 * los metodos get y set.
 * @author dilan
 */
public class Applicant implements CostumerPerson, CostumerBusines,
        personInterface {

    private String Name;
    private String idCostumer;
    private String CIF;
    private String Phone;
    private String Addres;
    private String x = null;

// PERSONAS
    public Applicant() {
    }

    public Applicant(String Name, String idCostumer, String Phone,
            String Addres) {
        this.Name = Name;
        this.idCostumer = idCostumer;
        this.Phone = Phone;
        this.Addres = Addres;
    }

    public String toStrinP() {
        return "" + "Nombre=" + Name + ", Identificacion=" + idCostumer
                + ", Telefono=" + Phone + ", Direccion=" + Addres + ',';
    }

    public String toStrinB() {
        return "" + "Nombre=" + Name + ", CIF=" + CIF + ", Telefono="
                + Phone + ", Direccion=" + Addres + ',';
    }

    public Applicant(String Name, String CIF, String Phone, String Addres,
            String x) {
        this.Name = Name;

        this.CIF = CIF;
        this.Phone = Phone;
        this.Addres = Addres;

    }

    public Applicant(String Name, String CIF, String idCostumer, String Phone,
            String Addres, String x) {
        this.Name = Name;

        this.CIF = CIF;
        this.Phone = Phone;
        this.Addres = Addres;
        this.idCostumer = idCostumer;

    }

    //EmpresAS
    public Applicant(String cif, String var) {
        this.CIF = cif;
    }

    @Override
    public String getIdCostumer() {
        return this.idCostumer;
    }

    @Override
    public String getCIF() {
        return this.CIF;
    }

    @Override
    public String getAddres() {
        return this.Addres;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getPhone() {
        return this.Phone;
    }

    @Override
    public void setAddres(String addres) {
        this.Addres = addres;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setPhone(String phone) {
        this.Phone = phone;
    }

    @Override
    public void setIdCostumer(String idCostumer) {
        this.idCostumer = idCostumer;
    }

    @Override
    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    @Override
    public String toString() {
        return "Applicant{" + "Name=" + Name + ", idCostumer=" + idCostumer
                + ", CIF=" + CIF + ", Phone=" + Phone + ", Addres=" + Addres
                + ", x=" + x + '}';
    }

}
