package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class CountHi {

    private static int countHi(String str) {
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == 'h'
                    && str.charAt(i) == 'i') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
    }
}
