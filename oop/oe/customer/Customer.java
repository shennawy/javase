package javase.oop.oe.customer;

public class Customer {
    private String customerAddress;
    private int customerId;
    private String customerName;
    private String customerPhone;

    public Customer() {

    }


    public Customer(String customerAddress, int customerId, String customerName, String customerPhone) {
        this.customerAddress = customerAddress;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
    }


    public void setAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String customerAddress() {
        return customerAddress;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
