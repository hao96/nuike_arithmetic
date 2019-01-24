/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * 思想：一个整数n（n>0）与n-1 做按位与运算，最左边的1会变成0
 *
 */
public class Num11 {
    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(0));
    }
}
