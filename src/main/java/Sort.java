/**
 * @author shuxiahua
 * @Description: 排序算法
 * @date 2021/3/9 22:00
 */
public class Sort {


    static class Select {
        /**
         * @Description: 简单选择排序，O(N2) 稳定
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



    static class Insert {
        /**
         * @Description: 简单插入排序 O(n2) 稳定
         * @author liuyi
         * @date 2021/3/22 20:52
         */
        public static void simpleInsert(int[] nums) {
            if (nums.length == 1) {
                return;
            }
            for (int i = 1; i < nums.length; i++) {
                int j = i;
                while (j > 0 && nums[j-1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    j--;
                }
            }
        }
    }



    static class Exchange {
        /**
         * @Description: 冒泡排序
         * @author liuyi
         * @date 2021/3/22 21:50
         */
        public static void bubble(int[] nums) {

        }


        /**
         * @Description: 快速排序
         * @author liuyi
         * @date 2021/3/23 21:40
         */
        public static void quick(int[] nums) {
            quick(nums, 0, nums.length - 1);
        }
        private static void quick(int[] nums, int low, int high) {
            if (low >= high) {
                return;
            }
            int j = 0;
            quick(nums, low, j-1);
            quick(nums, j+1, high);
        }

        private static int partition(int[] nums, int low, int high) {
            int pivot = nums[high];
            
        }
    }

    /**
     * @Description: 归并排序
     * @author liuyi
     * @date 2021/3/25 20:29
     */
    public static void merge(int[] nums) {

    }


}