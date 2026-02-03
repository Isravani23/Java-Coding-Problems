package Design;

import java.util.HashMap;

public class LRUCache {
    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity = 5;
    Node head, tail;
    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }


    //put
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertTOHead(node);
        } else {
            if (map.size() == capacity) {
                Node lru = tail.prev;
                map.remove(lru.key);
                remove(lru);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertTOHead(newNode);

        }

    }

    private void insertTOHead(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void print() {
        Node curr = head.next;
        while (curr != null) {
            System.out.print("[" + curr.key + "=" + curr.value + "] ");
            curr = curr.next;

        }
    }

}
/*
import java.util.*;

class LRUCache {

    private final int capacity = 5;
    private Map<Integer, Integer> map;
    private LinkedList<Integer> dll; // acts as doubly linked list

    public LRUCache() {
        map = new HashMap<>();
        dll = new LinkedList<>();  // Java LinkedList is Doubly Linked List
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        // move key to front (MRU)
        dll.remove((Integer) key);
        dll.addFirst(key);

        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            dll.remove((Integer) key);
        } else {
            if (dll.size() == capacity) {
                int lru = dll.removeLast();   // remove from tail
                map.remove(lru);
            }
        }

        dll.addFirst(key);
        map.put(key, value);
    }

    public void printCache() {
        System.out.print("LRU -> ");
        for (Integer key : dll) {
            System.out.print("[" + key + "=" + map.get(key) + "] ");
        }
        System.out.println("<- MRU");
    }
}

*/
