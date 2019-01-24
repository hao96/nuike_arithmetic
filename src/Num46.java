/**
 * 约瑟夫环问题：
 * n个人坐成一圈，按顺时针由1开始给他们编号。然后由第一个人开始报数，数到m的人出局。现在需要求的是最后一个出局的人的编号。
 *
 * f(1,m) = 0;             (n=1)
 * f(n,m)=(f(n-1,m)+m)%n; （n>1）
 *
 */
public class Num46 {

    public int LastRemaining_Solution(int n, int m) {
       if (n <= 0 || m <= 0){
           return -1;
       }
       int last = 0;
       for (int i = 2 ; i <= n ; i++ ){
           last = (last + m)%i;
       }
       return last;
    }

    public int getResult(int n, int m) {
        if (n < 0 || m < 0) {
            return -1;
        }
        int last = 0;
        for(int i=2;i<=n;++i){
            last = (last+m)%i;
        }
        // 因为实际编号为(1~n)
        return (last+1);
    }

    public static void main(String[] args) {
        Num46 num46 = new Num46();
        System.out.println(num46.LastRemaining_Solution(0,0));
        System.out.println(num46.getResult(5,3));
    }

}
