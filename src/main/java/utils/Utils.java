package utils;
public class Utils {

    public static void swap(int nums[], int i, int j) {
        int c = nums[i];
        nums[i] = nums[j];
        nums[j] = c;
    }
}
