class Solution {
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+ Math.max(levels(root.left),levels(root.right));
    }
    public void preorder(TreeNode root, int levels, List<Integer> arr){
        if(root==null) return;
        arr.set(levels,root.val);
        preorder(root.left,levels+1,arr);
        preorder(root.right,levels+1,arr);
    }
    public List<Integer> rightSideView(TreeNode root) {
        //  All the node which are at the rightmost in each level.
        int n = levels(root);
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(0);
        }
        preorder(root,0,arr);
        return arr;

    }
}