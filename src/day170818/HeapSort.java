package day170818;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("elem9");
        list.add("elem5");
        list.add("elem3");
        list.add("elem0");
        list.add("elem2");
        list.add("elem1");

        List<String> sorted = heapSort(list);
        System.out.println(sorted);
    }

    private static List<String> heapSort(List<String> list) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        for (String string : list) {
            pq.add(string);
        }

        LinkedList<String> result = new LinkedList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }


        return result;
    }
}
