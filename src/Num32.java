import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class Num32 {
    public String PrintMinNumber(int [] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++){
            arrayList.add(numbers[i]);
        }
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });

        for (int i : arrayList){
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Num32 num32 = new Num32();
        System.out.println(num32.PrintMinNumber(new int[]{2,1,3}));
    }
}
