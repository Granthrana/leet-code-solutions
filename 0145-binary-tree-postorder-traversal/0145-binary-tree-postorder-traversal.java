class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        post(root,l);
        return l;
    }
     void post(TreeNode root,List<Integer> l){
     if(root== null){
        return;
     }
       post(root.left, l);   
        post(root.right, l); 
        l.add(root.val);   
     }}
