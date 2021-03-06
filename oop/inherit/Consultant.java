package javase.oop.inherit;

import javase.oop.interfaces.Travel;

public class Consultant extends Person implements Travel {

    public Consultant(int personId, String personName, double personGrossSalary) {
        super(personId, personName, personGrossSalary);
    }

    @Override
    public double getTicketCost() {
        // TODO Implement this method
        return 0.0;
    }

    @Override
    public double getPerdiemCost(double noDays) {
        return noDays * Travel.DAY_COST + 0.25 * getPersonGrossSalary();
    }

    @Override
    public double getAccomodationCost() {
        // TODO Implement this method
        return 0.0;
    }

    public double getMonthlyNetSalary() {
        double tax = 10.0;
        return getPersonGrossSalary() - getPersonGrossSalary() * (tax / 100);
    }


    @Override
    public double getAnnualNetSalary() {
        return getMonthlyNetSalary() * 12;
    }
}
