class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
      List<Integer> arr = new ArrayList<>();
      Stack<TreeNode> st = new Stack<>();
      if(root!=null) st.push(root);
      while(st.size()>0){
        TreeNode  top = st.pop();
        arr.add(top.val);
        if(top.right!=null) st.push(top.right);
        if(top.left!=null) st.push(top.left);
      }
      return arr;
    }
}