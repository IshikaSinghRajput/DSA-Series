class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class InsertAndDelete {

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null)
            return new TreeNode(val);
        TreeNode curr = root;

        while (true) {
            if (curr.val <= val) {
                if (curr.right != null)
                    curr = curr.right;
                else {
                    curr.right = new TreeNode(val);
                    break;
                }
            } else {
                if (curr.left != null)
                    curr = curr.left;
                else {
                    curr.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }

    public static TreeNode delete(TreeNode root, int val){
       if(root == null) return null;

       if(root.val == val) return helpInDelete(root);
       TreeNode dummy = root;

       while(root != null){
        if(root.val > val){
            if(root.left != null && root.left.val == val){
                root.left = helpInDelete(root.left);
                break;
            }
            else root = root.left;
        }
        else {
            if(root.right != null && root.right.val == val){
                root.right = helpInDelete(root.right);
                break;
            }
            else root = root.right;
        }
       }
       return dummy;
    }

    public static TreeNode helpInDelete(TreeNode root){
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;

        TreeNode rchild = root.right;
        TreeNode lastChild = findLastRight(root.left);
        lastChild.right = rchild;
        return root.left;
    }
    
    public static TreeNode findLastRight(TreeNode root){
        if(root.right == null) return root;
        return findLastRight(root.right);
    }





    public static void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(8);
        root.right.left = new TreeNode(7);

        int val = 2;

        root = delete(root, val); // 🔥 INSERT HERE

        inorder(root);

    }
}
