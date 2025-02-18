package collection;

import java.util.*;

public class LinkedHashMapBenchmark {
    public static void main(String[] args) {
        int size = 10_000_000;
        long start, end;

        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        // HashMap put test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.put(i, i);
        }
        end = System.nanoTime();
        System.out.println("HashMap put: " + (end - start) / 1_000_000.0 + " ms");

        // LinkedHashMap put test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.put(i, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedHashMap put: " + (end - start) / 1_000_000.0 + " ms");

        // HashMap get test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashMap.get(i);
        }
        end = System.nanoTime();
        System.out.println("HashMap get: " + (end - start) / 1_000_000.0 + " ms");

        // LinkedHashMap get test
        start = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkedHashMap.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedHashMap get: " + (end - start) / 1_000_000.0 + " ms");
    }
}

