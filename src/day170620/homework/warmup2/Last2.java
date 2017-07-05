package day170620.homework.warmup2;

/**
 * Created by Duelist on 26.06.2017.
 */
public class Last2 {
    private static int last2(String str) {
        int strLength = str.length();
        if (strLength > 2) {
            String last = str.substring(strLength - 2, strLength);
            String findStr = str.substring(0, strLength - 1);

            int index = 0;
            int count = 0;
            for (int i = 0; i < findStr.length(); i++) {
                index = findStr.indexOf(last, index);
                if (index != -1) {
                    count++;
                    index++;
                } else {
                    return count;
                }
            }
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
        System.out.println(last2("xxxx"));
        System.out.println(last2("q"));
        System.out.println(last2(""));
    }
}
