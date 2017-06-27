package day170624.lesson.fizzbuzz;

import day170624.mytestframework.Asserts;

/**
 * Created by Duelist on 24.06.2017.
 */
public class FizzBuzzTest {

    public static void main(String[] args) {
        System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(3), "Fizz"));
        System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(5), "Buzz"));
        System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
        System.out.println(Asserts.assertEquals(FizzBuzz.fizzBuzz(17), "17"));


        System.out.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(3), "Buzz"));
        System.out.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
        System.out.println(Asserts.assertNotEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
    }
}
