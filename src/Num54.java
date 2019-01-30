/**
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Num54 {

    private static int[] occurence  = new int[256];
    private static int index = 0;

    static {
        for (int i = 0 ; i < 256 ; i++){
            occurence[i] = -1;
        }
    }

    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if (occurence[ch] == -1){
            occurence[ch] = index;
        }else if (occurence[ch] >= 0){
            occurence[ch] = -2;
        }
        index++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char ch = '\0';
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0 ; i < 256 ; i++){
            if (occurence[i] >= 0 && occurence[i] < minIndex){
                ch = (char) i;
                minIndex = occurence[i];
            }
        }
        if (ch == '\0'){
            return '#';
        }
        return ch;
    }

    public static void main(String[] args) {
        Num54 num54 = new Num54();
        num54.Insert('h');
        num54.Insert('e');
//        num54.Insert('l');
//        num54.Insert('l');
//        num54.Insert('o');
//        num54.Insert('w');
//        num54.Insert('o');
//        num54.Insert('r');
//        num54.Insert('l');
//        num54.Insert('d');

        System.out.println(num54.FirstAppearingOnce());
    }
}
