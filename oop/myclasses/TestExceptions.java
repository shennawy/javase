package javase.oop.myclasses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {


            int firstNum = input.nextInt();
            int secondNum = input.nextInt();

            System.out.println("You've entered both numbers");
        } catch (InputMismatchException e) {
            System.out.println("You should enter numbers only");
        }
    }
}
