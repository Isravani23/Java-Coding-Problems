package Design;

import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache();
        cache.put(1,10);
        cache.put(2,11);
        cache.put(3,12);
        cache.put(4,13);
        cache.put(5,14);
        cache.put(6,15);
        cache.print();
    }
}