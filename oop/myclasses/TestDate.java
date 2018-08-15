package javase.oop.myclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDate {
    public static void main(String[] args) {
        Date today = new Date();


        //21-4-2016
        //Input difference from after 1900
        //Months start from 0
        Date customDate = new Date(116, 3, 21);
        System.out.println(customDate);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.format(today); //Returns date to given format

        String dateStr = "2018, DECEMBER, 23";
        sdf.applyPattern("yyyy, MMM, dd");

        try {
            Date newDate = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sdf.format(today));

        // Gregorian Calender

        System.out.println("****Gregorian Calender****");

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.getTime());

        //Takes Util.Date
        gc.setTime(customDate);
        System.out.println(gc.getTime());

        //Reads Month from 0
        GregorianCalendar gc1 = new GregorianCalendar(2018, 3, 21);

        gc1.set(2019, 5, 23);

        GregorianCalendar gc4 = new GregorianCalendar();

        //Calendar is parent of GregorianCalendar
        System.out.println("Calender.get.Calendar: " + gc4.get(Calendar.DAY_OF_WEEK));


        gc4.add(Calendar.DAY_OF_WEEK, -7);
        if (gc4.get(Calendar.DAY_OF_WEEK) == Calendar.TUESDAY) {
            System.out.println("Today is tuesday");
        }

        Date test = new Date();

        test = GregorianCalendar(test, 9);

        System.out.println("Assignment Test " + test);

    }

    public static Date GregorianCalendar(Date todayDate, int count) {

        GregorianCalendar returnedDate = new GregorianCalendar();
        returnedDate.setTime(todayDate);

        int counter = 0;
        while (counter < count) {

            if (returnedDate.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY ||
                returnedDate.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                returnedDate.add(Calendar.DAY_OF_WEEK, 1);
                continue;
            } else
                returnedDate.add(Calendar.DAY_OF_WEEK, 1);

            counter++;


        }

        return returnedDate.getTime();
    }

}
