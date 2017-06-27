package day170624.homework.primenumber;

import day170624.mytestframework.Asserts;

/**
 * Created by Duelist on 25.06.2017.
 */
public class PrimeTest {
    public static void main(String[] args) {
        System.out.println(Asserts.assertEquals(Prime.isPrime(1), false));
        System.out.println(Asserts.assertEquals(Prime.isPrime(2), true));
        System.out.println(Asserts.assertEquals(Prime.isPrime(5), true));
        System.out.println(Asserts.assertEquals(Prime.isPrime(4), false));
        System.out.println(Asserts.assertEquals(Prime.isPrime(32), false));
        System.out.println(Asserts.assertEquals(Prime.isPrime(7), true));
        System.out.println(Asserts.assertEquals(Prime.isPrime(-5), false));
        System.out.println(Asserts.assertEquals(Prime.isPrime(32), false));
        System.out.println(Asserts.assertEquals(Prime.isPrime(31), true));
        System.out.println(Asserts.assertEquals(Prime.isPrime(0), false));
        System.out.println(Asserts.assertEquals(Prime.isPrime(Integer.MAX_VALUE), true));    // too slow execution
        System.out.println(Asserts.assertEquals(Prime.isPrime(Integer.MIN_VALUE), false));   // nearby 1 sec

        System.out.println(Asserts.assertNotEquals(Prime.isPrime(1), true));
        System.out.println(Asserts.assertNotEquals(Prime.isPrime(-5), true));
        System.out.println(Asserts.assertNotEquals(Prime.isPrime(5), false));
        System.out.println(Asserts.assertNotEquals(Prime.isPrime(4), true));
        System.out.println(Asserts.assertNotEquals(Prime.isPrime(31), false));
        System.out.println(Asserts.assertNotEquals(Prime.isPrime(0), true));
    }
}
