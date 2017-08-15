package day170809.homework;

/**
 * Created by Duelist on 15.08.2017.
 */
public class UseDictionaryWithResize {
    public static void main(String[] args) {
        Dictionary<String, String> d = new Dictionary<>();

        for (int i = 0; i < 1000; i++) {
            d.put("key " + i, "value " + i);
        }

        System.out.println(d.size());
        for (int i = 0; i < 1000; i++) {
            System.out.println(d.get("key " + i));
        }
    }
}
