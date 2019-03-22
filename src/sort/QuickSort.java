package sort;

import java.util.Date;
import java.util.Random;

public class QuickSort {

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
            while (low < high && input[high] <= pivot){
                high--;
            }
            input[low] = input[high];
            while (low < high && input[low] >= pivot){
                low++;
            }
            input[high] = input[low];
        }
        input[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int i = 50;
        int[] a = new int[i];
        Random random = new Random();
        for (int j = 0 ; j < i ; j++){
            a[j] = random.nextInt(7);
        }
        System.out.println(a.length);
        System.out.println(new Date() + "start !");
        quickSort.quickSort(a);
        System.out.println(new Date() + "end !");
        for (int q : a){
            System.out.print(q + " ");
        }
    }

}
