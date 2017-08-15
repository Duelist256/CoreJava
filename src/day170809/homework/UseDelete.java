package day170809.homework;

import day170809.homework.Dictionary;

/**
 * Created by Duelist on 15.08.2017.
 */
public class UseDelete {
    public static void main(String[] args) {
        Dictionary<String, String> d = new Dictionary<>();

        d.put("one", "London");
        d.put("two", "York");
        d.put("three", "Tallinn");
        d.put("four", "Paris");

        System.out.println(d.remove("one"));
        System.out.println(d.remove("four"));
        System.out.println(d.size());
        System.out.println(d.remove("three"));
        System.out.println(d.remove("three"));
        System.out.println(d.size());
        System.out.println(d.remove("two"));
        System.out.println(d.size());
    }
}
