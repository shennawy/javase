package javase.oop.interfaces;

import javase.oop.inherit.Person;

public interface MaxRateInterface {
    static final double MAX_RATE = 70_000;

    public abstract boolean checkRate(Person p);
}
