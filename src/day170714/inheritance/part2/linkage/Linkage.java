package day170714.inheritance.part2.linkage;

/**
 * Created by Duelist on 14.07.2017.
 */
public class Linkage {

    public static void main(String[] args) {
        int[] a = {0, 1, 2, 3};
        int result = process(a);
        String string;
    }

    private static int process(int[] a) {
        int sum = 0;

        for (int value : a) {
            sum += value;
        }
        return sum;
    }

}
