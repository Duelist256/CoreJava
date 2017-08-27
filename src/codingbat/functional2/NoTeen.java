package codingbat.functional2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 27.08.2017.
 */
public class NoTeen {

    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(19);
        list.add(20);

        System.out.println(noTeen(list));
    }
}
