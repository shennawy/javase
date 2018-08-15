package javase.oop.myclasses;

public class Emp {
    private int empId;
    private String empName;
    private double empSalary;

    public Emp(int empId, String empName, double empSalary) throws EmpSalException {
        this.setEmpSalary(empSalary);
        this.empId = empId;
        this.empName = empName;
        //this.empSalary = empSalary;
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

    public void setEmpSalary(double empSalary) throws EmpSalException {
        if (empSalary <= 0) {
            throw new EmpSalException();
        }
        this.empSalary = empSalary;
    }

    public double getEmpSalary() {
        return empSalary;
    }
}
