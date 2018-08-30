package javase.oop.adv.threads.thread_pool;

public class TaskThreadRunnable implements Runnable {
    private String taskName;

    public TaskThreadRunnable(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", task name : " + taskName);
        process();
        System.out.println(Thread.currentThread().getName() + " Completed , task name : " + taskName);
    }

    private void process() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
}
