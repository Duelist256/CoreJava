package day170624.homework.fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 25.06.2017.
 */
public class Fibonacci {
    public static boolean isFibonacci(int a) {
        if (a > 0 && a < 1000000) { // not negative and OutOfMemoryError plug
            if (a == 1) {
                return true;
            }
            int[] arr = new int[a+1];
            arr[0] = 0;
            arr[1] = 1;

            for (int i = 2; i <= a; i++) {
                arr[i] = arr[i-2] + arr[i-1];
                if (arr[i] == a)
                    return true;
            }
        }
        return false;
    }

}
