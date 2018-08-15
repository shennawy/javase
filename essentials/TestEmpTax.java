package javase.essentials;

import java.util.Date;

public class TestEmpTax {
    public static void main(String[] args) {

        int empId = 101;
        String empName = "Shennawy";
        double empGrossSalary = 7000;
        String empJob = "Java Developer";
        Date empHireDate = new Date();
      
        //Calling Calculate Tax Method
        int tax = calcTax(empGrossSalary);

        double empMonthlyNetSalary = empGrossSalary - empGrossSalary * (tax / 100.0);
        double empAnnualNetSalary = empMonthlyNetSalary * 12;

        System.out.println("Emp whose ID = " + empId + " , named: " + empName + ", Works as a: " + empJob +
                           ", hired on: " + empHireDate + ", Takes monthly net = " + empMonthlyNetSalary +
                           " And annual net: " + empAnnualNetSalary);
    }

    public static int calcTax(double empGrossSalary) {
        int tax = 0;

        if (empGrossSalary < 5000) {
            tax = 0;
        }

        else if (empGrossSalary >= 5000 && empGrossSalary < 10000) {
            tax = 10;
        }

        else if (empGrossSalary >= 10000 && empGrossSalary < 15000) {
            tax = 15;
        }

        else if (empGrossSalary >= 15000) {
            tax = 20;
        }

        return tax;
    }
}
