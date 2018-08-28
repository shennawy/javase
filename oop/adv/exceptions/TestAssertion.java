package javase.oop.adv.exceptions;

public class TestAssertion {

    public static void main(String[] args) {
        int x = 7;
        int y = 10;

        // assert(statement):text
        // assert used with debugging only, breaks execution if failed
        assert (x > y) : "x is less than y";

        System.out.println("Reached program's end");
    }

}
