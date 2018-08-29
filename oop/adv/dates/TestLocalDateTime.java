package javase.oop.adv.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class TestLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime meeting, flight, courseStart, courseEnd;
        meeting = LocalDateTime.of(2014, Month.MARCH, 21, 13, 30);
        System.out.println("Meeting is on: " + meeting);

        LocalDate flightDate = LocalDate.of(2014, Month.MARCH, 31);
        LocalTime flightTime = LocalTime.of(21, 45);
        flight = LocalDateTime.of(flightDate, flightTime);
        System.out.println("Flight leaves: " + flight);

        courseStart = LocalDateTime.of(2014, Month.MARCH, 24, 9, 00);
        courseEnd = courseStart.plusDays(4).plusHours(8);
        System.out.println("Course starts: " + courseStart);
        System.out.println("Course ends:   " + courseEnd);

        long courseHrs =
            (courseEnd.getHour() - courseStart.getHour()) * (courseStart.until(courseEnd, ChronoUnit.DAYS) + 1);
        System.out.println("Course is:     " + courseHrs + " hours long.");
    }
}
