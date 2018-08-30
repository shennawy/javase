package javase.oop.adv.threads.thread_pool;

import java.util.concurrent.Callable;

// Callable Only works with threadPools, can return value
public class TaskThreadCallable implements Callable {
    private String taskName;

    public TaskThreadCallable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ", task name : " + taskName);
        double x = process();
        System.out.println(Thread.currentThread().getName() + " Completed , task name : " + taskName);
        return x;
    }

    private double process() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 55;
    }
}
