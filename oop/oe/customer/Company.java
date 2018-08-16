package javase.oop.oe.customer;

public class Company extends Customer {
    private String companyContact;
    private int companyDiscount;

    public Company() {

    }


    public Company(String address, int customerId, String customerName, String customerPhone, String companyContact,
                   int companyDiscount) {
        super(address, customerId, customerName, customerPhone);
        this.companyContact = companyContact;
        this.companyDiscount = companyDiscount;
    }


    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyDiscount(int companyDiscount) {
        this.companyDiscount = companyDiscount;
    }

    public int getCompanyDiscount() {
        return companyDiscount;
    }
}
