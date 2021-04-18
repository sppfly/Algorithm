package leetcode;

import edu.princeton.cs.algs4.In;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shuxiahua
 * @Description: 森林中兔子的最少个数
 * @date 2021/4/4 15:59
 */
public class No781 {
    /**
     * @Description: 利用Hash表
     * @author liuyi
     * @date 2021/4/4 16:00
     */
    public int numRabbits(int[] answers) {
        //the result
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : answers) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= entry.getKey() + 1) {
                count+=Math.ceil(entry.getValue() / (entry.getKey() + 1)) * (entry.getKey() + 1) ;
            } else {
                count+=entry.getKey()+1;
            }
        }
        return count;
    }
}
