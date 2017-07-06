package day170706.homework.codingbat.string1;

/**
 * Created by Duelist on 06.07.2017.
 */
public class StartWord {

    private static String startWord(String str, String word) {
        int wordLength = word.length();

        if (str.length() >= wordLength
                && str.substring(1, wordLength).equals(word.substring(1, wordLength))) {
            return str.substring(0, wordLength);
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(startWord("hippo", "hi"));
        System.out.println(startWord("hippo", "xip"));
        System.out.println(startWord("hippo", "i"));
    }
}
