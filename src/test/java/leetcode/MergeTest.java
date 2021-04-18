package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/1 21:57
 */
class MergeTest {

    @Test
    void insert() {
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        Merge.insert(nums, 5, 5);
        System.out.println(Arrays.toString(nums));
    }
}