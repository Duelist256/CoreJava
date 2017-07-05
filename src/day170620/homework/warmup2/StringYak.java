package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class StringYak {
    private static String stringYak(String str) {
        return str.replace("yak", "");
    }

    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }
}
