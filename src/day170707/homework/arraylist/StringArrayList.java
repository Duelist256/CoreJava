package day170707.homework.arraylist;

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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        if (elements == null) {
            return "null";
        }

        if (elements.length > 1 && elements[0] != null) {
            sb.append(elements[0]);
        }

        for (int i = 1; i < elements.length; i++) {
            if (elements[i] != null) {
                sb.append(", ").append(elements[i]);
            }
        }

        sb.append("]");
        return sb.toString();
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
