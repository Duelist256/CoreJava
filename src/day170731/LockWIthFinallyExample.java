package day170731;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockWIthFinallyExample {
    static class Counter {
        int count;

        Lock lock = new ReentrantLock();

        public void inc() {
            lock.lock();
            try {
                internal();
            } finally {
                lock.unlock();
            }
        }

        private void internal() {
            int register = count;
            register++;
            count = register / 0;
        }

        public int getCount() {
            lock.lock();
            try {
                return count;
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable task = () -> {
            while (true) {
                counter.inc();
                System.out.println(counter.getCount());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(task).start();

        new Thread(task).start();
    }
}
