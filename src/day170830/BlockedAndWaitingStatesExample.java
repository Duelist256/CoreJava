package day170830;

import day170828.Utils;

public class BlockedAndWaitingStatesExample {

    public static void main(String[] args) {

        Object monitor = new Object();

        Thread thread = new Thread(() -> {
            System.out.println("trying to lock monitor...");
            synchronized (monitor) {
                System.out.println("locked!");
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        synchronized (monitor) {
            System.out.println("starting another thread...");
            thread.start();
            System.out.println("sleeping...");
            Utils.pause(1000);
            System.out.println(thread.getState());
            Utils.pause(4000);
            System.out.println("awake!");
        }
    }

}
