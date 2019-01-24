/**
 * 句子反转  “student. a am I” -> “I am a student.”
 */
public class Num44 {
    public String ReverseSentence(String str) {
        if (str == null || "".equals(str) || str.trim().length() == 0){
            return str;
        }
        String[] strings = str.split(" ");
        int len = strings.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = len ; i > 0  ; i--){
            stringBuilder.append(strings[i-1]);
            if (i > 1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Num44 num44 = new Num44();
        System.out.println("|" + num44.ReverseSentence("  ") + "|");
    }
}
