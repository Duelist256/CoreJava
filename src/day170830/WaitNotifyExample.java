package day170830;

import day170828.Utils;

public class WaitNotifyExample {

    public static void main(String[] args) {

        Object monitor = new Object();

        Thread thread = new Thread(() -> {
            System.out.println("trying to lock monitor...");
            synchronized (monitor) {
                System.out.println("locked!");
                try {
                    monitor.wait();
                    System.out.println("we were notified");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        Utils.pause(20000);

        System.out.println("ready to send notify");
        synchronized (monitor) {
            System.out.println("send notify...");
            monitor.notify();
            System.out.println("sleeping...");
            Utils.pause(20000);
            System.out.println("awake!");
        }
    }

}
