package day170706.homework.codingbat.string3;

/**
 * Created by Duelist on 13.07.2017.
 */
public class MaxBlock {

    private static int maxBlock(String str) {

        if (str.length() == 0) {
            return 0;
        }

        int maxBlock = 1;
        int count = 1;
        char current = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (current != str.charAt(i)) {
                current = str.charAt(i);
                if (count > maxBlock) {
                    maxBlock = count;
                }
                count = 1;
            } else {
                count++;
            }
        }
        return maxBlock;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("xyzz"));
        System.out.println(maxBlock("abbCCCddBBBxx"));
        System.out.println(maxBlock("hoopla"));
        System.out.println(maxBlock("h"));
        System.out.println(maxBlock(""));
    }
}
