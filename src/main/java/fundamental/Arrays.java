package fundamental;

/**
 * @author shuxiahua
 * @version 1.0.0
 * @Title: Array
 * @Description: 简单的数组方法
 * @date 2020/11/6 21:18
 */
public class Arrays {

    /**
    * @Description: 找到数组元素的最大值
    * @author liuyi
    * @date 2020/11/6 21:29
    */
    public static Double findMax(Double[] a) {
        Double max = a[0];
        for(int i = 1; i<a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    /**
    * @Description: 找到数组元素的平均值
    * @author liuyi
    * @date 2020/11/6 21:38
    */
    public static Double average(Double[] a) {
        Double average = 0.0;
        return average;
    }

    /**
    * @Description: 复制一个数组
    * @author liuyi
    * @date 2020/11/6 21:43
    */
    public static Double[] copy(Double[] a) {
        Double[] b = new Double[a.length];
        for(int i =0; i<a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    /**
    * @Description: 反转一个数组
    * @author liuyi
    * @date 2020/11/15 17:12
    */
//    public static Double[] reverse(Double[] a) {
//        for(int i=0; i<a.length; i++) {
//             n
//        }
//        return a;
//    }
}
