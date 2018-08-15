package javase.oop.oe.product;

public class Manual extends Product {
    private String publisher;


    public Manual(String description, int productId, String productName, double retailPrice, String publisher) {
        super(description, productId, productName, retailPrice);
        this.publisher = publisher;
    }


    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
}
