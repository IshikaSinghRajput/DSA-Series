class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class SearchInBST {

    public static TreeNode search(TreeNode root, int val) {
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;
        }
        return root;
    }

    // A ceil is a greatest number larger or equal to the target
    public static int ceilOfTree(TreeNode root, int val){
        int ceil = -1;
        while(root != null){
            if(root.val == val){
                ceil = root.val;
                return ceil;
            }
            else if(val > root.val){
                root = root.right;
            }
            else{
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }

    // A floor is a greatest number smaller then or equal to the target
    public static int floorOfTree(TreeNode root, int val){
        int floor = -1;

        while(root != null){
            if(root.val == val){
                floor = root.val;
                return floor;
            }

            else if(val > root.val){
                floor = root.val;
                root = root.right;
            }
            else root = root.left;
        }

        return floor;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        int val = 6;
        TreeNode res = search(root, val);

        if (res != null)
            System.out.println("found " + res.val);
        else
            System.out.println("Null");

        int ans = ceilOfTree(root, val);
        System.out.println(ans);

        int jawab = floorOfTree(root, val);
        System.out.println(jawab);

    }
}