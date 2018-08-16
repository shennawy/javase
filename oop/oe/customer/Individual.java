package javase.oop.oe.customer;

public class Individual extends Customer {

    private String licNumber;

    public Individual(String address, int customerId, String customerName, String customerPhone, String licNumber) {
        super(address, customerId, customerName, customerPhone);
        this.licNumber = licNumber;
    }

    public void setLicNumber(String licNumber) {
        this.licNumber = licNumber;
    }

    public String getLicNumber() {
        return licNumber;
    }

    public String toString() {
        String text = "";

        text +=
            "Customer name: " + super.getCustomerName() + " Customer Id: " + super.getCustomerId() +
            " Customer phone: " + super.getCustomerPhone() + " Customer Address: " + super.getCustomerAddress() +
            " Customer License Number: " + licNumber;

        return text;
    }

}
