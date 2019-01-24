public class Reset {
    private static void reSet(int[] input){
        int i = 0;
        int j = input.length - 1;
        while (i != j){
            while (i < j && input[i] != 0){
                i++;
            }
            while (i < j && input[j] == 0){
                j--;
            }
            int temp = input[i];
            input[i] = input[j];
            input[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[]{1,0,1,0,0,1};
        reSet(ints);
        for (int a : ints){
            System.out.print(a + " ");
        }
        Object object = new Object();

    }
}
