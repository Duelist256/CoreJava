package day170624.homework.sign;

/**
 * Created by Duelist on 25.06.2017.
 */
public class Sign {
    public static int sign(int i) {
        if (i > 0) {
            return 1;
        }
        if (i < 0) {
            return -1;
        }
        return 0;
    }
}
