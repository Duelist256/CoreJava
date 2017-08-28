package day170828;

import static day170828.Utils.pause;

public class DaemonExample {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                System.out.print("раз..");
                pause();
                System.out.println("два");
            }
        });

        t.setDaemon(true);

        t.start();
        System.out.println(t.isAlive());

        System.out.println("continue ...");
        pause(5000);
        System.out.println("finish");
    }
}
