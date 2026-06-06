class Solution {
    public TreeNode iop(TreeNode root) {
        TreeNode temp = root.left;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {
            // No child
            if (root.left == null && root.right == null)
                return null;
            // One child
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;
            // Two children
            TreeNode pred = iop(root);
            // Copy predecessor value
            root.val = pred.val;
            // Delete predecessor from left subtree
            root.left = deleteNode(root.left, pred.val);
        }
        return root;
    }
}