package javase.essentials;

public class CheckString {
    public static void main(String[] args) {
        String password = "wElcome1";

        boolean isCorrect = checkString(password);
        System.out.println(isCorrect);

    }

    public static boolean checkString(String check) {
        boolean isCorrect = false;
        int arrLength = check.toCharArray().length;
        char checkArr[] = new char[arrLength];
        checkArr = check.toCharArray();
        boolean isUpperCase = false;
        boolean isDigit = false;

        for (char index : checkArr) {
            if (Character.isUpperCase(index)) {
                isUpperCase = true;
            }
            if (Character.isDigit(index)) {
                isDigit = true;
            }
        }

        if (isUpperCase == true && isDigit == true) {
            isCorrect = true;
        }

        return isCorrect;
    }
}
