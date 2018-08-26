package javase.oop.inherit;

public class Manager extends Person {
    public Manager(int personId, String personName, double personGrossSalary,
                   double profitPercentage) {
        // TODO Implement this method
        super(personId, personName, personGrossSalary);
        this.profitPercentage = profitPercentage;
    }

    private double profitPercentage;

    public void setProfitPercentage(int profitPercentage) {
        this.profitPercentage = profitPercentage;
    }

    public double getProfitPercentage() {
        return profitPercentage;
    }

    
    public double getMonthlyNetSalary() {
        double tax = 10.0;
        return getPersonGrossSalary() - getPersonGrossSalary()*(tax/100);
    }

    
    public double getAnnualNetSalary() {
        return getMonthlyNetSalary()*12;
    }
    
    public double getAnnualNetSalary(double companyProfit){
        return getAnnualNetSalary() + (companyProfit*(profitPercentage/100.0));
    }
    
    
}
