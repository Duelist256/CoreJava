package day170627.homework;

import day170624.mytestframework.Asserts;

/**
 * Created by Duelist on 27.06.2017.
 */
public class MyIntegerTest {
    public static void main(String[] args) {
        System.out.println("toBinaryString() test:");
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(10), Integer.toBinaryString(10)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(11), Integer.toBinaryString(11)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(Integer.MAX_VALUE), Integer.toBinaryString(Integer.MAX_VALUE)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(-10), Integer.toBinaryString(-10)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(-12222220), Integer.toBinaryString(-10)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(Integer.MIN_VALUE), Integer.toBinaryString(Integer.MIN_VALUE)));

        System.out.println("toString() test");
        System.out.println("base 2 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(10, 2), Integer.toString(10, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-10, 2), Integer.toString(-10, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 2), Integer.toString(Integer.MAX_VALUE, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 2), Integer.toString(Integer.MIN_VALUE, 2)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(11, 2), Integer.toString(10, 2)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-10, 2), Integer.toString(-11, 2)));

        System.out.println("base 8 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(10, 8), Integer.toString(10, 8)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-10, 8), Integer.toString(-10, 8)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 8), Integer.toString(Integer.MAX_VALUE, 8)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 8), Integer.toString(Integer.MIN_VALUE, 8)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(11, 8), Integer.toString(10, 8)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-10, 8), Integer.toString(-11, 8)));

        System.out.println("base 16 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(18, 16), Integer.toString(18, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-18, 16), Integer.toString(-18, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 16), Integer.toString(Integer.MAX_VALUE, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 16), Integer.toString(Integer.MIN_VALUE, 16)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(19, 16), Integer.toString(18, 16)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-18, 16), Integer.toString(-19, 16)));

        System.out.println("base 35 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(18, 16), Integer.toString(18, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-18, 16), Integer.toString(-18, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 16), Integer.toString(Integer.MAX_VALUE, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 16), Integer.toString(Integer.MIN_VALUE, 16)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(19, 16), Integer.toString(18, 16)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-18, 16), Integer.toString(-19, 16)));
        System.out.println();
    }
}
