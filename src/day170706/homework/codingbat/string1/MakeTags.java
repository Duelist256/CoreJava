package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class MakeTags {

    private static String makeTags(String tag, String word) {
        String startTag = "<" + tag + ">";
        String endTag = "</" + tag + ">";
        return startTag + word + endTag;
    }


    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
        System.out.println(makeTags("i", "Hello"));
        System.out.println(makeTags("cite", "Yay"));
    }
}
