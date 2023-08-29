package leetcode;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/6 18:31
 */
public class No283 {


    public void moveZeroes(int[] nums) {
        int i = 0, j = 0;
        while (true) {
            while (nums[j] != 0) j++;
            while (nums[i] == 0) i++;
            if (i > j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                break;
            }
        }
    }
}
