package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 14.07.2017.
 */
public class SumNumbers {

    private static int sumNumbers(String str) {
        int sum = 0;

        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                number = number * 10 + Character.getNumericValue(str.charAt(i));
            } else {
                sum += number;
                number = 0;
            }
        }

        if (number != 0) {
            sum += number;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(sumNumbers("7 11"));
    }
}
