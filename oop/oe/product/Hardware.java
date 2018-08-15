package javase.oop.oe.product;

import javase.oop.oe.interfaces.Taxable;

public class Hardware extends Product implements Taxable {
    private int warrantyPeriod;

    public Hardware(String description, int productId, String productName, double retailPrice, int warrantyPeriod) {
        super(description, productId, productName, retailPrice);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }


    @Override
    public double getTax(double amount) {
        return amount * Taxable.TAX;
    }

}
