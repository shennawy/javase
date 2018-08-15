package javase.oop.inherit;


//Class can't be inherited
public final class Employee extends Person implements Cloneable, Comparable {
    private int overTimeHours;
    private double overTimeRate;


    public Employee(int personId, String personName, double personGrossSalary, int overTimeHours, double overTimeRate) {
        super(personId, personName, personGrossSalary);
        this.overTimeHours = overTimeHours;
        this.overTimeRate = overTimeRate;
    }

    public Employee(int personId, String personName, double personGrossSalary) {
        super(personId, personName, personGrossSalary);
    }

    public void setOverTimeHours(int overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public int getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    //Below Method can't be overriden
    public final double getOverTimeRate() {
        return overTimeRate;
    }

    public double getMonthlyNetSalary() {
        double tax = 10;
        return getPersonGrossSalary() - (getPersonGrossSalary() * tax / 100) + overTimeHours * overTimeRate;
    }

    /*
    public double getAnnualNetSalary() {

        return getMonthlyNetSalary() * 12;
    }
*/

    @Override
    public void printPersonDetails() {
        super.printPersonDetails();
        System.out.println("Monthly Net: " + getMonthlyNetSalary());
        System.out.println("Monthly Annual: " + getAnnualNetSalary());
    }

    @Override
    public String toString() {
        return "This is employee";
    }

    @Override
    public double getAnnualNetSalary() {
        return getMonthlyNetSalary() * 12;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException { //Exception must be caught when calling this method
        return super.clone();
    }

    @Override
    public int compareTo(Object object) {
        Employee e = (Employee) object;
        if (this.getMonthlyNetSalary() < e.getMonthlyNetSalary()) {
            return -1;
        } else if (this.getMonthlyNetSalary() > e.getMonthlyNetSalary()) {
            return 1;
        } else
            return 0;
    }
}
