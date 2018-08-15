package javase.oop.inherit;

public class TestAbstract {
    public static void main(String[] args) {

        //1.Polymorphism
        Person per1 = new Employee(101, "Ahmed", 50000, 20, 60);
        Employee e1 = (Employee) per1;
        System.out.println(e1.getMonthlyNetSalary());


        //2.Abstraction, not Polymorphism
        //Can't be instantiated
        //Person per = new Person(111, "Osama", 2000);
        //Calender c1 = new Calender();

        //Runtime error, Child can't be cast to parent
        //Employee e2 = (Employee) per;

        //3. Final
        final double pi = 3.145;
        //With Methods, can't be overriden
        //With Classes, can't be inherited -> Opposite of abstraction

        try {
            Employee e2 = (Employee) e1.clone();
            e2.setPersonName("Mahmoud");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Employee e3 = new Employee(103, "Karim", 5000, 30, 20);

        System.out.println(e1.compareTo(e3));

    }
}
