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


    }

    public static void printMessage(GreetingsInterface greetings) {
        greetings.performGreeting();
    }

}
