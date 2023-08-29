package fundamental;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/28 21:19
 */
class CommonUtilTest {

    @Test
    void binarySearch() {
        assertEquals(4,CommonUtil.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 5));
        assertEquals(3,CommonUtil.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 4));
        assertEquals(5,CommonUtil.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 6));
        assertEquals(1,CommonUtil.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 2));
        assertEquals(7,CommonUtil.binarySearch(new int[]{1,2,3,4,5,6,7,8,9}, 8));



    }
}