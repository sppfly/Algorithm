package arrays;

/**
 * @author shuxiahua
 * @Description: 数组依次相加
 * @date 2021/1/16 14:23
 */
public class Add {


    public static int[] add(int[] add1, int[] add2) {
        int[] longArray = add1.length > add2.length ? add1 : add2;
        int[] shortArray = add1.length > add2.length ? add2 : add1;
        int[] result = new int[longArray.length + 1];
        for (int i = 0; i < shortArray.length; i++) {
            result[i] = (shortArray[i] + longArray[i]) % 10;
            if (shortArray[i] + longArray[i] > 10) {
                longArray[i + 1] += 1;
            }
        }
        for (int i = shortArray.length; i < longArray.length; i++) {
            result[i] = longArray[i];
        }
        return result;
    }
}
