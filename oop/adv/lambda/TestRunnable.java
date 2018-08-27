package javase.oop.adv.lambda;

public class TestRunnable {

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Thread One is running");
            }
        });

        Thread threadTwo = new Thread(() -> System.out.println("Thread Two is running"));


        TestRunnable testRunnable = new TestRunnable();

        Runnable r = testRunnable.process();

        Thread threadThree = new Thread(r);
        
        threadThree.start();
    }

    public Runnable process() {
        Runnable r = () -> {
                System.out.println("Thread Three is running");
                System.out.println(this);
            };
        return r;
    }

}
