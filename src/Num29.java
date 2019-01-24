import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Num29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k > input.length){
            return null;
        }
        quickSort(input);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++){
            list.add(input[i]);
        }
        return list;
    }

    public void quickSort(int[] input){
        qSort(input,0,input.length-1);
    }

    private void qSort(int[] input, int low, int high) {
        if (low < high){
            int pivot = partition(input,low,high);
            qSort(input,0,pivot-1);
            qSort(input,pivot + 1,high);
        }
    }

    private int partition(int[] input, int low, int high) {
        int pivot = input[low];
        while (low < high){
            while (low < high && input[high] >= pivot){
                high--;
            }
            input[low] = input[high];
            while (low < high && input[low] <= pivot){
                low++;
            }
            input[high] = input[low];
        }
        input[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        Num29 num29 = new Num29();
        int[] i = new int[]{4,5,1,6,2,7,3,8};
        ArrayList<Integer> arrayList = num29.GetLeastNumbers_Solution(i,4);
        for (int a : arrayList){
            System.out.print(a + " ");
        }
    }

}
