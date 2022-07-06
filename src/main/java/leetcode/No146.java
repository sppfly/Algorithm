package leetcode;

import java.util.HashMap;

public class No146 {
    class LRUCache {


        int size;

        int capacity;

        HashMap<Integer,Node> map;


        // 辅助节点
        Node head;
        Node recent;

        class Node {

            
            @Override
            public String toString() {
                return "Node [val=" + val + "]";
            }
            int key;
            int val;
            Node next;
            Node prev;
            
            public Node() {
            }

            public Node(int key, int val) {
                this.key = key;
                this.val = val;
            }
        }

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;
            this.map = new HashMap<>(capacity);
            this.head = new Node();
            this.recent = head;
        }

        public int get(int key) {
            Node node = map.get(key);
            if (node == null) return -1;
            if (node == recent) return node.val;
            // 将此节点放在链表最下面
            node.prev.next = node.next;
            node.next.prev = node.prev;
            node.prev = recent;
            recent.next = node;
            node.next = null;
            recent = node;
            return node.val;
        }

        public void put(int key, int value) {
            Node node = new Node(key, value);
            recent.next = node;
            node.prev = recent;
            node.next = null;
            recent = node;

            if (size == capacity) {
                Node least = head.next;
                head.next = least.next;
                least.next.prev = head;
                least = null;
                map.remove(least.key);
                size--;
            }
            map.put(key, node);
            size++;
        }

        @Override
        public String toString() {
            Node cur = head;
            StringBuilder sb = new StringBuilder();
            while (cur != null) {
                sb.append(cur.val + " -> ");
                cur = cur.next;
            }
            cur = recent;
            StringBuilder sb1 = new StringBuilder();
            while (cur != null) {
                sb1.append(cur.val + " -> ");
                cur = cur.prev;
            }
            return "LRUCache [capacity=" + capacity + ", head=" + head + ", map=" + map + ", recent=" + recent
                    + ", size=" + size + ", list= { "+ sb.toString() + "} " + sb1.toString() + " ]";
        }

        
    }

    public static void main(String[] args) {
        No146 no146 = new No146();
        LRUCache lCache = no146.new LRUCache(2);
        lCache.put(1, 1);
        System.out.println(lCache);

        lCache.put(2, 2);
        System.out.println(lCache);
        System.out.println(lCache.get(1));
        System.out.println(lCache);
        lCache.put(3, 3);
        System.out.println(lCache);
        System.out.println(lCache.get(2));
        System.out.println(lCache);
        lCache.put(4, 4);
        System.out.println(lCache);
        System.out.println(lCache.get(1));
        System.out.println(lCache);
        System.out.println(lCache.get(3));
        System.out.println(lCache);
        System.out.println(lCache.get(4));
        System.out.println(lCache);

    }

}
