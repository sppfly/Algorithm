package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/14 11:49
 */
class ArrayTest {

    @Test
    void kthMax() {
        List list = Arrays.asList(6,5,9,8,2,1,7,3,4);
        Assertions.assertEquals(5, Array.kthMax(list, 5));
        Assertions.assertEquals(2, Array.kthMax(Arrays.asList(1,2,3), 2));
    }
}