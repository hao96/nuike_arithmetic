package tree;

/**
 * 遍历树
 */
public class Travel {
    /**
     * 时间复杂度 O(n)  空间复杂度为 O(n)
      * @param root
     */
    public static void preRoot(Tree root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preRoot(root.left);
        preRoot(root.right);
    }

    public static void main(String[] args) {
        Tree tree8 = new Tree(8);
        Tree tree6 = new Tree(6);
        Tree tree10 = new Tree(10);
        Tree tree5 = new Tree(5);
        Tree tree7 = new Tree(7);
        Tree tree9 = new Tree(9);
        Tree tree11 = new Tree(11);

        tree6.left = tree5;
        tree6.right = tree7;
        tree10.left = tree9;
        tree10.right = tree11;
        tree8.left = tree6;
        tree8.right = tree10;

        preRoot(tree8);
    }
}
