class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        pre(root,l);
        return l;
    }
    void pre(TreeNode root,List<Integer>l){
        if(root!=null){
            l.add(root.val);
            pre(root.left,l);
                pre(root.right,l);
            
        }
    }
}