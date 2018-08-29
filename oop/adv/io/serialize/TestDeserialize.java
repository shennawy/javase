package javase.oop.adv.io.serialize;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class TestDeserialize {

    public static void main(String[] args) {

        FileInputStream input;
        try {
            input =
                new FileInputStream("C:\\JDeveloper\\mywork\\SEApplication\\SEProject\\src\\javase\\serialize_output.txt");

            ObjectInputStream objectInput = new ObjectInputStream(input);
            //    Employee e1 = (Employee) objectInput.readObject();

            ArrayList<Employee> empList = new ArrayList<Employee>();

            Employee emp;
            // Ignores read item from file
            while ((emp = (Employee) objectInput.readObject()) != null) {
                empList.add(emp);
                System.out.println("Loop works");
                System.out.println(emp.getEmpName());
            }


        } catch (EOFException e) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
