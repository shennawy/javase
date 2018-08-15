package javase.oop.interfaces;

public interface Travel {
    //constant naming convention is UPPER_CASE
    static final double DAY_COST = 50;

    public abstract double getTicketCost();

    public abstract double getPerdiemCost(double noDays);

    public abstract double getAccomodationCost();

}
