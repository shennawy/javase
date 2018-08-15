package javase.oop.myclasses;

import java.awt.HeadlessException;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*try {


            int firstNum = input.nextInt();
            int secondNum = input.nextInt();

            System.out.println("You've entered both numbers");
        } catch (InputMismatchException e) {
            System.out.println("You should enter numbers only");
        }
*/
        try {
            String firstNum =
                JOptionPane.showInputDialog(null, "Enter First Numer", "Input Dialog", JOptionPane.INFORMATION_MESSAGE);

            String secondNum =
                JOptionPane.showInputDialog(null, "Enter First Numer", "Input Dialog", JOptionPane.INFORMATION_MESSAGE);

            int result = Integer.parseInt(firstNum) / Integer.parseInt(secondNum);
            System.out.println("Result = " + result);
        } catch (NumberFormatException nfe) {
            System.out.println("Number only ya baby");
        }

        catch (ArithmeticException ae) {
            System.out.println("Don't divide by zero ya baby");

        } finally { //Works wheter an exception is caught or not
            System.out.println("Final Statement");
        }


        try {
            Emp e1 = new Emp(101, "Ahmed", -5);
        } catch (EmpSalException e) {
            System.out.println("EmpSalException");
        }
    }

}
