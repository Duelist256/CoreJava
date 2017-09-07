package day170907;

public class Fibonacci {

    private static final int MAX = 1000;
    private static long[] fib = new long[MAX];

    public static long fib1(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("wrong");
        }

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }
        return fib1(n - 2) + fib1(n - 1);
    }

    public static long fib2(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("wrong");
        }

        if (n == 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }

        if (fib[n] == 0) {
            fib[n] = fib2(n - 1) + fib2(n - 2);
        }

        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println("start");
        long start = System.currentTimeMillis();
        System.out.println(fib1(1));
        System.out.println(fib1(2));
        System.out.println(fib1(3));
        System.out.println(fib1(4));
        System.out.println(fib1(5));
        System.out.println(fib1(6));
        System.out.println(fib1(7));
        long stop = System.currentTimeMillis();
        System.out.println("Elapsed " + (stop - start));
    }
}
