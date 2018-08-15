package javase.oop.oe.product;

public class Software extends Product {

    private String license;

    public Software(String description, int productId, String productName, double retailPrice, String license) {
        super(description, productId, productName, retailPrice);
        this.license = license;
    }


    public String getLicense() {
        return license;
    }
}
