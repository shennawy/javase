package javase.oop.oe.order;

import javase.oop.oe.interfaces.Taxable;
import javase.oop.oe.product.Hardware;
import javase.oop.oe.product.Product;

public class OrderItem {
    private int lineNbr;
    private Product product;
    private int quantity = 0;


    public OrderItem(int lineNbr, Product product, int quantity) {
        this.lineNbr = lineNbr;
        this.product = product;
        this.quantity = quantity;
    }


    public void setLineNbr(int lineNbr) {
        this.lineNbr = lineNbr;
    }

    public int getLineNbr() {
        return lineNbr;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTax() {
        Hardware hw = (Hardware) product;
        return hw.getTax(quantity * hw.getRetailPrice());
    }

    public double getItemTotal() {
        double itemTotal = 0.0;
        if (product instanceof Hardware) {
            Hardware hw = (Hardware) product;
            itemTotal = product.getRetailPrice()*quantity + getTax();
           
        } else
            itemTotal = product.getRetailPrice()*quantity;
        return itemTotal;
    }
}
