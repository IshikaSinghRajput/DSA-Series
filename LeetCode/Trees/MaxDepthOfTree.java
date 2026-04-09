class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;

    }
}

public class MaxDepthOfTree {

    public static int heightOfTree(TreeNode root) {
        if (root == null)
            return 0;

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(heightOfTree(root));
    }
}
