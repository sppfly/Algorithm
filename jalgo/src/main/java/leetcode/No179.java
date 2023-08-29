package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * @author shuxiahua
 * @Description: 最大数
 * @date 2021/4/12 19:50
 */
public class No179 {
    public String largestNumber(int[] nums) {
        Arrays.sort(Arrays.stream(nums).boxed().toArray(), (x, y) -> {
            if (x == y) {
                return 0;
            }
            String sx = x+"";
            String sy = y+"";
            int i = 0;
            for (; i < sx.length() && i < sy.length(); i++) {
                if ((int) sx.charAt(i) > (int) sy.charAt(i)) {
                    return -1;
                } else if ((int) sx.charAt(i) < (int) sy.charAt(i)) {
                    return 1;
                }
            }
            if (i == sx.length()) {
                return Integer.compare(sy.charAt(i), sx.charAt(i - 1));
            } else {
                return Integer.compare(sy.charAt(i - 1), sx.charAt(i));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (int i : nums) {
            sb.append(nums[i]);
        }
        return sb.toString();
    }
}
