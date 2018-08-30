package javase.oop.adv.threads.intro;

public class NumClass implements Runnable {


    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println("Failed to put thread to Sleep");
                e.printStackTrace();
            }
        }

    }
}
