package day170704.homework.codingbat.array3;

/**
 * Created by Duelist on 08.07.2017.
 */
public class LinearIn {

    private static boolean linearIn(int[] outer, int[] inner) {

        if (inner.length < 1) {
            return true;
        }

        if (outer.length >= inner.length) {
            for (int i = 0, j = 0; i < outer.length; i++) {

                if (inner[j] < outer[i]) {
                    return false;
                }

                if (inner[j] == outer[i]) {
                    j++;
                }


                if (j == inner.length) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] outer = new int[]{1, 2, 4, 6};
        int[] inner = new int[]{2, 4};
        System.out.println(linearIn(outer, inner));
        inner = new int[]{2, 3, 4};
        System.out.println(linearIn(outer, inner));
        outer = new int[]{1, 2, 4, 4, 6};
        inner = new int[]{2, 4};
        System.out.println(linearIn(outer, inner));
        outer = new int[]{2, 2, 2, 2, 4};
        System.out.println(linearIn(outer, inner));
    }
}
