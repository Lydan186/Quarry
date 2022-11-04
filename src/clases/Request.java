package clases;

import java.util.Date;

/*
En esta clase se encuentran los objetos para las solicitudes y todo lo que deben
de llevar, se encuentra el constructor ToString y los metodos get y set.
 */
public class Request implements RequestProduct {

    private Product product;
    private Applicant applicant;
    private Date date;
    private String numRequest;

    private String state;
    private Vehicle vehicle;

    public Request() {
    }

    public Request(String state) {
        this.state = state;
    }

    public Request(Product product, Applicant applicant, Date date,
            String state, Vehicle vehicle, String numRequest) {
        this.product = product;
        this.applicant = applicant;
        this.date = date;
        this.state = state;
        this.vehicle = vehicle;
        this.numRequest = numRequest;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public void setNumRequest(String string) {
        this.numRequest = numRequest;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    public String getNumRequest() {
        return numRequest;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param date the date to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.date = date;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    /**
     * @param date the date to set
     */
    public void setApplicant(Applicant aplicant) {
        this.applicant = applicant;
    }

    public Request(Product product, Applicant applicant, Date date,
            String numRequest, String state, Vehicle vehicle) {
        this.product = product;
        this.applicant = applicant;
        this.date = date;
        this.numRequest = numRequest;
        this.state = state;
        this.vehicle = vehicle;
    }

    public String toDisable() {
        return "Request{" + ", date=" + date + ", state=" + state + '}';
    }

    @Override
    public String toString() {
        return "Request{" + "product=" + product + ", applicant="
                + applicant + ", date=" + date + ", numRequest="
                + numRequest + ", state=" + state + ", vehicle="
                + vehicle + '}';
    }

}
