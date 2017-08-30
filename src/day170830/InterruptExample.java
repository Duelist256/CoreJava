package day170830;

import day170828.Utils;

public class InterruptExample {
    public static void main(String[] args) {

        Thread t = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();

        Utils.pause();

        t.interrupt();
    }
}
