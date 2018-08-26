package javase.enums;

public enum WeekDays {
    //Value can be string also
    SATURDAY(1),
    SUNDAY(2),
    MONDAY(3),
    TESUDAY(4),
    WEDNESDAY(5),
    THURSDAY(6),
    FRIDAY(7);

    private int val;

    WeekDays(int val) {
        this.val = val;
    }


    public int getVal() {
        return val;
    }
}
