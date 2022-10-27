package SibajitasQuarry;


import SibajitasQuarry.SharedInformation;

public class Person implements SharedInformation {

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
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the addres
     */
    public String getAddres() {
        return addres;
    }

    /**
     * @param addres the addres to set
     */
    public void setAddres(String addres) {
        this.addres = addres;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", addres=" + addres + ", phone=" + 
                phone + ", DNI=" + DNI + '}';
    }
    
    
}
