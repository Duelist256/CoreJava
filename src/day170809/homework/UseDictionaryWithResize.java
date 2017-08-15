package day170809.homework;

/**
 * Created by Duelist on 15.08.2017.
 */
public class UseDictionaryWithResize {
    public static void main(String[] args) {
        int count = 1000;

        Dictionary<String, String> d1 = new Dictionary<>();

        System.out.println("- 1000 elements");
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            d1.put("key " + i, "value " + i);
        }
        long stop = System.nanoTime();
        System.out.println("Put. Time elapsed " + (stop - start));

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            d1.get("key " + i);
        }
        stop = System.nanoTime();
        System.out.println("Get. Time elapsed " + (stop - start));

        Dictionary<String, String> d2 = new Dictionary<>();
        count = 10000;

        System.out.println("- 10000 elements");
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            d2.put("key " + i, "value " + i);
        }
        stop = System.nanoTime();
        System.out.println("Put. Time elapsed " + (stop - start));

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            d2.get("key " + i);
        }
        stop = System.nanoTime();
        System.out.println("Get. Time elapsed " + (stop - start));

        Dictionary<String, String> d3 = new Dictionary<>();
        count = 100000;

        System.out.println("- 100000 elements");
        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            d3.put("key " + i, "value " + i);
        }
        stop = System.nanoTime();
        System.out.println("Put. Time elapsed " + (stop - start));

        start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            d3.get("key " + i);
        }
        stop = System.nanoTime();
        System.out.println("Get. Time elapsed " + (stop - start));
    }
}
