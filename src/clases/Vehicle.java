package clases;

import java.util.Date;
/*
En esta clase se encuentran los objetos relacionados a los vehiculos y la fecha
de entrada y salida de los mismos, además se encuentra el constructor ToString y
los metodos get y set.
*/
public class Vehicle {

    private Date entryTime;

    private Date entryDate;

    private String tuition;

    private Date departureDate;

    private Date departureTime;

    private double tonsLoaded;

    private Driver driver;

    public Vehicle() {
    }

    public Vehicle(Date entryDate, String tuition, Date departureDate,
            double tonsLoaded, Driver driver, Date entryTime,
            Date departureTime) {
        this.entryDate = entryDate;
        this.tuition = tuition;
        this.departureDate = departureDate;
        this.tonsLoaded = tonsLoaded;
        this.driver = driver;
        this.entryTime = entryTime;
        this.departureTime = departureTime;
    }

    public Vehicle(String tuition, double tonsLoaded, Driver driver) {
        this.tuition = tuition;
        this.tonsLoaded = tonsLoaded;
        this.driver = driver;
    }

    /**
     * @return the entryTime
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime the entryTime to set
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return the entryDate
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate the entryDate to set
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    /**
     * @return the tuition
     */
    public String getTuition() {
        return tuition;
    }

    /**
     * @param tuition the tuition to set
     */
    public void setTuition(String tuition) {
        this.tuition = tuition;
    }

    /**
     * @return the departureDate
     */
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     * @param departureDate the departureDate to set
     */
    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    /**
     * @return the departureTime
     */
    public Date getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the tonsLoaded
     */
    public double getTonsLoaded() {
        return tonsLoaded;
    }

    /**
     * @param tonsLoaded the tonsLoaded to set
     */
    public void setTonsLoaded(double tonsLoaded) {
        this.tonsLoaded = tonsLoaded;
    }

    /**
     * @return the driver
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "entryTime=" + entryTime + ", entryDate="
                + entryDate + ", tuition=" + tuition + ", departureDate="
                + departureDate + ", departureTime=" + departureTime
                + ", tonsLoaded=" + tonsLoaded + ", driver=" + driver + '}';
    }

    public String driverInforma() {
        return "Driver{" + "Driver informartion=" + driver + '}';
    }

}
