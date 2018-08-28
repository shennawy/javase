package javase.oop.adv.streams;

public enum Gender {

    MALE(0),
    FEMALE(1);

    private int val;

    Gender(int val) {
        this.val = val;
    }

    int getVal() {
        return val;
    }

}
