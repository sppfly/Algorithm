package sort;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] nums = new Integer[10];

    }


    int divide(Integer[] nums, int x) {
        Integer[] t1 = new Integer[nums.length];
        Integer[] t2 = new Integer[nums.length];
        int i = 0, j = 0;
        for (int m = 0; m < nums.length; m++) {
            if (nums[m] <= x) t1[i++] = nums[m];
            else t2[j++] = nums[m];
        }
        for (int m = 0; m < i -1; m++) {
            nums[m] = t1[m];
        }
        for (int m = 0; m < j; m++) {
            nums[i++] = t2[m];
        }

        return i - 1;
    }

    public void sort(Integer[] nums, int l, int r) {
        if (l >= r) return;
        int x = nums[l];
        int i = divide(nums, x);
        sort(nums, l, i);
        sort(nums, i + 1, r);
    }

    public void sort(Integer[] nums) {
        sort(nums, 0, nums.length);
    }
}
