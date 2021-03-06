package javase.oop.adv.threads.race;

import java.util.ArrayList;

public class Race implements Runnable {
    private static String winner;
    long startTime = System.currentTimeMillis();
    private static ArrayList<String> runnersList = new ArrayList<String>();


    public void race() {

        for (int distance = 1; distance <= 100; distance++) {

            System.out.println("Distance covered by " + Thread.currentThread().getName() + " is : " + distance +
                               " meters");

            // Check if race is complete if someone has already won

            if (distance == 100)
                isRaceEnded(distance);

        }
    }

    public boolean isRaceEnded(int totalDistanceCovered) {
        boolean isRaceWon = false;
        double endTime = (System.currentTimeMillis() - startTime) / 1000.0;

        if (totalDistanceCovered == 100) {
            System.out.println(Thread.currentThread().getName() + " has finished the race in " + endTime + " seconds");
            runnersList.add(Thread.currentThread().getName());
        }

        if (totalDistanceCovered == 100 && Race.winner == null) {
            // Setting Winner Name
            Race.winner = Thread.currentThread().getName();
            System.out.println("Winner is : " + Race.winner);
            isRaceWon = true;
        }

        return isRaceWon;
    }

    @Override
    public void run() {
        race();
    }


    public static ArrayList<String> getRunnersList() {
        return runnersList;
    }
}
