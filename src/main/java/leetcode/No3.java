package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shuxiahua
 * @Description: 无重复字符的最长子串
 * @date 2021/3/15 22:12
 */
public class No3 {


    /**
     * @Description:
     * @author liuyi
     * @date 2021/3/15 22:12
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            int thisMax = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (set.add(s.charAt(j))) {
                    thisMax++;
                } else {
                    break;
                }
            }
            max = Math.max(max, thisMax);
        }
        return max;
    }

}
