/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class Num52 {
    public boolean match(char[] str, char[] pattern) {
        if (str == null && pattern == null){
            return false;
        }
        int indexStr = 0;
        int indexPat = 0;

        return isMatch(str,indexStr,pattern,indexPat);
    }

    private boolean isMatch(char[] str, int indexStr, char[] pattern, int indexPat) {
        if (indexStr == str.length && indexPat == pattern.length){
            return true;
        }
        if (indexStr != str.length && indexPat == pattern.length){
            return false;
        }
        if ((indexPat + 1 ) < pattern.length && pattern[indexPat+1] == '*'){
            if ((indexStr != str.length && str[indexStr] == pattern[indexPat] || indexStr != str.length && pattern[indexPat + 1] == '.')){
                return isMatch(str, indexStr, pattern, indexPat + 2) || isMatch(str, indexStr + 1, pattern, indexPat + 2)||
                        isMatch(str, indexStr + 1 , pattern, indexPat);
            }else {
                return isMatch(str, indexStr, pattern, indexPat + 2);
            }
        }else {
            if ((indexStr != str.length && str[indexStr] == pattern[indexPat] || indexStr != str.length && pattern[indexPat + 1] == '.')){
                return isMatch(str, indexStr + 1, pattern, indexPat + 1);
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Num52 num52 = new Num52();
        char[] str = new char[]{'a','a','a'};

        char[] pat = new char[]{'a','b','*','a','c','*','a'};
        char[] pat1 = new char[]{'a','.','*'};
        System.out.println(num52.match(str,pat1));

    }
}
