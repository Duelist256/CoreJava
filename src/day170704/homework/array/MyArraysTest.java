package day170704.homework.array;

import day170624.mytestframework.Asserts;

import java.util.Arrays;

/**
 * Created by Duelist on 05.07.2017.
 */

public class MyArraysTest {
    public static void main(String[] args) {
        System.out.println(Asserts.assertEquals(MyArrays.toString(new String[]{"one", "two", "three"}),
                Arrays.toString(new String[]{"one", "two", "three"})));
        System.out.println(Asserts.assertEquals(MyArrays.toString(new String[]{"33", "444", "555", "777", "53"}),
                Arrays.toString(new String[]{"33", "444", "555", "777", "53"})));
        System.out.println(Asserts.assertEquals(MyArrays.toString(new String[]{}),
                Arrays.toString(new String[]{})));

        String[] string = null;
        System.out.println(Asserts.assertEquals(MyArrays.toString(string),
                Arrays.toString(string)));

        System.out.println(Asserts.assertNotEquals(MyArrays.toString(new String[]{"one", "two", "three", "four", "five"}),
                Arrays.toString(new String[]{"five", "four", "three", "two", "one"})));
        System.out.println(Asserts.assertNotEquals(MyArrays.toString(new String[]{}),
                Arrays.toString(new String[]{" "})));
        System.out.println(Asserts.assertNotEquals(MyArrays.toString(new String[]{"3", "444", "555", "777", "53"}),
                Arrays.toString(new String[]{"33", "444", "555", "77", "53"})));
    }
}
