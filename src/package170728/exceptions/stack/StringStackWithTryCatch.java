package package170728.exceptions.stack;

import java.util.Arrays;


public class StringStackWithTryCatch {

    private static final int DEFAULT_SIZE = 10;
    private final String[] elements;
    private int size = 0;

    public StringStackWithTryCatch() {
        elements = new String[DEFAULT_SIZE];
    }

    public StringStackWithTryCatch(int size) {
        elements = new String[size];
    }

    public boolean push(String elem) {
        try {
            elements[size++] = elem;
            return true;
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            return false;
        }
    }

    public String pop() {
        if (size <= 0) {
            return "null";
        }
        String result = elements[--size];
        elements[size] = null;
        return result;
    }

    public String peek() {
        return size <= 0 ? "null" : elements[size - 1];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
