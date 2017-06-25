package day170624.lesson.fizzBuzz;

/**
 * Created by Duelist on 24.06.2017.
 */
public class FizzBuzz {

    public static String fizzBuzz(int i) {
        String result = "";

        if (i % 3 == 0) {
            result += "Fizz";
        }

        if (i % 5 == 0) {
            result += "Buzz";
        }

        return "".equals(result) ? result + i: result;
    }

}
