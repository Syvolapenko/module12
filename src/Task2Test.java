import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Task2Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(6);
        Task2 fizzBuzz = new Task2();
        service.submit(fizzBuzz::fizz);
        service.submit(fizzBuzz::buzz);
        service.submit(fizzBuzz::fizzbuzz);
        service.submit(fizzBuzz::num);
        service.submit(fizzBuzz::show);
        service.shutdown();
    }
}
