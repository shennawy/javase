package javase.oop.myclasses;

import java.util.Date;
import java.util.regex.Pattern;

public class TestString {
    public static void main(String[] args) {

        //Checks memory for Ahmed, Points to it first; if changed, goes somewhere else in memory
        String s1 = "Ahmed";
        String s2 = "Ahmed";
        String s3 = new String("Ahmed"); //Not Recommended
        s1 = "Welcome to Java";
        s2 = "Java";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.startsWith("Welcome"));
        System.out.println(s1.endsWith(s2));

        int age = legalIdDate("2 87 05 09 21 00 838");
        System.out.println(age);


    }

    public static int legalIdDate(String idDate) {
        int age = 0;


        String[] tempList = idDate.split(" ");

        String century = tempList[0];
        String yearOfBirth = tempList[1];
        String monthOfBirth = tempList[2];
        String dayOfBirth = tempList[3];

        int tempYear = Integer.parseInt(yearOfBirth);
        if (century.equals("2")) {
            tempYear += 1900;
        } else if (century.equals("3")) {
            tempYear += 2000;
        }
        
        System.out.println("temp year before date " + tempYear);
        Date birthDate =
            new Date(tempYear-1900, Integer.parseInt(monthOfBirth) - 1, Integer.parseInt(dayOfBirth));

        System.out.println("Your Birthdate = " + birthDate);

System.out.println("Temp Year " + tempYear);
        age = 2018 - tempYear;

        return age;
    }
}
