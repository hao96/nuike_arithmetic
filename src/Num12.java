/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 */
public class Num12 {
    /**
     * 时间复杂度为 O（n）  不对
     * @param base
     * @param exponent
     * @return
     */
    public static double Power1(double base, int exponent) {
        int ex = Math.abs(exponent);
        if (base == 0 && exponent < 0){
            throw new RuntimeException("0 不能为分母！");
        }
        double mi = 1;
        for (int i = 0 ; i < exponent ; i++){
            mi = base * base;
        }
        if (exponent < 0){
            return 1/mi;
        }
        return mi;
    }

    /**
     * 时间复杂度 O(logn)
     * @param base
     * @param exponent
     * @return
     */
    public static double Power2(double base , int exponent){
        if (exponent == 0 && base != 0){
            return 1;
        }

        if (exponent == 1){
            return base;
        }

        if (base == 0 && exponent > 0){
            return 0;
        }
        if (base == 0 && exponent < 0){
            throw new RuntimeException("0 不能为分母！");
        }

        int n = exponent;

        if (exponent < 0){
            n = -exponent;
        }

        double result = Power2(base,n>>1);
        result *= result;

        if ((n&1) == 1){
            result *= base;
        }
        if (exponent < 0){
            result = 1/result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Power2(5.5,5));
    }
}
