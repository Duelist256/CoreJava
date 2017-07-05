package day170620.homework.warmup1;

/**
 * Created by Duelist on 24.06.2017.
 */
public class StringE {
    private static boolean stringE(String str) {
        int eCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') eCount++;
        }
        return eCount >= 1 && eCount <= 3;
    }

    public static void main(String[] args) {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }
}
