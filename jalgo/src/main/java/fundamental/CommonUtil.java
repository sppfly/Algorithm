package fundamental;

import java.util.Arrays;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/28 20:04
 */
public class CommonUtil {


    /**
     * @Description: 二分查找
     * @author liuyi
     * @date 2021/2/28 20:05
     */
    public static int binarySearch(int[] nums, int value) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > value) {
                right = mid - 1;
            } else if (nums[mid] < value) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
