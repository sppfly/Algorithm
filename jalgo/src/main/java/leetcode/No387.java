package leetcode;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/**
 * 字符串中的第一个唯一字符
 */
public class No387 {

    public int firstUniqChar(String s) {
        if (s.length() <=1) {
            return s.length();
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        Character c = null;
        for (Map.Entry<Character, Integer> e: map.entrySet()) {
            if (e.getValue() == 1) {
                c = e.getKey();
                break;
            }
        }
        if (c == null) {
            return -1;
        }
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }



    public int firstUniqChar1(String s) {
        if (s.length() <=1) {
            return s.length();
        }
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.remove(s.charAt(i));
            } else {
                map.put(s.charAt(i), i);
            }
        }
        if (map.isEmpty()) {
            return -1;
        }
        return Collections.min(map.values());
    }

}
