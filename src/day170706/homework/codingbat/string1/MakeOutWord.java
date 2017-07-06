package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class MakeOutWord {

    private static String makeOutWord(String out, String word) {
        String firstHalf = out.substring(0, out.length() / 2);
        String lastHalf = out.substring(out.length() / 2, out.length());
        return firstHalf + word + lastHalf;
    }

    public static void main(String[] args) {
        System.out.println(makeOutWord("<<>>", "Yay"));
        System.out.println(makeOutWord("<<>>", "WooHoo"));
        System.out.println(makeOutWord("[[]]", "word"));
    }
}
