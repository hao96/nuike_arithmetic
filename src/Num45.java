import java.util.Arrays;

/**
 * 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 */
public class Num45 {
    public boolean isContinuous(int [] numbers) {
        int numZero = 0;
        int numInterval = 0;
        int len = numbers.length;
        if (len == 0){
            return false;
        }
        Arrays.sort(numbers);
        for (int i = 0 ; i < len ; i++){
            if (numbers[i] == 0){
                numZero++;
                continue;
            }
            if (i + 1 < len){
                if (numbers[i] == numbers[i + 1]){
                    return false;
                }
                numInterval = numInterval + numbers[i + 1] - numbers[i] - 1;
            }
        }
        if ( numZero >= numInterval){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Num45 num45 = new Num45();
        System.out.println(num45.isContinuous(new int[]{}));
    }
}
