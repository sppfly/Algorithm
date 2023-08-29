package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shuxiahua
 * @Description: 三数之和等于0
 * @date 2021/4/6 21:44
 */
public class No15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i< nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            for(int j = i+1; j< nums.length; j++) {
                if (j > i + 1 && nums[j] == nums[j-1]) {
                    continue;
                }
                for (int k = j+1; k< nums.length; k++) {
                    if (k > j+1 && nums[k]== nums[k-1]) {
                        continue;
                    }
                    if (nums[i]+ nums[j]+ nums[k] == 0) {
                        List<Integer> level = new ArrayList<>();
                        level.add(nums[i]);
                        level.add(nums[j]);
                        level.add(nums[k]);
                        result.add(level);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4,0,0,0,0,0,0}));
    }
}

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int first = 0; first < n; ++first) {
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third = n - 1;
            int target = -nums[first];
            for (int second = first + 1; second < n; ++second) {
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}

