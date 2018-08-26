package javase.nested.classes;

public class Outer {

    private static String message = "HelloWorld";

    private class Inner {
        //Can access static and non static members
        public void display() {
            System.out.println("Message from non static nested or inner class: " + message);
        }
    }

    private static class staticInner {
        //Can only access static members
        public void printMessage() {
            // Compile time error if message field is not static
            System.out.println("Message from nested static class: " + message);
        }
    }

    public static void main(String[] args) {
        // Creating instance of nested Static class
        Outer.staticInner staticInnerOBJ = new Outer.staticInner();
        // Calling non static method of nested static class
        staticInnerOBJ.printMessage();

        // Creating instance of non static nested/inner class
        // Need to initialize outer class for this
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        // Calling non static method of inner class
        inner.display();

        // Above two steps combined:
        Outer.Inner nonStaticInner = new Outer().new Inner();
        // Same call
        nonStaticInner.display();

    }

}
