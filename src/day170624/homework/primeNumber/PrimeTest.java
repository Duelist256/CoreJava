package day170624.homework.primeNumber;

import day170624.lesson.fizzBuzz.SimpleUnit;

/**
 * Created by Duelist on 25.06.2017.
 */
public class PrimeTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(2), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(5), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(4), false));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(32), false));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(7), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(-5), false));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(32), false));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(31), true));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(0), false));
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(Integer.MAX_VALUE), true));    // too slow execution
        System.out.println(SimpleUnit.assertEquals(Prime.isPrime(Integer.MIN_VALUE), false));   // nearby 1 sec

        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(-5), true));
        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(5), false));
        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(4), true));
        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(31), false));
        System.out.println(SimpleUnit.assertNotEquals(Prime.isPrime(0), true));
    }
}
