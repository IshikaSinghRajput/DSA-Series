class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    };

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;

    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class DFS {

    public static void preorderTraversal(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void postorderTraversal(TreeNode root) {
        if (root == null)
            return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        preorderTraversal(root);
        System.out.println();
        inorderTraversal(root);
        System.out.println();
        postorderTraversal(root);

    }
}