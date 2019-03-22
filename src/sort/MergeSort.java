package sort;

public class MergeSort {
    public int[] sort(int[] arr , int low, int high){
        int mid = (high + low)/2;
        if (low < high){
            sort(arr,low,mid);
            sort(arr,mid+1,high);

            merge(arr,low,mid,high);
        }
        return arr;
    }

    private void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high){
            if (arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }

        for (int n = 0 ; n < temp.length ; n++){
            arr[low + n] = temp[n];
        }

//        System.arraycopy(temp,0,arr,low,temp.length);

    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,2,4,5,1,7};
        MergeSort mergeSort = new MergeSort();
        int[] a = mergeSort.sort(arr,0,arr.length - 1);
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}
