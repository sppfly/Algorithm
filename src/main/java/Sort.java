import java.util.Arrays;

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
            int j = partition(nums, low, high);
            quick(nums, low, j-1);
            quick(nums, j+1, high);
        }

        private static int partition(int[] nums, int low, int high) {
            int pivot = nums[high];
            int i = low, j = high - 1;
            while(true) {
                while (nums[i] < pivot) {
                    i++;
                }
                while (nums[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    swap(nums, i, j);
                    i++;
                    j--;
                } else {
                    break;
                }
            }
            swap(nums, high, j+1);
            return j+1;
        }


    }

    /**
     * @Description: 归并排序
     * @author liuyi
     * @date 2021/3/25 20:29
     */
    public static void merge(int[] nums) {
        int[] temp = new int[nums.length];
        merge(nums, temp, 0, nums.length-1);
    }

    private static void merge (int[] nums, int[] result, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        merge(nums, result, low, mid);
        merge(nums, result, mid+1, high);
        doMerge(nums, result, low, mid, high);
    }

    /**
     * 合并两个有序数组，再把这些东西拷回去
     * @param nums
     * @param result
     * @param low
     * @param mid
     * @param high
     */
    private static void doMerge(int[] nums, int[] result, int low, int mid, int high) {
        int i = low, j = mid + 1, index = 0;
        while (i<=mid && j<=high) {
            if (nums[i] > nums[j]) {
                result[index] = nums[j++];
            } else {
                result[index] = nums[i++];
            }
            index++;
        }
        if (i==mid+1) {
            while (j<=high) {
                result[index++] = nums[j++];
            }
        } else {
            while (i<=mid) {
                result[index++] = nums[i++];
            }
        }
        index = 0;
        while (index <= high-low) {
            nums[low+index] = result[index];
            index++;
        }
    }


    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
