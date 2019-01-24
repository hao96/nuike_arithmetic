import java.beans.IntrospectionException;
import java.util.HashMap;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Num28 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        Map<String, Integer> map = new HashMap<>();
        for (int i  = 0; i < array.length; i++){
            if (map.get(String.valueOf(array[i])) == null){
                map.put(String.valueOf(array[i]),1);
            }else {
                map.put(String.valueOf(array[i]),map.get(String.valueOf(array[i])) + 1);
            }
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() > Math.ceil(array.length/2)){
                return Integer.valueOf(entry.getKey());
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(MoreThanHalfNum_Solution(new int[]{1}));
    }
}
