package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 13.07.2017.
 */
public class CountYZ {

    private static int countYZ(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (!Character.isLetter(str.charAt(i + 1))
                    && (Character.toLowerCase(str.charAt(i)) == 'y'
                    || Character.toLowerCase(str.charAt(i)) == 'z')) {
                count++;
            }
        }

        char lastChar = str.charAt(str.length() - 1);
        if (Character.toLowerCase(lastChar) == 'y'
                || Character.toLowerCase(lastChar) == 'z') {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
        System.out.println(countYZ("DAY abc XYZ"));
    }
}
