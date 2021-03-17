/**
 * @author shuxiahua
 * @Description: 排序算法
 * @date 2021/3/9 22:00
 */
public class Sort {




    /**
     * @Description: 简单选择排序，N2
     * @author liuyi
     * @date 2021/3/9 22:01
     */
    public static void simpleSelect(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j< nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            if (nums[minIndex] < nums[i]) {
                int t = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i]=t;
            }
        }
    }

}
