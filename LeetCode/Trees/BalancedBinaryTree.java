class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;

    }
}

public class BalancedBinaryTree {

    public static int height(TreeNode root){
        if(root == null) return 0;

        int lh = height(root.left);
        if(lh == -1) return -1;
        int rh = height(root.right);
        if(rh == -1) return -1;

        if(Math.abs(lh - rh) > 1) return -1;
        return Math.max(lh, rh) + 1;
     }

    public static boolean isBalanced(TreeNode root){
        return height(root) != -1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(isBalanced(root));
    }
}
