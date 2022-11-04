package clases;

public class Driver extends Person {

    private String license;
    private String Name;

    public Driver() {
    }

    public Driver(String nametwo) {
        this.Name = nametwo;
    }

    public Driver(String license, String name, String addres, String phone, String DNI) {
        super(name, addres, phone, DNI);
        this.license = license;

    }

    /**
     * @return the license
     */
    public String getName() {
        return Name;
    }

    public void setName(String nametwo) {
        this.Name = nametwo;
    }

    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return super.toString() + "Driver{" + "license=" + license + '}';
    }

    public String toName() {
        return "Driver{" + "Name=" + Name + '}';
    }

}
