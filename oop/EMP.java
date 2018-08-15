package javase.oop;

public class EMP {
    private int empId;
    private String empName;
    private double empGrossSalary;
    private String empJob;
    private static int empsCounter;


    public EMP(){
        empsCounter++;
    }
    public EMP(int empId, String empName, double empGrossSalary) {
        this(); //Calls empty constructor
        //super();
        this.empId = empId;
        this.empName = empName;
        this.setEmpGrossSalary(empGrossSalary);
    }


    public static int getEmpsCounter() {
        return empsCounter;
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

    public void setEmpGrossSalary(double empGrossSalary) {
        if (empGrossSalary <= 0) {
            System.out.println("Gross Salary Can't be < 0");
            System.exit(0);
        }
        this.empGrossSalary = empGrossSalary;
    }

    public double getEmpGrossSalary() {
        return empGrossSalary;
    }

    public void setEmpJob(String empJob) {
        this.empJob = empJob;
    }

    public String getEmpJob() {
        return empJob;
    }

/***
 * This Method is to calculate monthly net salary
 * 
 **/
    public double getMonthlyNetSalary() {
        int tax = 10;

        return empGrossSalary - (empGrossSalary * tax / 100);
    }

    public double getAnnualNetSalary() {

        return getMonthlyNetSalary() * 12;
    }


}
