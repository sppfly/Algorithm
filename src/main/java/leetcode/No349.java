package leetcode;


import java.util.HashSet;
import java.util.Set;

/**
 * 求数组的交集
 */
public class No349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            for (int j: nums2) {
                if (i == j) {
                    set.add(i);
                }
            }
        }
        return new int[1];
    }
}
