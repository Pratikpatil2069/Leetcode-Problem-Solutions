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
    TreeNode temp;
    TreeNode ptr;
    boolean flag=true;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        if(root.left!=null){
            increasingBST(root.left);
        }
        if(flag){
            root.left=null;
            temp=root;
            ptr=root;
            flag=false;
        }else{
            root.left=null;
            temp.right=root;
            temp=root;
        }
        
        if(root.right!=null){
            increasingBST(root.right);
        }
        return ptr;   
    }
}