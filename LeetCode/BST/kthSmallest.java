import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class kthSmallest {

    public static int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root, arr);
        return arr.get(k-1);
    }

    public static void inorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;

        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        int k = 3;
        System.out.println(kthSmallest(root, k));
    }
}
