package day170710.lesson.datetime;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by Duelist on 10.07.2017.
 */
public class StopWatch {

    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(1000);
        Instant stop = Instant.now();

        Duration elapsed = Duration.between(start, stop);
        System.out.println(elapsed.toNanos());
        System.out.println(elapsed.toMillis());
        System.out.println(elapsed.getSeconds());
        System.out.println(elapsed.getNano());

        long time = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            System.out.println(System.nanoTime() - time);
        }
    }
}
