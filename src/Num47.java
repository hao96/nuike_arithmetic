/**
 * 求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Num47 {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean b = (n > 0) && ((sum = sum + Sum_Solution(n-1)) > 0);
        return sum;
    }

    public static void main(String[] args) {
        Num47 num47 = new Num47();
        System.out.println(num47.Sum_Solution(0));
    }
}
