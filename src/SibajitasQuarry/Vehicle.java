package SibajitasQuarry;


import java.util.Date;

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

    public Vehicle(Date entryTime, Date entryDate, String tuition, Date departureDate, Date departureTime, double tonsLoaded, Driver driver) {
        this.entryTime = entryTime;
        this.entryDate = entryDate;
        this.tuition = tuition;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
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
        return "Vehicle{" + "entryTime=" + entryTime + ", entryDate=" + entryDate + ", tuition=" + tuition + ", departureDate=" + departureDate + ", departureTime=" + departureTime + ", tonsLoaded=" + tonsLoaded + ", driver=" + driver + '}';
    }
    
    
}