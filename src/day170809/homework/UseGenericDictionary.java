package day170809.homework;

public class UseGenericDictionary {
    public static void main(String[] args) {
        Dictionary<String, String> d = new Dictionary<>();


        d.put("Pete", "New York");
        d.put("John", "Boston");
        d.put("Вася", "Москва");
        d.put("Петя", "Москва");

        System.out.println(d.get("Ann"));
        System.out.println(d.get("John"));
        System.out.println(d.get("Вася"));

        d.put("Вася", "Петербург");
        System.out.println(d.get("Вася"));


        System.out.println();
        for (Dictionary.Pair pair : d) {
            System.out.println(pair.key + " : " + pair.value);
        }

        System.out.println("\n-- Integer, String --");

        Dictionary<Integer, String> d2 = new Dictionary<>();
        d2.put(1, "Sobaka");
        d2.put(11, "Sobaka2");
        d2.put(16, "Sobaka3");
        d2.put(3, "Sobaka4");

        System.out.println(d2.get(11));
        System.out.println(d2.get(14));
        System.out.println(d2.get(16));

        for (Dictionary.Pair pair : d2) {
            System.out.println(pair.key + " : " + pair.value);
        }

        System.out.println("\n-- Double, Boolean --");

        Dictionary<Double, Boolean> d3 = new Dictionary<>();
        d3.put(1.00, true);
        d3.put(1.1, false);
        d3.put(-4.16, true);
        d3.put(-134.42, false);

        System.out.println(d3.get(1.1));
        System.out.println(d3.get(-134.42));
        System.out.println(d3.get(1.00));
        System.out.println(d3.get(1.02));
        System.out.println("size = " + d3.size());

        for (Dictionary.Pair pair : d3) {
            System.out.println(pair.key + " : " + pair.value);
        }

        System.out.println("\n-- Float, Character --");

        Dictionary<Float, Character> d4 = new Dictionary<>();
        d4.put(1.21F, 'F');
        d4.put(-5.1212F, 'a');
        d4.put(2.11F, 'b');
        d4.put(-134.42F, 'W');

        System.out.println(d4.get(1.21F));
        System.out.println(d4.get(-1.12F));
        System.out.println(d4.get(2.11F));
        System.out.println(d4.get(-134.42F));
        System.out.println("size = " + d4.size());
        d4.put(1.1F, 'E');
        System.out.println("size = " + d4.size());

        for (Dictionary.Pair pair : d4) {
            System.out.println(pair.key + " : " + pair.value);
        }
    }
}
