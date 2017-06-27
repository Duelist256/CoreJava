package day170624.lesson.minmax;

import day170624.mytestframework.Asserts;

import java.util.ArrayList;

/**
 * Created by Duelist on 24.06.2017.
 */
public class MinMaxTest {
    public static void main(String[] args) {
        // max() tests
        ArrayList.class.getName();
        System.out.println(Asserts.assertEquals(MinMax.max(20, 30), 30));
        System.out.println(Asserts.assertEquals(MinMax.max(10, 20), 20));
        System.out.println(Asserts.assertEquals(MinMax.max(10, 10), 10));
        System.out.println(Asserts.assertEquals(MinMax.max(-10, -5), -5));

        System.out.println(Asserts.assertEquals(MinMax.max(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));
        System.out.println(Asserts.assertEquals(MinMax.max(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE));

        System.out.println(Asserts.assertNotEquals(MinMax.max(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));
        System.out.println(Asserts.assertNotEquals(MinMax.max(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MIN_VALUE));

        System.out.println(Asserts.assertEquals(MinMax.max(20, 10), 20));
        System.out.println(Asserts.assertEquals(MinMax.max(20, 10), 20));
        System.out.println(Asserts.assertEquals(MinMax.max(-5, -10), -5));

        System.out.println(Asserts.assertNotEquals(MinMax.max(20, 10), 10));
        System.out.println(Asserts.assertNotEquals(MinMax.max(-10, 10), -10));

        // min() tests
        System.out.println(Asserts.assertEquals(MinMax.min(20, 10), 10));
        System.out.println(Asserts.assertNotEquals(MinMax.min(20, 10), 20));

        System.out.println(Asserts.assertEquals(MinMax.min(10, 20), 10));
        System.out.println(Asserts.assertNotEquals(MinMax.min(10, 20), 20));

        System.out.println(Asserts.assertEquals(MinMax.min(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MIN_VALUE));
        System.out.println(Asserts.assertEquals(MinMax.min(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MIN_VALUE));

        System.out.println(Asserts.assertNotEquals(MinMax.min(Integer.MAX_VALUE, Integer.MIN_VALUE), Integer.MAX_VALUE));
        System.out.println(Asserts.assertNotEquals(MinMax.min(Integer.MIN_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE));

        System.out.println(Asserts.assertEquals(MinMax.min(-10, -20), -20));
        System.out.println(Asserts.assertNotEquals(MinMax.min(-10, -20), -10));

        System.out.println(Asserts.assertEquals(MinMax.min(-20, -10), -20));
        System.out.println(Asserts.assertNotEquals(MinMax.min(-20, -10), -10));
    }
}
