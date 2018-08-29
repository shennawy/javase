package javase.oop.adv.io.serialize;

import java.io.Serializable;

public class Employee implements Serializable {

    private int empId;
    private String empName;
    private double empSalary;

    public Employee(int empId, String empName, double empSalary) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public Employee() {

    }


    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}
