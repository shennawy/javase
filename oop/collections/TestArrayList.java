package javase.oop.collections;

import java.util.ArrayList;

import javase.oop.inherit.Employee;

public class TestArrayList {
    public static void main(String[] args) {
        //Not Recommended to put different objects in ArrayList
        ArrayList myList = new ArrayList();
        myList.add(30);
        myList.add(100.55);
        myList.add("Ahmed");
        
        System.out.println(myList);
        
        System.out.println(myList.get(1));
        System.out.println(myList.contains(30)); //Takes Object
        
        myList.remove(100.55); //Takes Object
        
        Employee e1 = new Employee (101, "Ahmed", 5000.0, 20, 60);
        
        myList.add(e1);
        ((Employee)myList.get(2)).getPersonGrossSalary();
        
        for (Object item : myList){
            System.out.println(item);
        }
   }
}
