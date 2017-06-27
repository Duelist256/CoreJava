package day170624.homework.fibonacci;

import day170624.mytestframework.Asserts;

/**
 * Created by Duelist on 25.06.2017.
 */
public class FibonacciTest {
    private static void fib(int n) {
        int fib[] = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-2] + fib[i-1];
            System.out.println(fib[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(1), true));
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(5), true));
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(7), false));
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(8), true));
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(0), true));
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(-1), false));
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(Integer.MAX_VALUE), true));
        System.out.println(Asserts.assertEquals(Fibonacci.isFibonacci(Integer.MIN_VALUE), false));


        System.out.println(Asserts.assertNotEquals(Fibonacci.isFibonacci(5), false));
        System.out.println(Asserts.assertNotEquals(Fibonacci.isFibonacci(34), false));
        System.out.println(Asserts.assertNotEquals(Fibonacci.isFibonacci(1), false));
        System.out.println(Asserts.assertNotEquals(Fibonacci.isFibonacci(0), false));
        System.out.println(Asserts.assertNotEquals(Fibonacci.isFibonacci(-5), true));
        System.out.println(Asserts.assertNotEquals(Fibonacci.isFibonacci(Integer.MIN_VALUE), true));
        System.out.println(Asserts.assertNotEquals(Fibonacci.isFibonacci(Integer.MAX_VALUE), false));
    }
}
