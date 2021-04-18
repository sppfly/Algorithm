package leetcode;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/6 18:50
 */
public class No66 {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = 0; i < digits.length; i++) {
            int result = (digits[i] + carry);
            digits[i] = result%10;
            carry = result / 10;
        }
        if (carry == 1) {
            int[] o = new int[digits.length+1];
            o[0] = 1;
            digits = o;
        }
        return digits;
    }
}
