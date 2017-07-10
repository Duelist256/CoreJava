package day170710.lesson.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Duelist on 10.07.2017.
 */
public class WrapperProblems {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0); // list.add(new Integer(0));
        list.add(null);
        System.out.println(list);

        int x = list.remove(0);
        System.out.println(x);

        System.out.println(list.remove(0));
        System.out.println(list.remove(0));

        System.out.println("" + 'H' + 'a');
    }
}
