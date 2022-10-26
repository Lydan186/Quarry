public class Driver extends Person {

    private String license;

    public Driver() {
    }

    public Driver(String license) {
        this.license = license;
    }

    public Driver(String license, String name, String addres, String phone, String DNI) {
        super(name, addres, phone, DNI);
        this.license = license;
    }

    /**
     * @return the license
     */
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
        return "Driver{" + "license=" + license + '}';
    }
    
    
}
