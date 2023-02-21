import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleAtFixedRate(
                new MyMethod(),
                1,
                1,
                TimeUnit.SECONDS
        );
        scheduledExecutorService.scheduleAtFixedRate(
                new MyMethod2(),
                5,
                5,
                TimeUnit.SECONDS
        );
        Thread.sleep(16000);
        scheduledExecutorService.shutdown();
        System.out.println("Stop");
    }
    public static class MyMethod implements Runnable{
        int seconds = 1;
        @Override
        public void run() {
            System.out.println(seconds + " seconds");
            seconds++;
        }
        }
    public static class MyMethod2 implements Runnable{
        @Override
        public void run() {
            System.out.println(" 5 seconds have passed");
        }
    }
    }
