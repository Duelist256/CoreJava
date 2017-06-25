package day170624.homework.sign;

import day170624.lesson.fizzBuzz.SimpleUnit;

/**
 * Created by Duelist on 25.06.2017.
 */
public class SignTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Sign.sign(5), 1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(-5), -1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(0), 0));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MAX_VALUE), 1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MIN_VALUE), -1));

        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(5), -1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(5), 0));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0), 1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0), -1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-1), 1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-1), 0));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MAX_VALUE), -1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MAX_VALUE), 0));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MIN_VALUE), 1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(Integer.MIN_VALUE), 0));

    }
}
