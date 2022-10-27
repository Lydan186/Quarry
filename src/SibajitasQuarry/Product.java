package SibajitasQuarry;

public class Product {

    private String idProduct;

    private String productName;

    private String productMaterial;

    public Product() {
    }

    public Product(String idProduct, String productName, String productMaterial) {
        this.idProduct = idProduct;
        this.productName = productName;
        this.productMaterial = productMaterial;
    }

    /**
     * @return the idProduct
     */
    public String getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the productMaterial
     */
    public String getProductMaterial() {
        return productMaterial;
    }

    /**
     * @param productMaterial the productMaterial to set
     */
    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", productName=" + productName + ", productMaterial=" + productMaterial + '}';
    }
    
    
}