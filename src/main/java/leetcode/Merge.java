package leetcode;

/**
 * 合并两个有序数组
 */
public class Merge {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                insert(nums1, i, nums2[j]);
                j++;
            }
        }
        if (j!=n) {
            while (j<n) {
                nums1[++i] = nums2[j++];
            }
        }
    }


    public static void insert(int[] nums, int position, int value) {
        for (int i = nums.length - 2; i > position; i--) {
            nums[i+1] = nums[i];
        }
        nums[position] = value;
    }
}