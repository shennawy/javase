package javase.oop.adv.threads.intro;

public class TestThreads {

    public static void main(String[] args) {

        NumClass numClass = new NumClass();
        DateClass dateClass = new DateClass();

        Thread threadNum = new Thread(new NumClass());
        Thread threadDate = new Thread(new DateClass());

        Thread myThread = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Anonymous class example");
            }
        });

        Thread myOtherThread = new Thread(() -> System.out.println("Lambda Example"));

        threadNum.start();
        threadDate.start();

        // Hold and wait till threadDate finishes exectiton
        try {
            threadDate.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Failed to hold");
        }
        myThread.start();
        myOtherThread.start();
    }

}
