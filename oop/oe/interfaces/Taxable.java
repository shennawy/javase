package javase.oop.oe.interfaces;

import javase.oop.oe.params.ParamHandler;

public interface Taxable {

    public static final double TAX = ParamHandler.getParamByName("TAX_VALUE").getParamValue();

    public abstract double getTax(double amount);
}
