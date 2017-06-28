package day170627.homework;

import day170624.mytestframework.Asserts;

/**
 * Created by Duelist on 27.06.2017.
 */
public class MyIntegerTest {
    public static void main(String[] args) {
        System.out.println("toBinaryString() test:");
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(0), Integer.toBinaryString(0)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(10), Integer.toBinaryString(10)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(11), Integer.toBinaryString(11)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(Integer.MAX_VALUE), Integer.toBinaryString(Integer.MAX_VALUE)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(-10), Integer.toBinaryString(-10)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(-12222220), Integer.toBinaryString(-12222220)));
        System.out.println(Asserts.assertEquals(MyInteger.toBinaryString(Integer.MIN_VALUE), Integer.toBinaryString(Integer.MIN_VALUE)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toBinaryString(-1231), Integer.toBinaryString(-532)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toBinaryString(777), Integer.toBinaryString(34)));

        System.out.println("\ntoHexString() test:");
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(0), Integer.toHexString(0)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(1), Integer.toHexString(1)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(31), Integer.toHexString(31)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(522), Integer.toHexString(522)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(-522), Integer.toHexString(-522)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(-31), Integer.toHexString(-31)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(-35), Integer.toHexString(-35)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(Integer.MAX_VALUE), Integer.toHexString(Integer.MAX_VALUE)));
        System.out.println(Asserts.assertEquals(MyInteger.toHexString(Integer.MIN_VALUE), Integer.toHexString(Integer.MIN_VALUE)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toHexString(53320), Integer.toHexString(54312)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toHexString(-1231242), Integer.toHexString(-3421343)));

        System.out.println("\ntoOctString() test:");
        System.out.println(Asserts.assertEquals(MyInteger.toOctalString(0), Integer.toOctalString(0)));
        System.out.println(Asserts.assertEquals(MyInteger.toOctalString(5), Integer.toOctalString(5)));
        System.out.println(Asserts.assertEquals(MyInteger.toOctalString(9), Integer.toOctalString(9)));
        System.out.println(Asserts.assertEquals(MyInteger.toOctalString(Integer.MAX_VALUE), Integer.toOctalString(Integer.MAX_VALUE)));
        System.out.println(Asserts.assertEquals(MyInteger.toOctalString(-9), Integer.toOctalString(-9)));
        System.out.println(Asserts.assertEquals(MyInteger.toOctalString(-221), Integer.toOctalString(-221)));
        System.out.println(Asserts.assertEquals(MyInteger.toOctalString(-214748364), Integer.toOctalString(-214748364)));

        System.out.println("\ntoString() test");
        System.out.println("base 2 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(0, 2), Integer.toString(0, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(1, 2), Integer.toString(1, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(10, 2), Integer.toString(10, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-10, 2), Integer.toString(-10, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 2), Integer.toString(Integer.MAX_VALUE, 2)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 2), Integer.toString(Integer.MIN_VALUE, 2)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(11, 2), Integer.toString(10, 2)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-10, 2), Integer.toString(-11, 2)));

        System.out.println("base 3 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(0, 3), Integer.toString(0, 3)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(10, 3), Integer.toString(10, 3)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-10, 3), Integer.toString(-10, 3)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 3), Integer.toString(Integer.MAX_VALUE, 3)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 3), Integer.toString(Integer.MIN_VALUE, 3)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(11, 3), Integer.toString(10, 3)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-10, 3), Integer.toString(-11, 3)));

        System.out.println("base 8 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(0, 8), Integer.toString(0, 8)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(10, 8), Integer.toString(10, 8)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-10, 8), Integer.toString(-10, 8)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 8), Integer.toString(Integer.MAX_VALUE, 8)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 8), Integer.toString(Integer.MIN_VALUE, 8)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(11, 8), Integer.toString(10, 8)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-10, 8), Integer.toString(-11, 8)));

        System.out.println("base 16 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(0, 16), Integer.toString(0, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(18, 16), Integer.toString(18, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-18, 16), Integer.toString(-18, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 16), Integer.toString(Integer.MAX_VALUE, 16)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 16), Integer.toString(Integer.MIN_VALUE, 16)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(19, 16), Integer.toString(18, 16)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-18, 16), Integer.toString(-19, 16)));

        System.out.println("base 24 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(811, 24), Integer.toString(811, 24)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-811, 24), Integer.toString(-811, 24)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 24), Integer.toString(Integer.MAX_VALUE, 24)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 24), Integer.toString(Integer.MIN_VALUE, 24)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(219, 24), Integer.toString(218, 24)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-218, 24), Integer.toString(-219, 24)));
        System.out.println(MyInteger.toString(911, 24));
        System.out.println(Integer.toString(911, 24));

        System.out.println("base 35 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(651, 35), Integer.toString(651, 35)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(763, 35), Integer.toString(763, 35)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-76, 35), Integer.toString(-76, 35)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-81, 35), Integer.toString(-81, 35)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 35), Integer.toString(Integer.MAX_VALUE, 35)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 35), Integer.toString(Integer.MIN_VALUE, 35)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(830, 35), Integer.toString(793, 35)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(65, 35), Integer.toString(64, 35)));

        System.out.println("base 1 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(10, 1), Integer.toString(10, 1)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-10, 1), Integer.toString(-10, 1)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 1), Integer.toString(Integer.MAX_VALUE, 1)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 1), Integer.toString(Integer.MIN_VALUE, 1)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(11, 1), Integer.toString(10, 1)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-10, 1), Integer.toString(-11, 1)));

        System.out.println("base 36 test");
        System.out.println(Asserts.assertEquals(MyInteger.toString(8760, 36), Integer.toString(8760, 36)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(-2180, 36), Integer.toString(-2180, 36)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MAX_VALUE, 36), Integer.toString(Integer.MAX_VALUE, 36)));
        System.out.println(Asserts.assertEquals(MyInteger.toString(Integer.MIN_VALUE, 36), Integer.toString(Integer.MIN_VALUE, 36)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(1122, 36), Integer.toString(1021, 36)));
        System.out.println(Asserts.assertNotEquals(MyInteger.toString(-3120, 36), Integer.toString(-1111, 36)));
    }
}
