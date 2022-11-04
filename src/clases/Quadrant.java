package clases;

import java.util.Date;

/**
 * En esta clase se localizan los cuadrantes que se deben de explotar para 
 * las solicitudes, se encuentra el ToString y los metodos get y set.
 * @author dilan
 */
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
        return "Quadrant{" + "request=" + request
                + ", hourExplosionProgramming=" + hourExplosionProgramming + '}';
    }

    public void explosionProgrammingMethod() {
    }
}
