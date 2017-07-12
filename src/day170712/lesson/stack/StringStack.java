package day170712.lesson.stack;

import java.util.Arrays;

/**
 * Created by Duelist on 12.07.2017.
 */
public class StringStack {

    private static final int DEFAULT_MAX_SIZE = 3;
    private final String[] elements;
    private int size;

    public StringStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public StringStack(int maxSize) {
        elements = new String[maxSize];
        size = 0;
    }


    public boolean push(String string) {
        if (size >= elements.length) { // guard condition
            return false;              // stack overflow
        }
        elements[size++] = string;
        return true;
    }

    public String pop() {
        if (size <= 0) { // guard condition
            return null; // stack underflow
        }
        String result = elements[--size];
        elements[size] = null;
        return result;
    }

    public int size() {
        return size;
    }

    public String tos() {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
