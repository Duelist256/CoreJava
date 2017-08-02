package day170802.generics.stack;

import java.util.Arrays;

public class Stack<E> {

    private static final int DEFAULT_MAX_SIZE = 3;
    private final E[] elements;
    private int size;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        elements = (E[]) new Object[maxSize];
        size = 0;
    }


    public boolean push(E element) {
        if (size >= elements.length) { // guard condition
            return false;              // stack overflow
        }
        elements[size++] = element;
        return true;
    }

    public E pop() {
        if (size <= 0) { // guard condition
            return null; // stack underflow
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public int size() {
        return size;
    }

    public E tos() {
        return size <= 0 ? null : elements[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
