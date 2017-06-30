package day170629.lesson.examples;

/**
 * Created by Duelist on 29.06.2017.
 */
public class A {

    static final int MAX = 10;

    static  String x = init();

    public static String init() {
        System.out.println("init");
        return "hello";
    }

    static {
        System.out.println("init 2");
    }

    public void m() {
        System.out.println("lol");
    }

}
