package day170726.linkedlistiterator;

import java.util.Iterator;

/**
 * Created by Duelist on 10.07.2017.
 */
public class StringLinkedList implements Iterable<String> {

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

//            Node current = StringLinkedList.this.first;
            Node nextNonProcessedNode = first;

            @Override
            public boolean hasNext() {
                return nextNonProcessedNode != null;
            }

            @Override
            public String next() {
                String result = nextNonProcessedNode.value;
                nextNonProcessedNode = nextNonProcessedNode.next;
                return result;
            }
        };
    }

    private static class  Node {
        String value;
        Node next;
        public Node (String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    Node first;
    Node last;
    int size;

    public void add(String value) {
        Node node = new Node(value, null);

        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
        }
        last = node;

        size++;
    }

    public boolean remove(String value) {

        boolean result = false;

        Node current = first;

        Node prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                if (prev == null) {
                    first = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                result = true;
                break;
            }
            prev = current;
            current = current.next;
        }

        if (first == null) {
            last = null;
        }

        return result;
    }

    public boolean remove(int index) {
        Node current = null;
        boolean result = false;

        if (index < size) {
            current = first;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }

        if (current != null) {
            result = remove(current.value);
        }
        return result;
    }

    @Override
    public String toString() {
        // traverse
        StringBuilder sb = new StringBuilder("[");

        if (first != null) {
            sb.append(first.value);

            Node current = first.next;

            while (current != null) {
                sb.append(", ").append(current.value);
                current = current.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
