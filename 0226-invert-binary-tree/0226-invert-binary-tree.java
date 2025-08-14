class Solution {
    public TreeNode invertTree(TreeNode root) {
       if(root==null){
        return null;
       }
       Queue<TreeNode>queue=new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()){
        TreeNode temp=queue.poll();
        TreeNode left1=temp.left;
        temp.left=temp.right;
        temp.right=left1;
        if(temp.left!=null){
            queue.add(temp.left);
        }
        if(temp.right!=null){
            queue.add(temp.right);
        }
       }
       return root;
    }
}
