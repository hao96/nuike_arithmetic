/**
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 */
public class Num43 {
    public String LeftRotateString(String str,int n) {
        int len = str.length();
        if (len == 0){
            return "";
        }
        int i = n % len;
        String s = str + str;
        return s.substring(i,len + i);
    }

    public static void main(String[] args) {
        String str = "abcXYZdef";
        Num43 num43 = new Num43();
        System.out.println(num43.LeftRotateString(str,20));
    }
}
