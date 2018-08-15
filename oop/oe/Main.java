package javase.oop.oe;

import java.util.Date;

import javase.oop.oe.customer.Company;
import javase.oop.oe.customer.Individual;
import javase.oop.oe.order.Order;
import javase.oop.oe.product.Hardware;
import javase.oop.oe.product.Manual;
import javase.oop.oe.product.Software;

public class Main {

    public static void main(String[] args) {
        Company comp = new Company("Sheraton", 1, "CIB", "010", "Muhammad", 10);
        Individual individual = new Individual("Heliopolis", 102, "Karim", "012", "1");

        Software sw1 = new Software("Windows", 0, "Windows 10", 10.5, "Meh");
        Hardware hw1 = new Hardware("CPU", 5, "Intel", 550.0, 1);
        Hardware hw2 = new Hardware("GPU", 7, "AMD", 600.0, 1);
        Manual m1 = new Manual("How to", 6, "Cook", 12.0, "Medhat");

        Date d1 = new Date();
        Order o1 = new Order(0, d1);

        o1.setCustomer(comp);

        o1.addOrderItems(hw1);
        o1.addOrderItems(hw1);
        o1.addOrderItems(hw1);
        o1.addOrderItems(hw2);
        o1.addOrderItems(sw1);
        o1.addOrderItems(m1);
        o1.addOrderItems(m1);

        System.out.println("Total = " + o1.getOrderTotal());
        o1.getOrderDetails();

    }

}
