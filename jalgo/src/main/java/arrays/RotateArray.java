package arrays;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2021/1/3 22:43
 */
public class RotateArray {

    /**
     * 暴力法旋转数组, T:O(k*n) S: O(1)
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums,  int k) {
        while (k>0) {
            rotateForOne(nums);
            k--;
        }
    }

    private static void rotateForOne(int[] nums) {
        int last = nums[nums.length-1];
        for (int i = nums.length-2; i>=0; i--) {
            nums[i+1] = nums[i];
        }
        nums[0] = last;
    }

    /**
    * @Description:翻转法旋转数组，T:O(n) S:O(1)
    * @author liuyi
    * @date 2021/1/3 23:13
    */
    public static void rotate4(int[] nums, int k) {
        k = k % nums.length;
//        reverse(nums);
//        reverse(nums, k);
    }

    /**
     *
     * @param nums
     * @param start
     * @param end
     */
    private static void reverse(int[] nums, int start, int end) {
        for (; start < end; start++) {
            int temp = nums[start];
            nums[start] = nums[end-start];
            nums[end-start] = temp;
        }
    }




}
