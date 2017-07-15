package day170704.homework.codingbat.array3;

import java.util.Arrays;

/**
 * Created by Duelist on 12.07.2017.
 */
public class SeriesUp {

    private static int[] seriesUp(int n) {
        int[] newArray = new int[n * (n + 1) / 2];

        for (int i = n; i > 0; i--) {
            int index = i * (i + 1) / 2 - 1;

            for (int j = index, k = i; j > index - i; j--, k--) {
                newArray[j] = k;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));
        System.out.println(Arrays.toString(seriesUp(4)));
        System.out.println(Arrays.toString(seriesUp(2)));
    }
}
