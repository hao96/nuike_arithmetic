

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Num13 {
    public static void reOrderArray(int[] a) {
//        int i = 0;
//        int j = 0;
//        while(i < array.length){
//            while (i<array.length && !isEvall(array[i])){
//                i++;
//            }
//            j = i + 1;
//            while (j<array.length && isEvall(array[j])){
//                j++;
//            }
//            if (j < array.length){
//                int temp = array[j];
//                for (int n = j ; n >= i ; n--){
//                    array[n] = array[n - 1];
//                }
//                array[i++] = temp;
//            }else{
//                //!!!!
//                break;
//            }
//        }

        if(a==null||a.length==0)
            return;
        int i = 0,j;
        while(i<a.length){
            while(i<a.length&&!isEven(a[i])){
                i++;
            }
            j = i+1;
            while(j<a.length&&isEven(a[j])){
                j++;
            }
            if(j<a.length){
                int tmp = a[j];
                for (int j2 = j-1; j2 >=i; j2--) {
                    a[j2+1] = a[j2];
                }
                a[i++] = tmp;
            }else{// 查找失敗
                break;
            }
        }

    }

    private static boolean isEvall(int i) {
        if (i % 2 == 0){
            return true;
        }
        return false;
    }

    private static boolean isEven(int i) {
        if (i % 2 == 0){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] a = {2,4,6,1,3,5,7};
        reOrderArray(a);
//        System.out.println(a.length);
        printArr(a);
    }

    private static void printArr(int[] a) {
        for (int i : a){
            System.out.println(i);
        }
    }

}
