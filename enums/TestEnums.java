package javase.enums;

public class TestEnums {

    public static void main(String[] args) {

        for (WeekDays wd : WeekDays.values()) {
            System.out.println(wd);
            System.out.println(wd.getVal());
        }

        System.out.println("*****end loop*****");

        String daystr = "FRIDAY";
        System.out.println(WeekDays.valueOf(daystr));
        System.out.println(WeekDays.valueOf(daystr).getVal());
    }


}
