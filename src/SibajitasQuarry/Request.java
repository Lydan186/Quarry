package SibajitasQuarry;


import SibajitasQuarry.RequestProduct;
import java.util.Date;

public class Request implements RequestProduct {

    private Product product;

    private Date date;

    private int state;

    public Request() {
    }

    public Request(Product product, Date date, int state) {
        this.product = product;
        this.date = date;
        this.state = state;
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

    /**
     * @return the state
     */
    public int getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Request{" + "product=" + product + ", date=" + date + ", state=" + state + '}';
    }
    
    

    public void requested() {
    }

    public void applyFor() {
    }
}
