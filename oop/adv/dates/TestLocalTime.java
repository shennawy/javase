package javase.oop.adv.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;


public class TestLocalTime {
    public static void main(String[] args) {
        LocalTime now, nowPlus, nowHrsMins, lunch, bedtime;
        now = LocalTime.now();
        System.out.println("The time now is: " + now);
        
        nowPlus = now.plusHours(1).plusMinutes(15);
        System.out.println("What time is it 1 hour 15 minutes from now? " + nowPlus);
        
        nowHrsMins = now.truncatedTo(ChronoUnit.MINUTES);
        System.out.println("Truncate the current time to minutes: " + nowHrsMins);
        System.out.println("It is the " + now.toSecondOfDay() / 60 + "th minute");
        
        lunch = LocalTime.of(12, 30);
        System.out.println("Is lunch in my future? " + lunch.isAfter(now));
        
        long minsToLunch = now.until(lunch, ChronoUnit.MINUTES);
        System.out.println("Minutes til lunch: " + minsToLunch);
        
        bedtime = LocalTime.of(21, 0);
        long hrsToBedtime = now.until(bedtime, ChronoUnit.HOURS);
        System.out.println("How many hours until bedtime? " + hrsToBedtime);


    }
}
