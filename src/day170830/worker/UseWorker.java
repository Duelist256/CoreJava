package day170830.worker;

import java.util.List;

public class UseWorker {
    public static void main(String[] args) {
        Worker worker = new Worker();

        worker.execute(() -> {
            System.out.print("hello, ");
        });

        worker.execute(() -> {
            System.out.println("world!");
        });

        for (int i = 0; i < 100; i++) {
            int temp = i;
            worker.execute(() -> {
                System.out.println("task " + temp);
            });
        }

        List<Runnable> tasks = worker.shutdownNow();
        System.out.println(tasks);
        System.out.println(tasks.size());
    }
}
