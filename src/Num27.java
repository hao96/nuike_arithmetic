import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 可能有字符重复
 */
public class Num27 {
    public static ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str.length() == 0){
            return list;
        }
        fun(str.toCharArray(),list,0);
        Collections.sort(list);
        return list;
    }

    private static void fun(char[] chars , ArrayList<String> list ,int i){
        if (i > chars.length - 1){
            String str = new String(chars);
            if (!list.contains(str)){
                list.add(str);
            }
            return;
        }else{
            for (int j = i ;j < chars.length; j++){
               swap(chars,i,j);
               fun(chars,list,i+1);
               swap(chars,i,j);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        if (i != j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = Permutation("alibaba");
        System.out.println(list.size());
        for (String s : list){
            System.out.print(s + " ");
        }
    }
}

/**
 *      回溯算法 递归
 *    1: int a[n];
 *    2: try(int i)
 *    3: {
 *    4:     if(i>n)
 *    5:        输出结果;
 *    6:      else
 *    7:     {
 *    8:        for(j = 下界; j <= 上界; j=j+1)  // 枚举i所有可能的路径
 *    9:        {
 *   10:            if(fun(j))                 // 满足限界函数和约束条件
 *   11:              {
 *   12:                 a[i] = j;
 *   13:               ...                         // 其他操作
 *   14:                 try(i+1);
 *   15:               回溯前的清理工作（如a[i]置空值等）;
 *   16:               }
 *   17:          }
 *   18:      }
 *   19: }
 *
 *      回溯算法 非递归
 *
 *      int a[n],i;
 *    2: 初始化数组a[];
 *    3: i = 1;
 *    4: while (i>0(有路可走)   and  (未达到目标))  // 还未回溯到头
 *    5: {
 *    6:     if(i > n)                                              // 搜索到叶结点
 *    7:     {
 *    8:           搜索到一个解，输出；
 *    9:     }
 *   10:     else                                                   // 处理第i个元素
 *   11:     {
 *   12:           a[i]第一个可能的值；
 *   13:           while(a[i]在不满足约束条件且在搜索空间内)
 *   14:           {
 *   15:               a[i]下一个可能的值；
 *   16:           }
 *   17:           if(a[i]在搜索空间内)
 *   18:          {
 *   19:               标识占用的资源；
 *   20:               i = i+1;                              // 扩展下一个结点
 *   21:          }
 *   22:          else
 *   23:         {
 *   24:               清理所占的状态空间；            // 回溯
 *   25:               i = i –1;
 *   26:          }
 *   27: }
 *
 *
 */
