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
    public boolean isUnivalTree(TreeNode root) {
        return fun(root,root.val);
        
    }
    public boolean fun(TreeNode root,int num){
        if(root==null){
            return true;
        }
        if(root.val!=num){
            return false;
        }
        
         return fun(root.right,num) &&fun(root.left,num);
    }
}