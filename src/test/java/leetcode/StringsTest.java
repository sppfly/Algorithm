package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/2/11 12:09
 */
class StringsTest {

    @Test
    void reverseInteger() {
        Strings.reverseInteger(1534236469);
    }

    @Test
    void test() {
        String[] array = new String[5];
        array[0] = "blue";
        array[1] = "blues";
        array[2] = "red";
        array[3] = "re";
        array[4] = "x";
        Strings.longestCommonPrefix(array);
    }
}