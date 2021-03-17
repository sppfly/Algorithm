import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/9 22:10
 */
class SortTest {

    @Test
    void simpleSelect() {
        int[] nums = new int[]{3,5,3,4,24,24,234,25,34,4,21,312,4312,45,345,23,4,1324534,563,65,86,73,54123,124,267,66,35,423,412,4,234,13};
        Sort.simpleSelect(nums);
        System.out.println(Arrays.toString(nums));
    }
}