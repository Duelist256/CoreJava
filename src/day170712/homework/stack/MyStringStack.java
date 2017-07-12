package day170712.homework.stack;

/**
 * Created by Duelist on 12.07.2017.
 */
public class MyStringStack {

    private static final int DEFAULT_SIZE = 10;
    private final String[] elements;
    private int size = 0;

    public MyStringStack() {
        elements = new String[DEFAULT_SIZE];
    }

    public MyStringStack(int size) {
        elements = new String[size];
    }

    public boolean push(String elem) {
        if (size >= elements.length) {
            return false;
        }
        elements[size++] = elem;
        return true;
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
        return size <= 0 ? null : elements[size - 1];
    }
}
