package day170828;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServicesExample {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

        service.execute(() -> {
            System.out.println("hello");
        });

        service.schedule(() -> {
            System.out.println("hi there");
        }, 5, TimeUnit.SECONDS);

        service.scheduleAtFixedRate(() -> {
            System.out.println("ku-ku");
        }, 1, 1, TimeUnit.SECONDS);

        service.scheduleWithFixedDelay(() -> {
            System.out.println("kwa-kwa");
        }, 1, 1, TimeUnit.SECONDS);
    }
}
