import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title:
 * @Description:
 * @date 2020/11/20 23:12
 */
class MaxSubSeqSumTest {

    @Test
    void maxSubseqSum1() {
        int[] a = {0,-1,1,3};
        Assertions.assertEquals(4,MaxSubSeqSum.MaxSubSeqSum1(a));
    }
}