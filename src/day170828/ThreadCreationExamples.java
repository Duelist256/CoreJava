package day170828;

public class ThreadCreationExamples {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello, world! I'm a parameter");
        }).start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("Hello, world! I'm anonymous");
            }
        }.start();

        new MyThread().start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, world! I'm subclass");
    }
}

