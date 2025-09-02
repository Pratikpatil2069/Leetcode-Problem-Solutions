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
    public int sumOfLeftLeaves(TreeNode root) {
        return fun(root,false);
    }
    public int fun(TreeNode root,boolean flag){
         if(root==null){
            return 0;
        }
         if(root.left==null && root.right==null && flag){
            return root.val;
        }
         int left=fun(root.left,true);
        int right=  fun(root.right,false);
          return left+right; 
    }
}