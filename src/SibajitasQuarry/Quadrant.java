package SibajitasQuarry;

import SibajitasQuarry.Request;
import SibajitasQuarry.RequestProduct;
import java.util.Date;

public class Quadrant implements RequestProduct {

    private Request request;

    private Date hourExplosionProgramming;

    public Quadrant() {
    }

    public Quadrant(Request request, Date hourExplosionProgramming) {
        this.request = request;
        this.hourExplosionProgramming = hourExplosionProgramming;
    }

    /**
     * @return the request
     */
    public Request getRequest() {
        return request;
    }

    /**
     * @param request the request to set
     */
    public void setRequest(Request request) {
        this.request = request;
    }

    /**
     * @return the hourExplosionProgramming
     */
    public Date getHourExplosionProgramming() {
        return hourExplosionProgramming;
    }

    /**
     * @param hourExplosionProgramming the hourExplosionProgramming to set
     */
    public void setHourExplosionProgramming(Date hourExplosionProgramming) {
        this.hourExplosionProgramming = hourExplosionProgramming;
    }

    @Override
    public String toString() {
        return "Quadrant{" + "request=" + request + ", hourExplosionProgramming=" + hourExplosionProgramming + '}';
    }

    public void explosionProgrammingMethod() {
    }

    @Override
    public Product getProduct() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProduct(Product product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
