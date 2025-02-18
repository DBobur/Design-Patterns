package collection;

import java.util.*;

public class MapPerformanceTest {
    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();

        int size = 1_000_000;
        long start, end;

        // HashMap put test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.put(i, i);
        }
        end = System.nanoTime();
        System.out.println("HashMap put: " + (end - start) / 1_000_000.0 + " ms");

        // TreeMap put test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.put(i, i);
        }
        end = System.nanoTime();
        System.out.println("TreeMap put: " + (end - start) / 1_000_000.0 + " ms");

        // HashMap get test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.get(i);
        }
        end = System.nanoTime();
        System.out.println("HashMap get: " + (end - start) / 1_000_000.0 + " ms");

        // TreeMap get test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeMap.get(i);
        }
        end = System.nanoTime();
        System.out.println("TreeMap get: " + (end - start) / 1_000_000.0 + " ms");
    }
}

