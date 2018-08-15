package javase.oop.inherit;

public class TestInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Mahmoud", 6000.0, 30, 20.0);

        System.out.println("Monthly net: " + e1.getMonthlyNetSalary());

        e1.printPersonDetails();
        System.out.println(e1);

        Manager m1 = new Manager(102, "Magdy", 12000.0, 12);

        System.out.println("Manager Monthly: " + m1.getMonthlyNetSalary() + "Manager Annual: " +
                           m1.getAnnualNetSalary() + "Annual With Profit: " + m1.getAnnualNetSalary(100_000.00));

        double bonus = 500.0;

        calcBonus(e1, bonus);
        calcBonus(m1, bonus);

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
