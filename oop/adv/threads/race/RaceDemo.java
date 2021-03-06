package javase.oop.adv.threads.race;

import java.util.ArrayList;


public class RaceDemo {
    public static void main(String[] args) {


        Race race = new Race();

        Thread ahmedThread = new Thread(race, "Ahmed");
        Thread hanyThread = new Thread(race, "Hany");
        Thread samehThread = new Thread(race, "Sameh");
        Thread heshamThread = new Thread(race, "Hesham");
        Thread monaThread = new Thread(race, "Mona");

        ahmedThread.start();
        hanyThread.start();
        samehThread.start();
        heshamThread.start();
        monaThread.start();


        ahmedThread.setPriority(Thread.NORM_PRIORITY);
        hanyThread.setPriority(Thread.MIN_PRIORITY);
        samehThread.setPriority(Thread.MAX_PRIORITY);
        heshamThread.setPriority(Thread.NORM_PRIORITY);
        monaThread.setPriority(Thread.MIN_PRIORITY);

        try {
            ahmedThread.join();
            hanyThread.join();
            samehThread.join();
            heshamThread.join();
            monaThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("******************");
        System.out.println("Runners in positions");
        ArrayList<String> runnersList = Race.getRunnersList();
        int i = 0;
        for (String runnerName : runnersList) {
            i++;
            System.out.println(i + " " + runnerName);
        }

    }
}
