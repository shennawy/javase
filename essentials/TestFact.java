package javase.essentials;

public class TestFact {
    static int sum = 0;

    public static void main(String[] args) {


        int num = 5;
        int sum = factorial(num);
        System.out.println(sum);
    }

    public static int factorial(int num) {


        if (num == 1) {
            return num;
        }
        return num * factorial(num - 1);
    }

}
