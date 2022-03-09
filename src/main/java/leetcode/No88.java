package leetcode;

/**
 * 合并两个有序数组
 */
public class No88 {


    /**
     * 原地实现
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i = 0, j = 0, num = 0;
        if (m == 0) {
            while (i <nums1.length) {
                nums1[i] = nums2[j];
                i++;
                j++;
            }
            return;
        }
        while (i < nums1.length) {
            if (nums1[i] >= nums2[j]) {
                insert(nums1, i, nums2[j]);
                j++;
                num++;
            }
            i++;
            if (i == num + m){
                break;
            }
        }
        if (i <nums1.length) {
            while (i <nums1.length) {
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
    }



    private void insert(int[] nums, int loc, int val) {
        for (int i = nums.length-2; i >= loc; i--) {
            nums[i+1] = nums[i];
        }
        nums[loc] = val;
    }


    /**
     * 新建一个数组实现用空间换时间
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[nums1.length];
        while (true) {

        }
    }
}
