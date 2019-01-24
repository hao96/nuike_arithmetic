import java.util.HashMap;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）
 */
public class Num34 {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>(10000);
        for (int i = 0 ; i < str.length() ; i++){
            if (map.containsKey(str.charAt(i))){
                int temp = map.get(str.charAt(i));
                map.put(str.charAt(i),++temp);
            }else {
                map.put(str.charAt(i),1);
            }
        }

        for (int j = 0 ; j < str.length(); j++){
            if (map.get(str.charAt(j)) == 1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Num34 num34 =  new Num34();
        System.out.println(num34.FirstNotRepeatingChar("abcdcae"));
    }
}
