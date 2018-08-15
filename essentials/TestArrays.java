package javase.essentials;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        int xArr[] = new int[5];
        xArr[0] = 3;
        xArr[1] = 4;
        xArr[2] = 5;
        xArr[3] = 6;
        xArr[4] = 15;

        int[] yArr = { 81, 42, 43, 14, 50 };

        //Prints address
        System.out.println(xArr);

        //Static Method, Converts array to string.
        System.out.println(Arrays.toString(xArr));

        //Loops
        //for i loop
       /* int sumFor = 0;
        for (int i = 0; i < xArr.length; i++) {
            sumFor += xArr[i];
        }

        //while loop
        int sumWhile = 0;
        int counterwhile = 0;
        while (counterwhile < xArr.length) {
            sumWhile += xArr[counterwhile];
            counterwhile++;
        }
        //do while loop
        int counterDoWhile = 0;
        int sumDoWhile = 0;
        do {
            sumDoWhile += xArr[counterDoWhile];
            counterDoWhile ++;
        } while (counterDoWhile < xArr.length);
        
        //for each loop (Arrays)
        int sumForEach = 0;
        for (int index : xArr) {
            sumForEach += index;
        }


        System.out.println("For loop: " + sumFor + " While Loop: " + sumWhile + " Do While Loop: " + sumDoWhile +
                           " For Each Loop: " + sumForEach);
       
       */
        //iterator (Collection)
        //Recursion
        
        int sum = sumArray(xArr);
        
        System.out.println("Sum = " + sum);
    }
    
    public static int sumArray (int[] arr){
    int arraySum = 0;
        for (int index : arr) {
            arraySum += index;
        }
    return arraySum;
    }
}
