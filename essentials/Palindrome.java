package javase.essentials;

import java.util.Arrays;

public class Palindrome {
    
    public static void main(String[] args) {

        int[] myArr = {1, 2, 3, 4, 5};

        boolean palindromeFlag = palindromeCheck(myArr);

        System.out.println(palindromeFlag);
        System.out.println(Arrays.toString(reverseArray(myArr)));
    }

    public static boolean palindromeCheck(int arr[]) {
        boolean isPalindrome = true;


            //can use two counters in same loop
        for (int i = 0, j=arr.length-1; i < arr.length; i++, j--) {
            if (arr[j] != arr[i]) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }
    
    public static int[] reverseArray(int[]myArr){
        int[] tempArr = new int[myArr.length];
        for(int i=0, j=myArr.length-1; i<myArr.length; i++, j--){
            tempArr[i] = myArr[j];
        }
        myArr = tempArr;
        return myArr;
    }
}
