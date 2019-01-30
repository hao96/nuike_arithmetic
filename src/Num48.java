/**
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Num48 {
    public int Add(int num1,int num2) {
        while(num2 != 0){
            int sum = num1 ^ num2;
            int carray = (num1 & num2) << 1;
            num1 = sum;
            num2 = carray;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println(new Num48().Add(0,1));
    }
}
