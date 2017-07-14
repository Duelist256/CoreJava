package day170714.inheritance.part2.finalexamples;

/**
 * Created by Duelist on 14.07.2017.
 */
public class FinalExamples {
    public static void main(String[] args) {
        int x = 10;
        process(x);
        System.out.println(x);

        String s = "str";
        makeNull(s);
        System.out.println(s);
    }

    private static void makeNull(Object o) {
        o = null;
    }

    private static void process(final int x) {
        // x += 10;     forbidden
    }
}