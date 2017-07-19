package day170719.interfaces.examples;

/**
 * Created by Duelist on 19.07.2017.
 */
public class RunnableExamples {
    public static void main(String[] args) {
        Runnable task = () -> {
            int count = 0;
            while (true) {
                System.out.println(count++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        task.run();
    }
}
