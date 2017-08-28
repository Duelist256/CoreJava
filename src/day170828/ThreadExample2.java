package day170828;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            int count = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(count++);
            }
        });
        thread.start();
    }
}

interface Lol {
    void kek();
}