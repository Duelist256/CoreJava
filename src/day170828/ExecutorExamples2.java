package day170828;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static day170828.Utils.pause;

public class ExecutorExamples2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");

//        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newCachedThreadPool();

        service.execute(() -> {
            pause(3000);
            System.out.println("Hello, world 1");
        });

        service.execute(() -> {
            pause(3000);
            System.out.println("Hello, world 2");
        });

        service.execute(() -> {
            pause(3000);
            System.out.println("Hello, world 3");
        });

        service.execute(() -> {
            pause(3000);
            System.out.println("Hello, world 4");
        });

        service.execute(() -> {
            pause(3000);
            System.out.println("Hello, world 5");
        });

        service.shutdown();


        boolean succeed = service.awaitTermination(1, TimeUnit.HOURS);
        System.out.println("finish " + succeed);
    }
}
