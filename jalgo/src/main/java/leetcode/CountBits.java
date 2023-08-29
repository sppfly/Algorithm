package leetcode;

/**
 * @author shuxiahua
 * @Description: 338 比特位计数
 * @date 2021/3/3 19:39
 */
public class CountBits {


    /**
     * @Description: 简单解法，用位运算计算1的个数
     * @author liuyi
     * @date 2021/3/3 19:39
     */
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for(int i = 0; i <= num; i++) {
            result[i] = countOne(i);
        }
        return result;
    }

    private static int countOne(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }


    public static int[] countBits1(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num ; i++) {
            result[i] = result[i / 2] + i % 2;
        }
        return result;
    }
}
