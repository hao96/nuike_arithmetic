/**
 * 输入一个整数数组，判断该数组是不是某 ！二叉搜索树！的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Num23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0){
            return false;
        }
        if (sequence.length == 1){
            return true;
        }

        return verify(sequence,0,sequence.length - 1);
    }

    private boolean verify(int[] sequence, int start, int end) {
        if (start >= end){
            return true;
        }
        int tem = end;
        while (tem > start && sequence[tem - 1] > sequence[end]){
            tem--;
        }
        for (int j = start ; j < tem - 1 ; j++){
            if (sequence[j] > sequence[end]){
                return false;
            }
        }
        return verify(sequence,start,tem-1) && verify(sequence,tem,end - 1);
    }
}
