package day170701.homework.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class FizzString {
    public static String fizzString(String str) {
        String newStr = "";
        if (str.charAt(0) == 'f') {
            newStr += "Fizz";
        }
        if (str.charAt(str.length() - 1) == 'b') {
            newStr += "Buzz";
        }
        return "".equals(newStr) ? newStr += str : newStr;
    }

    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
    }
}
