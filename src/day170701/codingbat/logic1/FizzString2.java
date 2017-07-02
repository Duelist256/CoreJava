package day170701.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class FizzString2 {
    public static String fizzString2(int n) {
        String str = "!";
        if (n % 5 == 0) {
            str = "Buzz" + str;
        }

        if (n % 3 == 0) {
            str = "Fizz" + str;
        }
        if (str.length() == 1) {
            return n + str;
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(fizzString2(1));
        System.out.println(fizzString2(2));
        System.out.println(fizzString2(3));
    }
}
