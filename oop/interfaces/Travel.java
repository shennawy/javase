package javase.oop.interfaces;

import javase.oop.inherit.Consultant;
import javase.oop.inherit.Person;
import javase.oop.inherit.ProjectManager;

public interface Travel {
    //constant naming convention is UPPER_CASE
    static final double DAY_COST = 50;

    public abstract double getTicketCost();

    public abstract double getPerdiemCost(double noDays);

    public abstract double getAccomodationCost();

    // Default Method Example
    public default void showReport(Person p, int noDays) {
        System.out.println("Person Name: " + p.getPersonName());
        System.out.println("Ticket Cost: " + getTicketCost());
        System.out.println("PerdiemCost: " + getPerdiemCost(noDays));
        System.out.println("Accomodations cost: " + getAccomodationCost());

        if (p instanceof Consultant) {
            System.out.println("Monthly Net: " + ((Consultant) p).getMonthlyNetSalary());
        }

        if (p instanceof ProjectManager) {
            System.out.println("Monthly Net: " + ((ProjectManager) p).getMonthlyNetSalary());
        }
    }
}
