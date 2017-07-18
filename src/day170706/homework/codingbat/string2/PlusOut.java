package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 12.07.2017.
 */
public class PlusOut {

    private static String plusOut(String str, String word) {
        String newString = "";
        int wordLen = word.length();
        
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - wordLen + 1 && str.substring(i, i + wordLen).equals(word)) {
                newString += word;
                i += wordLen - 1;
            } else {
                newString += '+';
            }
        }
        return newString;

    }

    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
        System.out.println(plusOut("123123", "3"));
    }
}
