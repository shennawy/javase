package javase.oop.adv.lambda.greetings;

public class TestGreetings {

    public static void main(String[] args) {

        // Calls implementation of GreetingsInterface  in GreetingsClass
        // Specifically calls performGreeting()
        System.out.println("*****Without using Anonymous Class*****");
        printMessage(new GreetingsClass());

        System.out.println("*****Implementing Anonymous Class*****");
        printMessage(new GreetingsInterface() {

            @Override
            public void performGreeting() {
                System.out.println("Hello World");
            }
        });


        // Using Lambda
        System.out.println("*****Using Lambda*****");
        // Use '()' if no parameters in method
        printMessage(() -> System.out.println("Lambda"));


        // Implementation Using Anonymous Classes
        TwiceInterface twice = new TwiceInterface() {

            @Override
            public int twiceNumber(int num) {
                return num * 2;
            }
        };

        AddInterface add = new AddInterface() {

            @Override
            public int addNumbers(int firstNum, int secondNum) {
                return firstNum + secondNum;
            }
        };

        DivideInterface divide = new DivideInterface() {

            @Override
            public double divideNumbers(int firstNum, int secondNum) {
                if (secondNum == 0) {
                    System.out.println("Can't Divide by zero!");
                    System.exit(0);
                }

                return firstNum / secondNum;
            }
        };

        StringLength stringLength = new StringLength() {

            @Override
            public int stringSize(String stringText) {
                return stringText.length();
            }
        };

        int numOne = 6;
        int numTwo = 3;
        String text = "Hello";

        System.out.println("*****Using Anonymous Classes");
        System.out.println("TwiceInterface: " + twice.twiceNumber(numOne));
        System.out.println("AddInterface: " + add.addNumbers(numOne, numTwo));
        System.out.println("DivideInterface: " + divide.divideNumbers(numOne, numTwo));
        System.out.println("StringInterface: " + stringLength.stringSize(text));


        System.out.println("*****Using Lambda Expressions*****");
        twice = num -> num * 2;
        add = (firstNum, secondNum) -> firstNum * secondNum;
        divide = (firstNum, secondNum) -> firstNum / secondNum;
        stringLength = stringText -> stringText.length();

        System.out.println("TwiceInterface: " + twice.twiceNumber(numOne));
        System.out.println("AddInterface: " + add.addNumbers(numOne, numTwo));
        System.out.println("DivideInterface: " + divide.divideNumbers(numOne, numTwo));
        System.out.println("StringInterface: " + stringLength.stringSize(text));

    }

    public static void printMessage(GreetingsInterface greetings) {
        greetings.performGreeting();
    }

    interface TwiceInterface {
        int twiceNumber(int num);
    }

    interface AddInterface {
        int addNumbers(int numOne, int numTwo);
    }

    interface DivideInterface {
        double divideNumbers(int numOne, int numTwo);
    }

    interface StringLength {
        int stringSize(String text);
    }

}
