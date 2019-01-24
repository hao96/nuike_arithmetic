import java.util.ArrayList;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Num22 {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> rootList = new ArrayList<>();
        ArrayList<Integer> dataList = new ArrayList<>();

        if (root == null){
            return dataList;
        }else {
            rootList.add(root);
            dataList.add(root.val);
        }

        int index = 0;
        while(index < rootList.size()){
            TreeNode treeNode = rootList.get(index);
            if (treeNode.left != null){
                rootList.add(treeNode.left);
                dataList.add(treeNode.left.val);
            }
            if (treeNode.right != null){
                rootList.add(treeNode.right);
                dataList.add(treeNode.right.val);
            }
            index++;
        }

        return dataList;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode3.left = treeNode5;
        treeNode3.right = treeNode6;

        ArrayList<Integer> list = PrintFromTopToBottom(null);
        for (int i : list){
            System.out.print(i + " ");
        }
    }
}
