package day170706.homework.codingbat.string2;

/**
 * Created by Duelist on 11.07.2017.
 */
public class WordEnds {

    private static String wordEnds(String str, String word) {
        StringBuilder newString = new StringBuilder();

        int index = 0;
        do {
            index = str.indexOf(word, index);

            if (index == -1) {
                break;
            }

            if (index - 1 >= 0) {
                newString.append(str.charAt(index - 1));
            }

            if (index + word.length() < str.length()) {
                newString.append(str.charAt(index + word.length()));
            }

            index++;
        } while (true);

        return newString.toString();
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }
}
