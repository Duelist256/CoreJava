package day170710.lesson.wrapperclasses;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by Duelist on 10.07.2017.
 */
public class WrapperClasses {

    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        HashMap<Object, Object> hashMap = new HashMap<>();

        table.put("Ivanov", "123-45-67");
        table.put(2, "123-45-67-67");
        System.out.println(table);
    }
}
