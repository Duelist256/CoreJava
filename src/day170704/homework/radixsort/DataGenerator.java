package day170704.homework.radixsort;

import java.util.Random;

/**
 * Created by Duelist on 29.06.2017.
 */
public class DataGenerator {
    //static final int[] NUMERALS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    static public int[] generate(int size) {
        int[] data = new int[size];

        Random random = new Random();

        int letterIndex = 0;
        for (int i = 0; i < data.length; i++) {
            //letterIndex = ;
            data[i] = Math.abs(random.nextInt());
        }

        return data;
    }
}
