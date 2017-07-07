package day170707.lesson;

import day170624.mytestframework.Asserts;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Duelist on 07.07.2017.
 */
public class StringMethodsPractice {
    public static void main(String[] args) {
        String string1 = "   Hello ";
        String string2 = "Hello"; // trimmed
        String string3 = "  Hello";
        String string4 = "Hello  ";
        String string5 = "He l l o  ";
        String string6 = "";

        System.out.println(Asserts.assertEquals(trim(string6), string6));
        System.out.println(Asserts.assertEquals(trim(string2), string2));
        System.out.println(Asserts.assertEquals(trim(string4), string2));

        List<String> list = Arrays.asList("one", "two");
//        list.add("lol"); // UnsupportedOperationException
    }

    private static String trim(String str) {

        if (str == null || str.length() == 0) {
            return str;
        }

        if (str.indexOf(' ') != 0 && str.lastIndexOf(' ') != str.length() - 1) {
            return str;
        }

        // TODO

        return str;
    }
}
