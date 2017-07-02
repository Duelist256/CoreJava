package day170701.homework.codingbat.logic1;

/**
 * Created by Duelist on 02.07.2017.
 */
public class WithoutDoubles {
    public static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles) {
            if (die1 == die2) {
                if (die1 == 6) {
                    return ++die1;
                }
                die1++;
                return die1 + die2;
            }
        }
        return die1 + die2;
    }

    public static void main(String[] args) {
        System.out.println(withoutDoubles(2, 3, true));
        System.out.println(withoutDoubles(3, 3, true));
        System.out.println(withoutDoubles(3, 3, false));
    }
}
