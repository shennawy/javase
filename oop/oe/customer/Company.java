package javase.oop.oe.customer;

public class Company extends Customer {
    private String companyContact;
    private int discount;

    public Company() {

    }


    public Company(String address, int customerId, String customerName, String customerPhone, String companyContact,
                   int discount) {
        super(address, customerId, customerName, customerPhone);
        this.companyContact = companyContact;
        this.discount = discount;
    }


    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
