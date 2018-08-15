package javase.oop.oe.order;

import java.util.ArrayList;
import java.util.Date;

import javase.oop.oe.customer.Customer;
import javase.oop.oe.product.Product;

public class Order {
    private int orderId;
    private Date orderDate;
    private Customer customer;
    private ArrayList<OrderItem> orderItems = new ArrayList<OrderItem>();
    private double orderTotal;

    public Order() {

    }


    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }


    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addOrderItems(Product product) {

        boolean needToAdd = true;
        OrderItem oi;

        for (int i = 0; i <= orderItems.size() - 1; i++) {
            if (product.getProductId() == orderItems.get(i).getProduct().getProductId()) {
                orderItems.get(i).setQuantity(1);
                needToAdd = false;
                break;
            } else
                needToAdd = true;
            
        }

        if (needToAdd) {
            oi = new OrderItem(0, product, 1);
            orderItems.add(oi);
        }

    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public double getOrderTotal() {
        if (orderItems.size() == 0) {
            return 0;
        }

        else

            for (int i = 0; i <= orderItems.size() - 1; i++) {

                orderTotal += orderItems.get(i).getItemTotal();

            }
        return orderTotal;
    }

    public void getOrderDetails() {


        for (OrderItem order : orderItems) {
            System.out.println(" Product Name = " + order.getProduct().getProductName() + " Product Retail: " +
                               order.getProduct().getRetailPrice() + " Item Total = " + order.getItemTotal() +
                               " Quantity = " + order.getQuantity());


        }


    }
}
