package day170620.homework.warmup1.startOz;

/**
 * Created by Duelist on 24.06.2017.
 */
public class StartOz {
    private static String startOz(String str) {
        String newString = "";
        int strLength = str.length();
        if (strLength >= 1 && str.charAt(0) == 'o') {
            newString += 'o';
        }

        if (strLength >= 2 && str.charAt(1) == 'z')
            newString += 'z';

        return newString;
    }

    public static void main(String[] args) {
        System.out.println(startOz("ozymandias"));
        System.out.println(startOz("bzoo"));
        System.out.println(startOz("oxx"));
    }
}
