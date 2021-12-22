package arrays;

/**
 * @author shuxiahua
 * @Description: 普通的基于数组的一元多项式
 * @date 2021/1/16 13:58
 */
public class OrdinaryPolynomial implements Polynomial {



    private int[] coefficients;

    public OrdinaryPolynomial(int[] coefficients) {
        this.coefficients = coefficients;
    }


    @Override
    public <T extends Polynomial> boolean add(T polynomial) {
        return false;
    }

    @Override
    public <T extends Polynomial> boolean subtract(T polynomial) {
        return false;
    }

    @Override
    public <T extends Polynomial> boolean multiply(T polynomial) {
        return false;
    }
}
