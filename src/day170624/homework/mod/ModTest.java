package day170624.homework.mod;

import day170624.lesson.fizzBuzz.SimpleUnit;

/**
 * Created by Duelist on 25.06.2017.
 */
public class ModTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Mod.mod(17, 10), 7));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(10, 17), 10));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(13, 10), 3));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(10, 13), 10));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(23, 5), 3));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(5, 23), 5));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(Integer.MAX_VALUE, 23), 5));
        System.out.println(SimpleUnit.assertEquals(Mod.mod(Integer.MIN_VALUE, 23), -6));

        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(17, 5), 3));
        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(5, 17), 3));
        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(22, 4), 5));
        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(4, 22), 5));
        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(27, 8), 4));
        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(8, 27), 4));
        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(Integer.MAX_VALUE, 22), 5));
        System.out.println(SimpleUnit.assertNotEquals(Mod.mod(Integer.MIN_VALUE, 22), 5));
    }
}
