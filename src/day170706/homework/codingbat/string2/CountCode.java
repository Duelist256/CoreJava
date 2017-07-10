package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 10.07.2017.
 */
public class CountCode {

    private static int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o'
                    && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
    }
}
