package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 26.08.2017.
 */
public class RightDigit {

    public static List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(93);

        list = rightDigit(list);

        System.out.println(list);
    }
}
