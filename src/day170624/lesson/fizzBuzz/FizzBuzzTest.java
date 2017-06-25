package day170624.lesson.fizzBuzz;

/**
 * Created by Duelist on 24.06.2017.
 */
public class FizzBuzzTest {

    public static void main(String[] args) {
        System.out.println(day170624.lesson.fizzBuzz.SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(3), "Fizz"));
        System.out.println(day170624.lesson.fizzBuzz.SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(5), "Buzz"));
        System.out.println(day170624.lesson.fizzBuzz.SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
        System.out.println(day170624.lesson.fizzBuzz.SimpleUnit.assertEquals(FizzBuzz.fizzBuzz(17), "17"));


        System.out.println(day170624.lesson.fizzBuzz.SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(3), "Buzz"));
        System.out.println(day170624.lesson.fizzBuzz.SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
        System.out.println(day170624.lesson.fizzBuzz.SimpleUnit.assertNotEquals(FizzBuzz.fizzBuzz(15), "FizzBuzz"));
    }
}
