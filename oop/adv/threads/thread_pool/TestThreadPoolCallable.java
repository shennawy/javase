package javase.oop.adv.threads.thread_pool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Callable Only works with threadPools, can return value
public class TestThreadPoolCallable {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; i++) {
            TaskThreadCallable task = new TaskThreadCallable("Task : " + i);
            Future<Double> future = executor.submit(task);
            try {
                System.out.println("future result : " + future.get());
            } catch (ExecutionException | InterruptedException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        long endTime = System.currentTimeMillis();
        System.out.println("All Tasks are done");
        System.out.println("In time : " + (endTime - startTime));
    }


}
