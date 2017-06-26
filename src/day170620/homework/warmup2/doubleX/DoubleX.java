package day170620.homework.warmup2.doubleX;

/**
 * Created by Duelist on 26.06.2017.
 */
public class DoubleX {
    private static boolean doubleX(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == 'x'){
                return str.charAt(i) == 'x';
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleX("xaxxx"));
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }
}
