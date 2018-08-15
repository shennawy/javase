package javase.oop.oe.product;

public abstract class Product {
    private String description;
    private int productId;
    private String productName;
    private double retailPrice;


    public Product(){
        
    }
    
    public Product(String description, int productId, String productName, double retailPrice) {
        this.description = description;
        this.productId = productId;
        this.productName = productName;
        this.retailPrice = retailPrice;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }
}
