package javase.oop.oe.interfaces;

public interface Taxable {

    public static final double TAX = 0.1;

    public abstract double getTax(double amount);
}
