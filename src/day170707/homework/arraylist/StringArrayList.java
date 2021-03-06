package day170707.homework.arraylist;

import java.util.Arrays;

/**
 * Created by Duelist on 07.07.2017.
 */
public class StringArrayList {

    private static final int DEFAULT_SIZE = 2;

    private String[] elements = new String[DEFAULT_SIZE];

    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    public void add(String string) {

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = string;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            return;
        }

        System.arraycopy(elements, index + 1, elements, index, --size - index);
//        size--;
        elements[size] = null;
    }

    public void remove(String value) {
        int index = -1;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(value)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            this.remove(index);
        }
    }

    public void set(int index, String value) {
        if (index < elements.length && index >= 0) {
            elements[index] = value;
        }
    }

    public String get(int index) {
        if (index < elements.length && index >= 0) {
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
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
}
