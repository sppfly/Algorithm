package Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/1/17 21:23
 */
class AddTest {

    @Test
    void add() {


        Assertions.assertEquals(Add.add(new int[]{1}, new int[]{1}), new int[] {2});
    }
}