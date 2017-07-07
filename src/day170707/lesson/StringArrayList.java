package day170707.lesson;

import java.util.Arrays;

/**
 * Created by Duelist on 07.07.2017.
 */
public class StringArrayList {

    private static final int DEFAULT_SIZE = 2;

    String[] elements = new String[DEFAULT_SIZE];

    int size = 0;


    public void add(String string) {

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = string;
    }

    // TODO
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            return;
        }

        System.arraycopy(elements, index + 1, elements, index, --size - index);
//        size--;
        elements[size] = null;
    }

}
