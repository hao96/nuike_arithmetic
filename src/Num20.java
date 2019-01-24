import java.util.ArrayList;
import java.util.List;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Num20 {

    List<Integer> dataList = new ArrayList<>();
    List<Integer> minList = new ArrayList<>();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        dataList.add(node);
        if (node < min){
            minList.add(node);
            min = node;
        }else{
            minList.add(min);
        }
    }

    public void pop() {
        int end = dataList.size() - 1;
        dataList.remove(end);
        minList.remove(end);
        min = minList.get(dataList.size()-1);
    }

    public int top() {
        return minList.get(dataList.size() - 1);
    }

    public int min() {
        return min;
    }

    public static void main(String[] args) {
        Num20 num20 = new Num20();
        num20.push(3);
        num20.push(5);
        num20.push(2);
        num20.push(6);
        num20.push(4);

        System.out.println(num20.min());
        num20.pop();
        num20.pop();
        num20.pop();
        System.out.println(num20.top());
        System.out.println(num20.min());
    }
}
