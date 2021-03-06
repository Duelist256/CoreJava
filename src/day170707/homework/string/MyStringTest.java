package day170707.homework.string;

import day170624.mytestframework.Asserts;

/**
 * Created by Duelist on 08.07.2017.
 */
public class MyStringTest {

    public static void main(String[] args) {

        /*
        * trim() test
        */

        String string1 = "   Hello ";
        String string2 = "Hello"; // trimmed
        String string3 = "  Hello";
        String string4 = "Hello  ";
        String string5 = "He l l o  ";
        String string6 = "";

        // check empty string
        System.out.println(Asserts.assertEquals(MyString.trim(string6), string6));

        // check trimmed string
        System.out.println(Asserts.assertEquals(MyString.trim(string2), string2));

        // check string with right side white spaces
        System.out.println(Asserts.assertEquals(MyString.trim(string5), "He l l o"));
        System.out.println(Asserts.assertEquals(MyString.trim(string4), string4.trim()));

        // check string with left side white spaces
        System.out.println(Asserts.assertEquals(MyString.trim(string3), string2));

        // check string with both side white spaces
        System.out.println(Asserts.assertEquals(MyString.trim(string1), string2));
        System.out.println(Asserts.assertEquals(MyString.trim("    k     "), "k"));

        // some other tests
        System.out.println(Asserts.assertEquals(MyString.trim("    "), ""));
        System.out.println(Asserts.assertEquals(MyString.trim("  \n\n  "), ""));
        System.out.println(Asserts.assertEquals(MyString.trim("  \t\n  "), ""));
        System.out.println(Asserts.assertEquals(MyString.trim("  \r\n  "), ""));
        System.out.println(Asserts.assertEquals(MyString.trim("  \n  \r"), ""));

        /*
        * replace() test
        */

        String string = "hehehe";
        System.out.println(Asserts.assertEquals(MyString.replace(string, "he", "ha"), "hahaha"));

        string = "kekekekekekekeke";
        System.out.println(Asserts.assertEquals(MyString.replace(string, "ke", "ol"), "olololololololol"));

        string = "";
        System.out.println(Asserts.assertEquals(MyString.replace(string, "", "hello"), "hello"));
        System.out.println(Asserts.assertEquals(MyString.replace(string, "", "5"), "5"));

        string = "hello";
        System.out.println(Asserts.assertEquals(MyString.replace(string, "", "|"), "|h|e|l|l|o|"));
        string = "world";
        System.out.println(Asserts.assertEquals(MyString.replace(string, "", "|"), "|w|o|r|l|d|"));

        System.out.println(Asserts.assertEquals(MyString.replace(string, string, ""), ""));

        string = " a a a a";
        System.out.println(Asserts.assertEquals(MyString.replace(string, " ", "h"), "hahahaha"));
        string = "        ";
        System.out.println(Asserts.assertEquals(MyString.replace(string, "  ", "he"), "hehehehe"));

        string = null;
        System.out.println(Asserts.assertEquals(MyString.replace(string, "  ", "he"), "null"));
    }
}
