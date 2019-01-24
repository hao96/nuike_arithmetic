/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */
public class Num40 {
    //num1,num2分别为长度为1的数组。传出参数
    //将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length == 0){
            return;
        }
        int temp = 0;
        for (int i : array){
            temp ^= i;
        }
        int firstBitIndex = findFirstBit(temp);
        for (int i : array){
            if (isBit(i,firstBitIndex)){
                num1[0] ^= i;
            }else{
                num2[0] ^= i;
            }
        }
    }

    private boolean isBit(int i, int firstBitIndex) {
        int num = i >> firstBitIndex;
        if ((num & 1 )==1){
            return true;
        }else {
            return false;
        }
    }

    private int findFirstBit(int num) {
        int index = 0;
        while((num & 1) == 0 && index < 32){
            num = num >> 1;
            ++index;
        }
        return index;
    }

    public static void main(String[] args) {
//        System.out.println(0^1);
//        System.out.println(1 & 1);
//        System.out.println(1 | 0);

        Num40 num40 = new Num40();
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        num40.FindNumsAppearOnce(new int[]{1,2,2,3,4,4,4,4},num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);

    }
}
