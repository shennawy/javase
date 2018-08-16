package javase.oop.oe;

import java.util.Date;

import javase.oop.oe.customer.Company;
import javase.oop.oe.customer.CustomerHandler;
import javase.oop.oe.customer.Individual;
import javase.oop.oe.order.Order;
import javase.oop.oe.order.OrderHandler;
import javase.oop.oe.product.Hardware;
import javase.oop.oe.product.HardwareHandler;
import javase.oop.oe.product.Manual;
import javase.oop.oe.product.Software;
import javase.oop.oe.product.SoftwareHandler;

public class Main {

    public static void main(String[] args) {
        //   Company comp = new Company("Sheraton", 103, "CIB", "010", "Muhammad", 10);
        //  Individual individual = new Individual("Heliopolis", 102, "Karim", "012", "1");

        //  CustomerHandler.insertCustomer(comp);
        // CustomerHandler.insertCustomer(individual);

        // Software sw1 = new Software("Windows", 100, "Windows 10", 10.5, "Meh");
        // Hardware hw1 = new Hardware("CPU", 101, "Intel", 550.0, 1);
        // Hardware hw2 = new Hardware("GPU", 102, "AMD", 600.0, 1);
        //   Manual m1 = new Manual("How to", 6, "Cook", 12.0, "Medhat");

        // SoftwareHandler.insertSoftware(sw1);
        // HardwareHandler.insertHardware(hw1);
        // HardwareHandler.insertHardware(hw2);

        //  Date d1 = new Date();
        // Order o1 = new Order(0, d1);

        //   o1.setCustomer(comp);

        //   o1.addOrderItems(hw1);
        // o1.addOrderItems(hw1);
        // o1.addOrderItems(hw1);
        // o1.addOrderItems(hw2);
        //  o1.addOrderItems(sw1);
        // o1.addOrderItems(m1);
        //o1.addOrderItems(m1);

        // System.out.println("Total = " + o1.getOrderTotal());
        //  o1.getOrderDetails();

        //  OrderHandler.insertOrder(o1);

        Order o2 = OrderHandler.getOrderById(107);

        o2.getOrderDetails();
    }

}
