package day170707.homework.string;

import day170624.mytestframework.Asserts;

/**
 * Created by Duelist on 08.07.2017.
 */
public class MyStringTest {

    public static void main(String[] args) {
        String string1 = "   Hello ";
        String string2 = "Hello"; // trimmed
        String string3 = "  Hello";
        String string4 = "Hello  ";
        String string5 = "He l l o  ";
        String string6 = "";

        System.out.println(Asserts.assertEquals(MyString.trim(string6), string6));
        System.out.println(Asserts.assertEquals(MyString.trim(string2), string2));
    }
}
