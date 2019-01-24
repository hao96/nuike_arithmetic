/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Num37 {
    public int GetNumberOfK(int [] array , int k) {
        return binSearch(array,k+0.5) - binSearch(array,k-0.5);
    }

    private int binSearch(int[] array, double num) {
        int s = 0;
        int e = array.length - 1;

        while(s <= e){
            int mid = (e - s) / 2 + s;
            if (array[mid] < num){
                s = mid + 1;
            }else if (array[mid] > num){
                e = mid - 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Num37 num37 = new Num37();
        System.out.println(num37.GetNumberOfK(new int[]{1,2,2,2,3,3},2));
    }
}
