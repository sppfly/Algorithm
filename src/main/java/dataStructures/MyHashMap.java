package dataStructures;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/22 20:50
 */
public class MyHashMap<K, V> implements Map<K, V> {

    private static int hash(String s) {
        int h = 0;
        if (s == null) {
            return h;
        }
        for (int i=0; i<s.length(); i++) {
            h = h << 5 + s.charAt(i);
        }
        return h;
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
    public V get(Object arg0) {
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
    public V put(K arg0, V arg1) {
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
