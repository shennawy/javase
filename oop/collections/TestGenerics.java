package javase.oop.collections;

import java.util.ArrayList;

import javase.oop.inherit.Employee;

public class TestGenerics {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ahmed", 4000.0, 10, 60);
        Employee e2 = new Employee(102, "Muhammad", 5000.0, 20, 70);
        Employee e3 = new Employee(103, "Muhammad", 6000.0, 30, 80);

        //ArrayList of Type Employee, less hassle.
        ArrayList<Employee> empsList = new ArrayList<Employee>();
        empsList.add(e1);
        empsList.add(e2);
        empsList.add(e3);

        for (Object item : empsList) {
            //Uneccesary Casting, all elements are of same Class
            System.out.println(((Employee) item).getMonthlyNetSalary());
        }

        //Behold the power of generics
        for (Employee emp : empsList) {
            System.out.println(emp.getMonthlyNetSalary());
        }
    }
}
