package dataStructures;

import java.util.Map;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/22 20:50
 */
public class MyHashMap implements MyMap {

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


    public static void main(String[] args) {
        int m = hash("this is a fuck line");
        System.out.println(m);
    }
}
