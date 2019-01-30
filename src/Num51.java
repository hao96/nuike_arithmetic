/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Num51 {
    public int[] multiply(int[] A) {
        int mul = 1;
        int[] b = new int[A.length];
        b[0] = 1;
        for (int i = 0 ; i < A.length - 1; i++){
            b[i + 1] = mul * A[i];
            mul = b[i + 1];
        }
        int temp = 1;
        for (int j = A.length - 1 ; j >= 0 ; j--){
            b[j] = b[j] * temp;
            temp = temp * A[j];
        }
        return b;
    }

    public static void main(String[] args) {
        Num51 num51 = new Num51();
        for (int a : num51.multiply(new int[]{1,2,3,4})){
            System.out.print(a + " ");
        }
    }
}
