package princeton.PQ;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class MaxPQTest {
    
    @Test
    public void maxPQTest() throws Exception {
        MaxPQ maxPq = new MaxPQ(1000);
        Random random = new Random();
        for (int i=0; i<1000; i++) {
            maxPq.insert(random.nextInt(10000));
        }
        int[] actual = new int[1000];
        int[] expect = new int[1000];
        for (int i=999; i>-1; i--) {
            actual[i] = maxPq.delMax();
        }
        System.arraycopy(actual, 0, expect, 0, 1000);
        Arrays.sort(expect);
        assertArrayEquals(expect, actual);
    }
}
