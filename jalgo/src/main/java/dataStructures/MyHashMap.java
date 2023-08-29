package dataStructures;

import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/22 20:50
 */
public class MyHashMap<K, V> implements Map<K, V> {

    private final int INIT_CAP = 10;

    private int size;

    private Node<K, V>[] array;

    class Node<K, V> {
        K key;
        V val;
        Node<K, V> next;
        public Node(K key, V val) {
            this.key = key;
            this.val = val;
            this.next = null;
        }
        
    }


    public MyHashMap() {
        this.size = 0;
        this.array = new Node[INIT_CAP];
    }



    private int hash(Object k) {
        return Math.abs(k.hashCode());
    }



    private int index(Object k) {
        int hash = hash(k);
        int index = hash % array.length;
        return index;
    }


    @Override
    public V put(K key, V val) {
        int index = index(key);        
        Node<K, V> n = array[index];
        if (n == null) {
            array[index] = new Node<K, V>(key, val);
        } else {
            Node current = n;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<K,V>(key, val);
        }
        return val;
    }

    
    private Node<K,V> getNode(Object key) {
        int index = index(key);
        Node<K,V> node = array[index];
        if (node.key.equals(key)) {
            return node;
        } else {
            // 遍历链表
            Node cur = node.next;
            while (cur != null) {
                if (cur.val.equals(key)) {
                    return cur;
                }
                cur = cur.next;
            }
            return null;
        }
    }

    @Override
    public V get(Object key) {
        Node<K,V> n = getNode(key);
        return n == null ? null : n.val;
    }


    public static void main(String[] args) {
        MyHashMap<Integer, Integer> map = new MyHashMap<>();
        int N = 100;
        Random random = new Random();
        Integer[] nums = new Integer[N];
        for (int i=0; i<N; i++) {
            Integer test = random.nextInt();
            nums[i] = test;
            map.put(test, test);
        }
        for (int i=0; i<N; i++) {
            Integer v = map.get(nums[i]);
            System.out.println("key = " + nums[i] + " val = " + v);
        }
    }






    

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public boolean containsKey(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public boolean containsValue(Object arg0) {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public Set<Entry<K, V>> entrySet() {
        // TODO Auto-generated method stub
        return null;
    }




    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public Set<K> keySet() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void putAll(Map<? extends K, ? extends V> arg0) {
        // TODO Auto-generated method stub
        
    }


    @Override
    public V remove(Object arg0) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public Collection<V> values() {
        // TODO Auto-generated method stub
        return null;
    }

}
