package javase.oop.oe.db;

import java.util.ArrayList;

import javase.oop.oe.customer.Company;
import javase.oop.oe.customer.CompanyHandler;
import javase.oop.oe.customer.Customer;
import javase.oop.oe.customer.CustomerHandler;
import javase.oop.oe.params.ParamHandler;
import javase.oop.oe.product.Hardware;
import javase.oop.oe.product.HardwareHandler;
import javase.oop.oe.product.Software;
import javase.oop.oe.product.SoftwareHandler;

public class TestJDBC {

    public static void main(String[] args) {

        Customer c1 = new Customer("Muhammad", "Sheraton", "012");
        //CustomerHandler.insertCustomer(c1);

        /* ArrayList<Customer> customerList = new ArrayList<Customer>();
            customerList = CustomerHandler.getAllCustomers();

            for (Customer c : customerList){
                System.out.println("Customer Name = " + c.getCustomerName());
            }*/

        //   Customer c2 = CustomerHandler.getCustomerById(102);

        //  c2.setCustomerName("Shennawy");
        //  c2.setCustomerPhone("010101010");

        // System.out.println("C2 Update = " + CustomerHandler.updateCustomer(c2));

        //String address, int customerId, String customerName, String customerPhone, String companyContact,
        //int companyDiscount
        
      /*  Company company = new Company("Tagamoa", 103, "Asset", "018574964", "Hamada", 10);
        CompanyHandler.insertCompany(company);
        
        Company company2 = CompanyHandler.getCompanyById(103);
        
        CompanyHandler.insertCompany(company2);
        
        System.out.println("Testing company handler get" + company2.getCompanyDiscount());
*/
        
       // Software sw = new Software("Windows89", 5, "Windows", 50.0, "OpenSource");
      //  Software sw = SoftwareHandler.getSoftwareById(101);
        
       // System.out.println("getSoftwareById: " + sw.getDescription());
        
       // Hardware hardware = new Hardware("CPU", 50, "Intel", 50.0, 1);
        
      //  HardwareHandler.insertHardware(hardware);
        
        
      //  Hardware hardware2 = HardwareHandler.getHardwareById(102);
        //System.out.println("Testing getHardwareById: " + hardware2.getWarrantyPeriod() );
        
        System.out.println("TAX_VALUE = " +ParamHandler.getParamByName("TAX_VALUE").getParamValue() );
    }

}
