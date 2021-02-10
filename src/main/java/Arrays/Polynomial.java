package Arrays;

/**
 * @author shuxiahua
 * @Description: 一元多项式
 * @date 2021/1/16 13:56
 */
public interface Polynomial {

    <T extends Polynomial> boolean add(T polynomial);

    <T extends Polynomial> boolean subtract(T polynomial);

    <T extends Polynomial> boolean multiply(T polynomial);
}
