package sort;

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
        QuickSort quickSort = new QuickSort();
        int[] a = new int[]{4,5,1,6,2,7,3,8};
        quickSort.quickSort(a);
        for (int i : a){
            System.out.print(i + " ");
        }
    }

}
