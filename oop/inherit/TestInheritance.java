package javase.oop.inherit;

import javase.oop.interfaces.MaxRateInterface;
import javase.oop.interfaces.Travel;

public class TestInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Mahmoud", 6000.0, 30, 20.0);

        System.out.println("Monthly net: " + e1.getMonthlyNetSalary());

        e1.printPersonDetails();
        System.out.println(e1);

        Manager m1 = new Manager(102, "Magdy", 120000.0, 12);

        System.out.println("Manager Monthly: " + m1.getMonthlyNetSalary() + "Manager Annual: " +
                           m1.getAnnualNetSalary() + "Annual With Profit: " + m1.getAnnualNetSalary(100_000.00));

        double bonus = 500.0;

        calcBonus(e1, bonus);
        calcBonus(m1, bonus);

        // Interfaces

        Consultant c1 = new Consultant(601, "Ehab", 12000.0);
        int noDays = 5;
        System.out.println("Consultant perdeim cost: " + c1.getPerdiemCost(noDays));

        ProjectManager pm1 = new ProjectManager(701, "Nahla", 12000.0);
        System.out.println("PM Perdeim cost: " + pm1.getPerdiemCost(noDays));

        System.out.println("-----Constultant Report-----");
        c1.showReport(c1, noDays);
        System.out.println("-----Project Manager Report-----");
        pm1.showReport(pm1, noDays);


        //Polymorphism for objects who don't share a parent
        Travel t = new ProjectManager(701, "Nahla", 12000.0);
        ((ProjectManager) t).getAnnualNetSalary();


        /*Anonymous Class, created and used on the fly
         *for classes that don't inherit,
         *instead of writing spaghetti
         *in this case it should be in a class of its own,
         *This is just an example
         *Best used to implement methods in interface with one method only
        */
        Travel tTeamLeader = new Travel() {

            @Override
            public double getTicketCost() {
                // TODO Implement this method
                return 0.0;
            }

            @Override
            public double getPerdiemCost(double noDays) {
                // TODO Implement this method
                return Travel.DAY_COST * noDays + 1500;
            }

            @Override
            public double getAccomodationCost() {
                // TODO Implement this method
                return 0.0;
            }
        };

        System.out.println("----Team Leader Stuff----");
        System.out.println(tTeamLeader.getPerdiemCost(noDays));


        // use MaxRateInterface method
        MaxRateInterface personRate = new MaxRateInterface() {
            /*
             * Correct use of anonymous Class,
             * when interface has only one method and generic enough to be used anywhere
             */
            @Override
            public boolean checkRate(double amount) {
                return amount < MaxRateInterface.MAX_RATE ? false : true;
            }
        };
        System.out.println("Anonymous Class example: " + personRate.checkRate(m1.getMonthlyNetSalary()));

        // Lambda Example
        // Only works on interfaces with just one abstract method
        // An implementation on MaxRateInterface
        MaxRateInterface personRateLambda =
            amount -> m1.getMonthlyNetSalary() < MaxRateInterface.MAX_RATE ? false : true;
        System.out.println("Lambda Example: " + personRateLambda.checkRate(m1.getMonthlyNetSalary()));

        System.out.println("*****Anonymous Java 7*****");

        boolean isValid = validatePerson(m1, new MaxRateInterface() {

            @Override
            public boolean checkRate(double amount) {
                return amount < MaxRateInterface.MAX_RATE ? false : true;
            }
        });
        System.out.println("isValid ? ");
        System.out.println(isValid);

        System.out.println("*****Java 8*****");
        System.out.println("Even more Lambda");
        System.out.println("Manager M1 is valid ? " +
                           validatePerson(m1, amount -> amount < MaxRateInterface.MAX_RATE ? false : true));

    }

    // To be implemented when calling
    // Like passing method implementation as a parameter
    public static boolean validatePerson(Person p, MaxRateInterface maxRateInterface) {
        return maxRateInterface.checkRate(p.getPersonGrossSalary());
    }

    //Polymorphism baby
    public static void calcBonus(Person per, double bonus) {
        if (per instanceof Employee) {
            System.out.println("Person Name: " + per.getPersonName());
            System.out.println("Monthly Net: " +
                               ((Employee) per).getMonthlyNetSalary()); //casts object of Person to Employee
        } else if (per instanceof Manager) {
            System.out.println("Person Name: " + per.getPersonName());

            Manager m = (Manager) per; //casts object of Person to Manager "Dynamic Binding"
            System.out.println("Monthly Net: " + m.getMonthlyNetSalary());
        }

    }
}
