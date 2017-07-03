package day170701.homework.genome;

import day170629.homework.DataGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Duelist on 01.07.2017.
 */
public class GenomeWithSort {
    private static final int GENOME_SIZE = 21111;
    private static final int WORD_SIZE = 222;

    static class Word implements Comparable<Word> {
        byte[] data;
        int offset;

        public Word(byte[] data, int offset) {
            this.data = data;
            this.offset = offset;
        }

        @Override
        public int compareTo(Word otherWord) {
            for (int i = 0; i < WORD_SIZE; i++) {
                int diff = data[offset + i] - otherWord.data[otherWord.offset + i];
                if (diff != 0) {
                    return diff;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        byte[] data = DataGenerator.generate(GENOME_SIZE + WORD_SIZE);
        List<Word> list = new ArrayList<>();

        for (int i = 0; i < data.length - WORD_SIZE; i++) {
            list.add(new Word(data, i));
        }

        Collections.sort(list);

        // counting
        long startTime = System.nanoTime();
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            Word comparedWord = list.get(i);
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (comparedWord.compareTo(list.get(j)) == 0) {
                    count++;
                    //System.out.println(i + " and " + j);
                }
            }
        }
        long endTime = System.nanoTime();
        System.out.println("Time: " + (endTime - startTime) / 1000000 + " milliseconds");
        System.out.println("Total count is: " + count);

        // show all elements
//        for (Word word : list) {
//            byte[] wordBytes = Arrays.copyOfRange(data, word.offset,
//                    word.offset + WORD_SIZE);
//            System.out.println(Arrays.toString(wordBytes));
//        }
    }
}
