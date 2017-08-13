package day170809.homework.test;

public class BenchmarkingOfDictionary {
    public static void main(String[] args) {
        System.out.println("-== Test 3 and 1000 ==-");

        DictionaryWithSize<Integer, String> dictionary1 = new DictionaryWithSize<>();
        DictionaryWithSize<Integer, String> dictionary2 = new DictionaryWithSize<>(1000);

        System.out.println("Put with default size = 3");
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            dictionary1.put(i, "elem" + i);
        }
        long stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");

        System.out.println();

        System.out.println("Put with size = 1000");
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            dictionary2.put(i, "elem" + i);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");

        System.out.println();

        System.out.println("Get with default size = 3");
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            dictionary1.get(i);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");

        System.out.println();

        System.out.println("Get with size = 1000");
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            dictionary2.get(i);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");


        System.out.println("\n-== Test 1000 and 10000 ==-");
        
        DictionaryWithSize<Integer, String> dictionary3 = new DictionaryWithSize<>(1000);
        DictionaryWithSize<Integer, String> dictionary4 = new DictionaryWithSize<>(10000);


        System.out.println("Put with size = 1000");
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            dictionary3.put(i, "elem" + i);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");

        System.out.println();

        System.out.println("Put with size = 10000");
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            dictionary4.put(i, "elem" + i);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");

        System.out.println();

        System.out.println("Get with size = 1000");
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            dictionary3.get(i);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");

        System.out.println();

        System.out.println("Get with size = 10000");
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            dictionary4.get(i);
        }
        stop = System.nanoTime();
        System.out.println("Time elapsed = " + (stop - start) + " ns");
    }
}
