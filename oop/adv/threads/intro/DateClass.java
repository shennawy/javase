package javase.oop.adv.threads.intro;

import java.text.SimpleDateFormat;

import java.util.Date;

public class DateClass implements Runnable {

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date d = new Date();
        for (int i = 0; i < 100; i++) {
            System.out.println(sdf.format(d));
        }

        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Failed to Sleep thread");
        }

    }
}
