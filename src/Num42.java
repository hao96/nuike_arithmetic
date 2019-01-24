import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Num42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int j = array.length - 1;
        while(i < j){
            if ((array[i] + array[j]) == sum){
                arrayList.add(array[i]);
                arrayList.add(array[j]);
                break;
            }
            while(i < j && array[i] + array[j] > sum){j--;}
            while(i < j && array[i] + array[j] < sum){i++;}
        }
        return arrayList;
    }

    public static void main(String[] args) {
        Num42 num42 = new Num42();
        ArrayList<Integer> arrayList = num42.FindNumbersWithSum(new int[]{1,2,3,4},5);
        for (int i : arrayList){
            System.out.print(i + " ");
        }
    }
}
