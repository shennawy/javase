package javase.oop.inherit;

import javase.oop.interfaces.Travel;

public class Consultant extends Person implements Travel {
    @Override
    public double getAnnualNetSalary() {
        // TODO Implement this method
        return 0.0;
    }

    @Override
    public double getTicketCost() {
        // TODO Implement this method
        return 0.0;
    }

    @Override
    public double getPerdiemCost(double noDays) {
        return noDays * Travel.DAY_COST;
    }

    @Override
    public double getAccomodationCost() {
        // TODO Implement this method
        return 0.0;
    }
}
