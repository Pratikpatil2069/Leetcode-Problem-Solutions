/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            boolean x1=false;
            boolean y1=false;
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();
                if(temp.left!=null && temp.right!=null){
                     if((temp.left.val==x && temp.right.val==y) || (temp.left.val==y && temp.right.val==x)){
                    return false;
                }
                }
               
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                if(x==temp.val){
                    x1=true;
                }
                if(y==temp.val){
                    y1=true;
                }
            }
            if(x1 && y1){
                return true;
            }
        }

        return false;
    }
}