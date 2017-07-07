package day170707.lesson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Duelist on 07.07.2017.
 */
public class CollectionsExamples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");

        List<String> unmodifiableCollection = Collections.unmodifiableList(list);
//        unmodifiableCollection.add("lol"); // UnsupportedOperationException
//        unmodifiableCollection.set(0, "ONE"); // UnsupportedOperationException
    }
}
