package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/10 16:28
 */
public class Array {


    /**
    * @Description: 删除数组中的重复元素
    * @author liuyi
    * @date 2021/2/10 16:30
    */
    public int removeDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

        }
        return 0;
    }


    /**
    * @Description: 判断是否有重复元素 已通过 T64 M60
    * @author liuyi
    * @date 2021/2/12 12:31
    */
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    /**
    * @Description: 判断是否有重复元素 已通过 T48 M53
    * @author liuyi
    * @date 2021/2/12 12:38
    */
    public boolean containsDuplicateStream(int[] nums) {
        if (nums == null) {
            return false;
        }
        if (java.util.Arrays.stream(nums).distinct().count() < nums.length) {
            return true;
        }
        return false;
    }


    /**
    * @Description: 判断唯一不重复的数字，利用set，通过T23 M38
    * @author liuyi
    * @date 2021/2/13 18:10
    */
    public int singleNumberBySet(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }
        return (int) set.toArray()[0];
    }

    /**
    * @Description: 判断唯一不重复的数字，利用异或，通过T99 M73
    * @author liuyi
    * @date 2021/2/13 18:18
    */
    public int singleMemberByXOR(int[] nums) {
        int e = 0;
        for (int i : nums) {
            e = e ^ i;
        }
        return e;
    }

    /**
     * @Description: 寻找列表的中位数，利用分治法
     * @author liuyi
     * @date 2021/2/14 11:17
     */
    public int median(List<Integer> nums) {
        return kthMax(nums, (int) Math.ceil((double)nums.size()/2));
    }

    /**
     * @Description: 找到列表的第k大的数，利用分治法,核心逻辑在于三个if else和递归的k值传递
     * 没有用数组实现是因为数组是有初始容量的
     * @author liuyi
     * @date 2021/2/14 11:19
     */
    public static int kthMax(List<Integer> nums, int k) {
        //利用nums的第一个数字将数组分为两个部分
        int criteria = nums.get(0);
        List<Integer> larger = new ArrayList<>(), smaller = new ArrayList<>();
        nums.forEach( e -> {
            if (e > criteria) {
                larger.add(e);
            } else if (e < criteria) {
                smaller.add(e);
            }
        });
        if (larger.size() > k - 1) {
            return kthMax(larger, k);
        } else if (larger.size() == k - 1) {
            return criteria;
        } else {
            return kthMax(smaller, k - 1 - larger.size());
        }
    }
}
