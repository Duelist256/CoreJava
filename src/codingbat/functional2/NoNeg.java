package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 27.08.2017.
 */
public class NoNeg {

    public static List<Integer> noNeg(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);

        System.out.println(noNeg(list));
    }
}
