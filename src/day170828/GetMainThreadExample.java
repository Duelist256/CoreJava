package day170828;

import static day170828.Utils.pause;

public class GetMainThreadExample {
    public static void main(String[] args) {
        new Thread(() -> {
            Thread current = Thread.currentThread();

            ThreadGroup threadGroup = current.getThreadGroup();

            Thread[] threads = new Thread[threadGroup.activeCount()];
            threadGroup.enumerate(threads);

            for (Thread thread : threads) {
                System.out.println(thread);
            }
        }).start();
        pause(3000);
    }
}
