package day170620.homework.warmup2.countxx;

/**
 * Created by Duelist on 26.06.2017.
 */
public class CountXX {
    private static int countXX(String str) {
        int count = 0;
        int strLength = str.length();

        for (int i = 1; i < strLength; i++) {
            if ("xx".equals(str.substring(i-1, i+1))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }
}
