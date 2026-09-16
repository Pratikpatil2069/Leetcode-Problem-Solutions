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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        insert(root, val);
        return root;
    }
    public void insert(TreeNode root, int val){
        if(root.left==null){
            if(val<root.val){
                TreeNode newNode=new TreeNode(val);
                root.left=newNode;
                return;
            }
        }

        if(root.right==null){
            if(val>root.val){
                TreeNode newNode=new TreeNode(val);
                root.right=newNode;
                return;
            }
        }

        if(val<root.val){
            insert(root.left, val);
        }else{
            insert(root.right, val);
        }
    }
}