import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Task2Test {
    public static volatile AtomicInteger number = new AtomicInteger(1);
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        Task2 fizzBuzz = new Task2();
        service.submit(fizzBuzz::fizz);
        service.submit(fizzBuzz::buzz);
        service.submit(fizzBuzz::fizzbuzz);
        service.submit(fizzBuzz::num);
        service.submit(fizzBuzz::show);
        service.shutdown();
    }
}
