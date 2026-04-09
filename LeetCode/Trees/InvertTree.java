class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;

    }
}

public class InvertTree {

    public static TreeNode invertTree(TreeNode root){
        if(root == null) return null;

        //Swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }

    public static void display(TreeNode root){
        if(root == null) return;

        System.out.print(root.val + " ");

        display(root.left);
        display(root.right);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        display(root);
        System.out.println();
        invertTree(root);
        display(root);
    }
}
