package collection;

import java.util.*;

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}

public class Main {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");

        System.out.println(cache); // {1=A, 2=B, 3=C}

        cache.get(1);
        cache.put(4, "D");

        System.out.println(cache); // {2=B, 3=C, 1=A, 4=D} (2 eng eski bo‘lgani uchun o‘chirildi)
    }
}

