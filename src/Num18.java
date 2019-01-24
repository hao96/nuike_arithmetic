import tree.Travel;
import tree.Tree;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Num18 {
    public static void Mirror(Tree root) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            return;
        }
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left != null){
            Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
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

        Travel.preRoot(tree8);
        System.out.println();
        Mirror(null);
        Travel.preRoot(tree8);
    }



}
