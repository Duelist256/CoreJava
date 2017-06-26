package day170624.homework.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 25.06.2017.
 */
public class Fibonacci {
    public static boolean isFibonacci(int a) {
        int fib1 = 0;
        int fib2 = 1;

        if (a == 0 || a == 1) {
            return true;
        }

        int num = fib1 + fib2;
        while (num < a) {
            fib1 = fib2;
            fib2 = num;
            num = fib1 + fib2;
        }

        return a == num;
    }

}
