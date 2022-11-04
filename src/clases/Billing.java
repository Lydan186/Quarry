package clases;

import java.util.Date;

/**
 * En la clase billing se encuentran los datos necesarios para poder lograr 
 * hacer una factura, necesita datos de la  solicitud para la factura, en está 
 * se encuentra el constructor ToString y los metodos get y set.
 * @author dilan
 */
public class Billing {

    private Date billingDate;

    private String billNumber;

    private Request request;

    public Billing() {
    }

    public Billing(Date billingDate, String billNumber, Request request) {
        this.billingDate = billingDate;
        this.billNumber = billNumber;
        this.request = request;
    }

    /**
     * @return the billingDate
     */
    public Date getBillingDate() {
        return billingDate;
    }

    /**
     * @param billingDate the billingDate to set
     */
    public void setBillingDate(Date billingDate) {
        this.billingDate = billingDate;
    }

    /**
     * @return the billNumber
     */
    public String getBillNumber() {
        return billNumber;
    }

    /**
     * @param billNumber the billNumber to set
     */
    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
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

    @Override
    public String toString() {
        return "Billing{" + "billingDate=" + billingDate + ", billNumber="
                + billNumber + ", request=" + request + '}';
    }

    public void invoice() {
    }
}
