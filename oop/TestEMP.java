package javase.oop;

public class TestEMP {
    public static void main(String[] args) {

        EMP e1 = new EMP(101, "Ahmed", 5000);

        e1.setEmpGrossSalary(8000);
        e1.setEmpName("Muhammad");
        e1.setEmpJob("Developer");

        System.out.println("Monthly Net Salary: " + e1.getMonthlyNetSalary());
        System.out.println("Annual Net Salary: " + e1.getAnnualNetSalary());

        EMP[] empArr = new EMP[5];

       /* Loan l1 = new Loan(0.12, 5, 100000.00);
        System.out.println("Total Payment = " + l1.getTotalPayment() + "monthly payment = " + l1.getMonthlyPayment());

        for (int i = 0; i < empArr.length; i++) {
            empArr[i] = new EMP(i, "Muhammad", (i + 1000) * 2);
        }

        double totalMonthlyNet = calculateMonthlyNet(empArr);

        System.out.println("Total Monthly Net: " + totalMonthlyNet);
*/
        System.out.println(EMP.getEmpsCounter()); //Must be called with class name
    }

    public static double calculateMonthlyNet(EMP[] empArr) {
        double totalMonthlyNet = 0;

        for (int i = 0; i < empArr.length; i++) {
            totalMonthlyNet = empArr[i].getMonthlyNetSalary();
        }

        return totalMonthlyNet;
    }
}
