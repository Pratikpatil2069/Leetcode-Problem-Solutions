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
    TreeNode temp=new TreeNode(-1);
    public void flatten(TreeNode root) {
        createList(root);
    }
    private void createList(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode left=root.left;
        TreeNode right=root.right;
        temp.right=root;
        temp=temp.right;
        root.left=null;
       
        createList(left);
        createList(right);
    }
}