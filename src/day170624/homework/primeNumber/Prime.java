package day170624.homework.primeNumber;

/**
 * Created by Duelist on 25.06.2017.
 */
public class Prime {
    public static boolean isPrime(int a) {
        if (a > 0) {
            int count = 0;
            for (int i = 2; i <= a/2; i+=2) {
                if (a % i == 0) {
                    count++;
                }
            }
            return count < 1;
        }
        return false;
    }
}
