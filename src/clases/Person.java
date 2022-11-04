package clases;

/*
En esta clase se encuentran los objetos que se encuentran en una persona, esta 
clase implementa a SharedInformation, personInterface y a NewInterface, en esta
misma se encuentra el constructor ToString y los metodos get y set 
correspondientes.
 */
public class Person implements SharedInformation, NewInterface,
        personInterface {

    private String name;

    private String addres;

    private String phone;

    private String DNI;

    public Person() {
    }

    public Person(String name, String addres, String phone, String DNI) {
        this.name = name;
        this.addres = addres;
        this.phone = phone;
        this.DNI = DNI;
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the addres
     */
    @Override
    public String getAddres() {
        return addres;
    }

    /**
     * @param addres the addres to set
     */
    @Override
    public void setAddres(String addres) {
        this.addres = addres;
    }

    /**
     * @return the phone
     */
    @Override
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the DNI
     */
    @Override
    public String getDNI() {
        return DNI;

    }

    /**
     * @param DNI the DNI to set
     */
    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "" + "Nombre=" + name + ", Direccion=" + addres + ", Telefono="
                + phone + ", DNI=" + DNI + ',';
    }

    {

    }

}
