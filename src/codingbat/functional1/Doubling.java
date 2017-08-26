package codingbat.functional1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 26.08.2017.
 */
public class Doubling {
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list = doubling(list);

        System.out.println(list);
    }
}
